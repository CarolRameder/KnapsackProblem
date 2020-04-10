package com.company;

public class Book implements Item {

    private String title;
    private int numberOfPages;
    private int value;

    public Book(){
        this.title = "random";
        this.numberOfPages = 200;
        this.value = 1;
    }

    public Book(String title,int numberOfPages,int value){
        this.title = title;
        this.value = value;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public Integer getWeight() {
        return numberOfPages/100;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", value=" + value +
                '}';
    }

}
