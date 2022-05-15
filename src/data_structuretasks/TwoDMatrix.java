package data_structuretasks;

import java.util.Arrays;

public class TwoDMatrix {
    public static void TwoDMatrix(int arr[][]) {

        for (int n = 0; n < arr.length; n++) {
            System.out.println(Arrays.toString(arr[n]));
        }

    }

    public static void main(String args[]) {
        int arr[][] = {{12, 65, 25},
                {32, 58, 45},
                {3, 85, 215},
                {8, 11, 133}};
        TwoDMatrix(arr);
    }
}