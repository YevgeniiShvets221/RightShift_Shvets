package com.company;

import java.util.Arrays;

public class RightShift {
    public static void main(String args[]) {
        int[] array = {10, 20, 30};
        int n = 2;
        System.out.println( "Array " + Arrays.toString( array ) );
        ShiftToRight( array, n );
        int[] array2 = {10, 20, 30, 40, 50};
        int p = 4;
        int k =4;
        System.out.println( "Array " + Arrays.toString( array2 ) );
        ShiftToRight( array2, p );
        ShiftToRight( array2, k );
        int[] array3 = {10, 20, 30, 40, 50};
        int g =4;
        System.out.println( "Array " + Arrays.toString( array2 ) );
        ShiftToRight( array3, g );

    }

    public static void ShiftToRight(int a[], int n) {
        int temp = a[n];

        for (int i = n; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        System.out.println( "Array after shifting to right by one : " + Arrays.toString( a ) );


        }
    }
