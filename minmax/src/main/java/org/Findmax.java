package org;

public class Findmax {

    public Integer findmaxInt(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (max.compareTo(num2) < 0)
            max = num2;
        if (max.compareTo(num3) < 0)
            max = num3;

        return max;
    }

    public Float findmaxFloat(Float num1, Float num2, Float num3) {
        Float max = num1;

        if (max.compareTo(num2) < 0)
            max = num2;
        if (max.compareTo(num3) < 0)
            max = num3;

        return max;
    }
}
