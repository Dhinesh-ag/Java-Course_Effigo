package service;
import java.math.BigDecimal;

public class CashAccount extends TradeAccount {
    private BigDecimal cashBalance;

    // Constructor
    public CashAccount(String id, BigDecimal cashBalance) {
        super(id);
        this.cashBalance = cashBalance;
    }

    // Getter for cashBalance
    public BigDecimal getCashBalance() {
        return cashBalance;
    }

    // Setter for cashBalance
    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    // Override clone method
    @Override
    public TradeAccount clone() {
        return new CashAccount(this.getId(), this.cashBalance);
    }
}
