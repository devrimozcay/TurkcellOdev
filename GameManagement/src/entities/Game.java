package entities;

public class Game {
    private int id;
    private String name;
    private double cost;
    private int countofManager;

    public Game() {
    }

    public Game(int id, String name, double cost, int countofManager) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.countofManager = countofManager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCountofManager() {
        return countofManager;
    }

    public void setCountofManager(int countofManager) {
        this.countofManager = countofManager;
    }
}
