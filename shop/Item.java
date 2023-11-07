package shop;

public class Item {
    private int ItemID;
    private float price;
    private String Category;

    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
