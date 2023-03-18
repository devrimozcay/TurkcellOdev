package entities;


public class User {
    private String uName;
    private String email;
    private String pswrd;

    public User() {
    }

    public User(String uName, String email, String pswrd) {
        this.uName = uName;
        this.email = email;
        this.pswrd = pswrd;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswrd() {
        return pswrd;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }
}
