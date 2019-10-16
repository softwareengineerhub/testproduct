package com.app.search.ch02.binary;

public class Main2 {

    public static void main(String[] args) {
        //System.out.println("A".compareTo("B"));
        //System.out.println("B".compareTo("A"));

        System.out.println("AAFAFA".compareTo("ZSGSGSGV"));

        String[] data = {"A","B","C","D","E","F","G","H","I","J"};
        int res=findIndex(data, "F");
        System.out.println("RES="+res);
    }

    public static int findIndex(String[] data, String target){
        int left = 0;
        int right = data.length-1;
        int middle = 0;
        while(left<=right){
            middle = (left+right)/2;
            String tmp = data[middle];
            int flag = tmp.compareTo(target);
            if(flag==0){
                return middle;
            }
            if(flag<0){
                left = middle+1;
            }

            if(flag>0){
                right = middle-1;
            }

        }
        return -1;
    }
}
