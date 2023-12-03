package org;

import java.util.Collections;
import java.util.*;

public class Findmax<T extends Comparable<T>> {
    private List<T> values;

    public Findmax() {
    }

    public Findmax(T... values) {
        this.values = Arrays.asList(values);
    }

    public T findMax() {
        List<T> sortedValues = values;
        Collections.sort(sortedValues);
        return sortedValues.getLast();
    }

    public static <E extends Comparable<E>> E findmax(E num1, E num2, E num3) {
        E max = num1;

        if (max.compareTo(num2) < 0)
            max = num2;
        if (max.compareTo(num3) < 0)
            max = num3;

        return max;
    }

}
