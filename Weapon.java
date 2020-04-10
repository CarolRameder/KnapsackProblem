package com.company;

public class Weapon implements Item{

    private WeaponType type;
    private int weight;
    private int value;

    public Weapon(WeaponType type, int weight, int value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    public Weapon() {
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return type.toString();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type=" + type +
                ", weight=" + weight +
                ", value=" + value +
                '}';
    }
}
