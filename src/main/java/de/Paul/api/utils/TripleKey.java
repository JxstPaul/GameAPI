package de.Paul.api.utils;

import java.util.Objects;

public class TripleKey<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    public TripleKey(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripleKey<?, ?, ?> tripleKey = (TripleKey<?, ?, ?>) o;
        return Objects.equals(first, tripleKey.first) &&
                Objects.equals(second, tripleKey.second) &&
                Objects.equals(third, tripleKey.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }
}
