package service;
import java.math.BigDecimal;

public class MarginAccount extends TradeAccount {
    private BigDecimal margin;

    // Constructor
    public MarginAccount(String id, BigDecimal margin) {
        super(id);
        this.margin = margin;
    }

    // Getter for margin
    public BigDecimal getMargin() {
        return margin;
    }

    // Setter for margin
    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    // Override clone method
    @Override
    public TradeAccount clone() {
        return new MarginAccount(this.getId(), this.margin);
    }
}
