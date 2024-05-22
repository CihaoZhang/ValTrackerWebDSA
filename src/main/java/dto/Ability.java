package dto;

public class Ability {
    private String name;

    private String description;

    private int usage;

    private int cost;

    private int damage;

    private Button button;

    public Ability(String name, String description, int usage, int cost, int damage, Button button) {
        this.name = name;
        this.description = description;
        this.usage = usage;
        this.cost = cost;
        this.damage = damage;
        this.button = button;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return
            "Name: " + name + "\n" +
            "Description: " + description + "\n" +
            "Usage: " + usage + "\n" +
            "Cost: " + cost + "\n" +
            "Damage: " + damage + "\n" +
            "Button: " + button + "\n";
    }
}
