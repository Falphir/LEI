package net.tiago.ex3;

public class UnorderedPair<T extends Comparable> extends Pair<T> {

    public UnorderedPair() {
        setFirst(null);
        setSecond(null);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            UnorderedPair<T> otherPair =
                    (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst())
                    && getSecond().equals(otherPair.getSecond()))
                    || (getFirst().equals(otherPair.getSecond())
                    && getSecond().equals(otherPair.getFirst()));
        }
    }

    public UnorderedPair(T firstItem, T secondItem) {
        super(firstItem, secondItem);
    }
}
