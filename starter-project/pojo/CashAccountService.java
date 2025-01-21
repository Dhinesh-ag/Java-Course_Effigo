package pojo;

import java.math.BigDecimal;
import repository.TradeAccountRepository;
import service.CashAccount;

public class CashAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    // Constructor
    public CashAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) repository.retrieveTradeAccount(id);
        if (account != null) {
            account.setCashBalance(account.getCashBalance().add(amount));
            repository.updateTradeAccount(account);
        } else {
            System.out.println("Account not found for ID: " + id);
        }
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) repository.retrieveTradeAccount(id);
        if (account != null) {
            if (account.getCashBalance().compareTo(amount) >= 0) {
                account.setCashBalance(account.getCashBalance().subtract(amount));
                repository.updateTradeAccount(account);
            } else {
                System.out.println("Insufficient balance for ID: " + id);
            }
        } else {
            System.out.println("Account not found for ID: " + id);
        }
    }

    // Create TradeAccount
    public void createTradeAccount(CashAccount account) {
        repository.createTradeAccount(account);
    }

    // Retrieve TradeAccount
    public CashAccount retrieveTradeAccount(String id) {
        TradeAccount account = repository.retrieveTradeAccount(id);
        if (account instanceof CashAccount) {
            return (CashAccount) account;
        }
        System.out.println("No CashAccount found for ID: " + id);
        return null;
    }

    // Update TradeAccount
    public void updateTradeAccount(CashAccount account) {
        repository.updateTradeAccount(account);
    }

    // Delete TradeAccount
    public void deleteTradeAccount(String id) {
        repository.deleteTradeAccount(id);
    }
}
