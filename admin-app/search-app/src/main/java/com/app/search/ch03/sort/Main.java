package com.app.search.ch03.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[10];
        for(int i=0;i<dogs.length;i++){
            dogs[i] = new Dog(i);
        }

        System.out.println(Arrays.toString(dogs));
        int index = Arrays.binarySearch(dogs, new Dog(9));
        //int index = Arrays.binarySearch(dogs, new Dog(9), new MyComparator());
        System.out.println(index);

    }
}
