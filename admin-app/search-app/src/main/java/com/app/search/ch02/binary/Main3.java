package com.app.search.ch02.binary;

import java.util.Arrays;
import java.util.Comparator;

public class Main3 {


    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        cats[0] = new Cat("A", 0);
        cats[1] = new Cat("A", 1);
        cats[2] = new Cat("A", 2);
        cats[3] = new Cat("A", 3);
        cats[4] = new Cat("A", 4);
        cats[5] = new Cat("A", 5);
        cats[6] = new Cat("A", 6);
        cats[7] = new Cat("A", 7);
        cats[8] = new Cat("A", 8);
        cats[9] = new Cat("A", 9);

        int index = findIndex(cats, new Cat("A", 4));
        System.out.println("index="+index);
        System.out.println("----------------------------");
        cats = new Cat[10];
        cats[0] = new Cat("A", 0);
        cats[1] = new Cat("B", 0);
        cats[2] = new Cat("C", 0);
        cats[3] = new Cat("D", 0);
        cats[4] = new Cat("E", 0);
        cats[5] = new Cat("F", 0);
        cats[6] = new Cat("G", 0);
        cats[7] = new Cat("H", 0);
        cats[8] = new Cat("I", 0);
        cats[9] = new Cat("J", 0);
        index = findIndex(cats, new Cat("F", 0));
        System.out.println("index="+index);

        System.out.println("---------------------------");
        /*index = Arrays.binarySearch(cats, new Cat("J", 0), new Comparator<Cat>() {

            public int compare(Cat a, Cat b) {
                return compareCats(a, b);
            }
        });
        System.out.println("index="+index);*/
        System.out.println("----------------------------");
        index = Arrays.binarySearch(cats, new Cat("J", 0));
        System.out.println("index="+index);
    }

    public static int findIndex(Cat[] cats, Cat target){
        int left = 0;
        int right = cats.length-1;
        int middle = 0;
        while(left<=right){
            middle = (left+right)/2;
            Cat tmp = cats[middle];
            System.out.println(middle+" ; "+tmp);


            int flag = compareCats(tmp, target);
            if(flag==0){
                return middle;
            }
            if(flag<0){
                right=middle-1;
            }
            if(flag>0){
                left = middle+1;
            }

        }
        return -1;
    }

    private static int compareCats(Cat a, Cat b){
        if(a.getAge()!=b.getAge()){
            return b.getAge()-a.getAge();
        }

        if(a.getName()==null && b.getName()==null){
            return 0;
        }

        if(a.getName()==null){
            return -1;
        }

        if(b.getName()==null){
            return 1;
        }

        return b.getName().compareTo(a.getName());
    }
}
