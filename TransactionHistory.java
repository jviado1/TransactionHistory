// /*

// ** Class Name: TransactionHistory 

// ** Author: Joab Amos D. Viado

// ** Date Created: 06/28/2023

// ** Purpose: Shows the history of transactions made, by storing the tickers, dates,transaction types, transaction quantities, and cost basis of stock.

// */

public class TransactionHistory {
    private String ticker;
    private String transDate;
    private String transType;
    private double qty;
    private double costBasis;

    public TransactionHistory() {
        ticker = "none";
        transDate = "none";
        transType = "none";
        qty = 0.0;
        costBasis = 0.0;
    }

    public TransactionHistory(String ticker, String transDate, String transType, double qty, double costBasis) {
        this.ticker = ticker;
        this.transDate = transDate;
        this.transType = transType;
        this.qty = qty;
        this.costBasis = costBasis;
    }

    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTransDate() {
        return transDate;
    }
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }
    public void setTransType(String transType) {
        this.transType = transType;
    }

    public double getQty() {
        return qty;
    }
    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getCostBasis() {
        return costBasis;
    }
    public void setCostBasis(double costBasis) {
        this.costBasis = costBasis;
    }
}