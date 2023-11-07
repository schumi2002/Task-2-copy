package shop;

public class Order {
    private Customer customer;
    private String location;
    private Receipt receipt;

    public Customer getCustomer() {
        return customer;
    }

    final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public float fee() {
        float amt = receipt.amount();
        return amt * 3.25f;
    }
}
