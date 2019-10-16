package com.app.search.ch02.binary;

public class Main {

    public static void main(String[] args) {


        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};



        int index = findIndex(data, -1);
        System.out.println(index);
    }

    public static int findIndex(int[] data, int target) {
        int left = 0;
        int right = data.length-1;
        while (left <= right) {

            int middle = (right + left) / 2;
            System.out.println(String.format("[%s;%s;%s]", left, middle, right));

            if (data[middle] == target) {
                return middle;
            }
            if (data[middle] < target) {
                left = middle+1;
            }
            if (data[middle] > target) {
                right = middle-1;
            }

        }
        return -1;
    }

}
