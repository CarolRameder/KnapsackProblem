package com.company;

public interface Item extends Comparable<Item>{

    String getName();
    Integer getWeight();
    Integer getValue();

    default Double getProfitFactor(){
        return ((double)getValue()/(double)getWeight());
    }

    @Override
    default int compareTo(final Item other) {
        if(this.getName().equals(other.getName())){
            return (int) (this.getProfitFactor()-other.getProfitFactor());
        }
        return this.getName().compareTo(other.getName());
    }

}
