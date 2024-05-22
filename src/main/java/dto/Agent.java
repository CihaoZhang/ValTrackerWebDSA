package dto;

public class Agent {

    private String name;
    private String role;
    private String lore;
    private Ability[] Abilities = new Ability[4];
    private Ability ability;

    public Agent(String name, String role, String lore, Ability ability) {
        this.name = name;
        this.role = role;
        this.lore = lore;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getLore() {
        return lore;
    }

    public Ability getAbilities() {
        return ability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public void setAbilities(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", lore='" + lore + '\'' +
                ", Abilities='" + ability + '\'' +
                '}';
    }

    public void addAbility(Ability ability) {
        for (int i = 0; i < Abilities.length; i++) {
            if (Abilities[i] == null) {
                Abilities[i] = ability;
                break;
            }
        }
    }

    public void replaceAbility(int index, Ability ability) {
        Abilities[index] = ability;
    }

    public void removeAbility(int index) {
        Abilities[index] = null;
    }

    public Ability getAbility(Button button) {
        if (button == ability.getButton()) {
            return ability;
        }
        return null;
    }


}
