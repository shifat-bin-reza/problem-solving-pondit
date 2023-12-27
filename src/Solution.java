import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 30, 4, 50};
        System.out.println("Problem 1: " + problem1(array));
        System.out.println("Problem 2: " + problem2(array));
        problem3(array);
        problem4(array);
        System.out.println("Problem 5: " + problem5(5));
    }

    // Problem 1
    // Sum of Array Elements: Write a program to find the sum of all elements in an array.
    public static int problem1(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Problem 2
    // Largest Element in Array: Find and print the largest element in an array.
    public static int problem2(int[] array) {
        int max = array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Problem 3
    //Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
    public static void problem3(int[] array) {
        int even = 0;
        int odd = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Problem 3: " + "Total Even Numbers: " + even + ", Total Odd Numbers: " + odd);
    }

    // Problem 4
    // Reverse an Array: Reverse the elements of an array.
    public static void problem4(int[] array) {
        System.out.print("Problem 4: ");
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Problem 5
    public static int problem5(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * problem5(n - 1);
        }
    }
}