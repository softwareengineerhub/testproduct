package com.app.search.ch03.sort;

import java.util.Comparator;

public class MyComparator implements Comparator {

    public int compare(Object a, Object b) {
        System.out.println(a+"-?-"+b);
        Comparable c1 = (Comparable) a;
        Comparable c2 = (Comparable) b;
        return -(c1.compareTo(c2));

        //return 0;

        //return -1;//a.compareTo(b);
    }
}
