package data_structuretasks;

import java.util.Arrays;

public class BiggestElement {
    public static void main(String args[]){
        int array[] = {5, 30, 55, 78, 99, 56};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array: "+Arrays.toString(array));
        int res = array[size-1];
        System.out.println("biggest element is: "+res);
    }
}