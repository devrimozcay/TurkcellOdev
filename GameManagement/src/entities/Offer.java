package entities;

public class Offer {
    private int id;
    private String offerName;

    public Offer() {
    }

    public Offer(int id, String offerName) {
        this.id = id;
        this.offerName = offerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }
}
