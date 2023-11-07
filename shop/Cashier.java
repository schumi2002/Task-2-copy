package shop;

import java.util.Objects;

public class Cashier extends Person {
    private int emplID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return emplID == cashier.emplID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), emplID);
    }

    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }


}
