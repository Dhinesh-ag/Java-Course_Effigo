package pojo;
import java.math.BigDecimal;

import repository.TradeAccountRepository;
import service.MarginAccount;

public class MarginAccountService implements TradeAccountService {
    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) repository.retrieveTradeAccount(id);
        if (account != null) {
            account.setMargin(account.getMargin().add(amount));
            repository.updateTradeAccount(account);
        }
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) repository.retrieveTradeAccount(id);
        if (account != null) {
            account.setMargin(account.getMargin().subtract(amount));
            repository.updateTradeAccount(account);
        }
    }

    public void createTradeAccount(MarginAccount account) {
        repository.createTradeAccount(account);
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount account) {
        repository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id) {
        repository.deleteTradeAccount(id);
    }
}
