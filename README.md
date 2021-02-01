# KnapsackProblem

Consider a knapsack of a given capacity and a set of items that could be added in the knapsack, for example books, food, weapons, etc. Each item has at least the following properties: a name, a weight and a value.
The name of a weapon is actually its type, described by an enum. The weight of a book is computed as the number of pages divided by 100. The value of a food is computed as its weight multiplied by 2.
The profit factor of an item is defined as value / weight.
The problem is to determine what items to include in the knapsack such that:

the total weight of the selected items is less than or equal to the capacity and
the total value is as large as possible.

tasks : 
Create an object-oriented model of the problem. You should have at least the following: the interface Item, and the classes Book, Food, Weapon, Knapsack.
The classes Book, Food and Weapon should implement the interface Item. The interface should have at least one default method, for example profitFactor.
Create and print on the screen the instance of the problem described in the previous example. When printing the content of the knapsack, the items must be ordered according to their name (the natural order).
