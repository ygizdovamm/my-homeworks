package data_structuretasks;

import java.util.Arrays;

public class SumOfArray {

    public static void main(String[] args) {
        int arr[] = new int[] {2, 7, 15, 22, 31, 101};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Array sum = " +  sum);
    }

}
