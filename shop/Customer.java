package shop;

public interface customerTemp {
    int getCID();
    void setCID(int CID);

}

public class Customer extends Person {

    private int CID;

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }
}
