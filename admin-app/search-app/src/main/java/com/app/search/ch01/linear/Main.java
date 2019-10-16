package com.app.search.ch01.linear;

public class Main {

    public static void main(String[] args) {
        String target = "B";
        String[] data = {"B", "C", "D", "A"};
        int index = findIndex(data, target);
        System.out.println(index);
    }


    //O(n)
    private static int findIndex(String[] data, String target){
        for(int i=0;i<data.length;i++){
            String tmp = data[i];
            if(tmp.equals(target)){
                return i;
            }
        }
        return -1;
    }
}
