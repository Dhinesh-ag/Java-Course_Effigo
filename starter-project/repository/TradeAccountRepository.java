package repository;
import java.util.HashMap;
import java.util.Map;

public class TradeAccountRepository {
    private Map<String, TradeAccount> datastore = new HashMap<>();

    // Create a TradeAccount
    public void createTradeAccount(TradeAccount account) {
        this.datastore.put(account.getId(), account.clone());
    }

    // Retrieve a TradeAccount
    public TradeAccount retrieveTradeAccount(String id) {
        return this.datastore.get(id) == null ? null : this.datastore.get(id).clone();
    }

    // Update a TradeAccount
    public void updateTradeAccount(TradeAccount account) {
        this.datastore.put(account.getId(), account.clone());
    }

    // Delete a TradeAccount
    public void deleteTradeAccount(String id) {
        this.datastore.remove(id);
    }
}
