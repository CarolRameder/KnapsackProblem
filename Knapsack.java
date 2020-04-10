package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Knapsack {

    private int capacity;
    private int available_capacity;
    private Set<Item> itemSet = new TreeSet<>();

    public Knapsack() {
    }

    public Knapsack(int capacity) {
        this.capacity = capacity;
        this.available_capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItemList() {
        return new ArrayList<>(itemSet);
    }

    public boolean addItem(Item item) {
        if (item.getWeight() > available_capacity) {
            return false;
        }
        itemSet.add(item);
        available_capacity -= item.getWeight();
        return true;
    }

    @Override
    public String toString() {
        return "capacity of knapsack = " + capacity;
    }
}
