import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import pojo.CashAccountService;
import pojo.MarginAccountService;
import repository.TradeAccountRepository;

public class Main {
    static Path[] paths = new Path[] {
        Paths.get("data/accounts.txt"),
        Paths.get("data/transactions.txt")
    };

    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

    public static void main(String[] args) {
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void loadTradeAccounts() throws IOException {
        List<String> lines = Files.readAllLines(paths[0]);
        for (String line : lines) {
            String[] parts = line.split(",");
            String accountType = parts[0];
            String id = parts[1];
            BigDecimal balance = new BigDecimal(parts[2]);

            if (accountType.equals("CASH")) {
                CashAccount cashAccount = new CashAccount(id, balance);
                cashAccountService.createTradeAccount(cashAccount);
            } else if (accountType.equals("MARGIN")) {
                BigDecimal margin = new BigDecimal(parts[3]);
                MarginAccount marginAccount = new MarginAccount(id, balance, margin);
                marginAccountService.createTradeAccount(marginAccount);
            }
        }
    }

    public static void applyTransactions() throws IOException {
        List<String> lines = Files.readAllLines(paths[1]);
        for (String line : lines) {
            String[] parts = line.split(",");
            String accountType = parts[0];
            String transactionType = parts[1];
            String accountId = parts[2];
            BigDecimal amount = new BigDecimal(parts[3]);

            if (accountType.equals("CASH")) {
                if (transactionType.equals("DEPOSIT")) {
                    cashAccountService.deposit(accountId, amount);
                } else if (transactionType.equals("WITHDRAW")) {
                    cashAccountService.withdraw(accountId, amount);
                }
            } else if (accountType.equals("MARGIN")) {
                if (transactionType.equals("DEPOSIT")) {
                    marginAccountService.deposit(accountId, amount);
                } else if (transactionType.equals("WITHDRAW")) {
                    marginAccountService.withdraw(accountId, amount);
                }
            }
        }
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " +
            cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println("Account E3456F Cash Balance: " +
            cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println("Account I5678J Cash Balance: " +
            cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " +
            marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " +
            marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }
}
