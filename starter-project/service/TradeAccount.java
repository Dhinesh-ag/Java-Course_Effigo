package service;
import java.math.BigDecimal;

public abstract class TradeAccount {
    private String id;

    // Constructor
    public TradeAccount(String id) {
        this.id = id;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Abstract method clone
    public abstract TradeAccount clone();
}
