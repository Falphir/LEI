package net.tiago.ex3;

public class Pair<T extends Comparable>{
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T firstItem, T secondItem) {
        first = firstItem;
        second = secondItem;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return ("first: " + first.toString() + "\n" +"second: " + second.toString());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Pair otherPair = (Pair) otherObject;
            return (first.equals(otherPair.first) && second.equals(otherPair.second));
        }
    }

    public T max() {
        if(first.compareTo(second) >= 0)
            return first;
        else
            return second;
    }
}
