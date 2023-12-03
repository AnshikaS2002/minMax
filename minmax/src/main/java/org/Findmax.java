package org;

public class Findmax<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;

    public Findmax() {
    }

    public Findmax(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T findMax() {
        return Findmax.findmax(this.var1, this.var2, this.var3);
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
