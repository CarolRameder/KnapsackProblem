package com.company;

public class Problem {

    public Problem(){

    }

    public void simulation(){
        Knapsack knapsack = new Knapsack(10);
        Book book1 = new Book("Dragon Rising",300,5);
        Book book2 = new Book("A Blade in the Dark",300,5);
        Food food1 = new Food("Cabbage",2);
        Food food2 = new Food("Rabbit",2);
        Weapon weapon = new Weapon(WeaponType.SWORD,5,10);
        knapsack.addItem(book1);
        knapsack.addItem(weapon);
        knapsack.addItem(food1);
        System.out.println(knapsack);
        System.out.println("available items:");
        System.out.println("   "+book1);
        System.out.println("   "+book2);
        System.out.println("   "+food1);
        System.out.println("   "+food2);
        System.out.println("   "+weapon);
        System.out.println("selected items: " + knapsack.getItemList());
    }
}
