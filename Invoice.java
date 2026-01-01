package session13_Gioi1;

public class Invoice {
    private String invoiceCode;
    private double amount;

    public Invoice() {
    }

    public Invoice(String invoiceCode, double amount) {
        this.invoiceCode = invoiceCode;
        this.amount = amount;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{code='" + invoiceCode + "', amount=" + amount + "}";
    }
}

