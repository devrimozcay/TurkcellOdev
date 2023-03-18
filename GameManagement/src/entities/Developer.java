package entities;

public class Developer  extends  User{
    private int specifityId;

    public Developer() {
    }

    public Developer(String uName, String email, String pswrd, int specifityId) {
        super(uName, email, pswrd);
        this.specifityId = specifityId;
    }

    public int getSpecifityId() {
        return specifityId;
    }

    public void setSpecifityId(int specifityId) {
        this.specifityId = specifityId;
    }
}
