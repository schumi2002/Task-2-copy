package shop;

import java.util.List;


public interface shopTemp {
    List<Supplier> getSuppliers();
    List<LoyalCard> getLoyaltyCards();
    void resign(Cashier x);
}
public class Shop implements shopTemp {
    private List<Cashier> employees;
    private List<LoyalCustomer> loyalCustomers;
    private List<LoyalCard> loyaltyCards;
    private List<Supplier> suppliers;
    private List<Item> items;


    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Cashier> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Cashier> employees) {
        this.employees = employees;
    }

    public List<LoyalCustomer> getLoyalCustomers() {
        return loyalCustomers;
    }

    public void setLoyalCustomers(List<LoyalCustomer> loyalCustomers) {
        this.loyalCustomers = loyalCustomers;
    }

    public List<LoyalCard> getLoyaltyCards() {
        return loyaltyCards;
    }

    public void setLoyaltyCards(List<LoyalCard> loyaltyCards) {
        this.loyaltyCards = loyaltyCards;
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void resign(Cashier x) {
        employees.removeIf(i -> i.equals(x));
    }

}
