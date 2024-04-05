package org.wishlist;

public class Wish implements Comparable<Wish> {
    private String name;

    public Wish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Wish other) {
        return this.name.compareTo(other.name);
    }
}
