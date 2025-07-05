package com.learn.java8;

public class FindMinInArray {
    public static int min(int[] arr) {
        if(arr == null || arr.length < 2){
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 4, 7, 3};
        System.out.println("The minimum number is: " + min(arr));
    }
}
