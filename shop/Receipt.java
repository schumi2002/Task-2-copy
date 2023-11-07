package shop;

import java.util.List;

public class Receipt {
    private List<Item> items;
    private Customer customer;
    private Cashier cashier;

    private int registerNum;

    public int getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(int registerNum) {
        this.registerNum = registerNum;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    @Override
    public String toString() {
        return "Items: " + items + ", Price: " + amount;
    }

    public float amount() {
        float amount = 0;
        for (Item i : items) {
            amount += i.getPrice();
        }
        return amount;
    }
}
