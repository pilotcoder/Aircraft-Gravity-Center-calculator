package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aricraft {
    private  final Long id = 1L;

    private  String name;

    final int[] ints = new int[2];

    public Aricraft(String name) {
        this.name = name;
        this.ints[0] = 1;
        this.ints[1] = 2;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getInts() {
        return ints;
    }

    @Override
    public String toString() {
        return "Aricraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ints=" + Arrays.toString(ints) +
                '}';
    }
}