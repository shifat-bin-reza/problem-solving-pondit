import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 30, 4, 50};

        // Problem 1
        System.out.println("Problem 1: " + problem1(array));

        // Problem 2
        System.out.println("Problem 2: " + problem2(array));

        // Problem 3
        problem3(array);

        // Problem 4
        problem4(array);

        // Problem 5
        System.out.println("Problem 5: " + problem5(5));

        // Problem 6
        boolean isPalindrome = problem6("madam");
        if(isPalindrome) {
            System.out.println("Problem 6: Palindrome");
        } else {
            System.out.println("Problem 6: Not Palindrome");
        }

        // Problem 7
        boolean isPrime = problem7(7);
        if(isPrime) {
            System.out.println("Problem 7: Prime");
        } else {
            System.out.println("Problem 7: Not Prime");
        }

        // Problem 8
        System.out.println("Problem 8: " + problem8(5));
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
    // Factorial Calculation: Write a program to calculate the factorial of a given number.*** + recursive solution.
    public static int problem5(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * problem5(n - 1);
        }
    }

    // Problem 6
    // Palindrome Check: Check if a given string is a palindrome. (use char string)
    public static boolean problem6(String str) {
        int leftChar = 0;
        int rightChar = str.length() - 1;
        while(leftChar < rightChar) {
            if(str.charAt(leftChar) != str.charAt(rightChar)) {
                return false;
            }
            leftChar++;
            rightChar--;
        }
        return true;
    }

    // Problem 7
    // Prime Number Check: Determine whether a given number is prime.
    public static boolean problem7(int num) {
        if(num < 2) {
            return false;
        }
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Problem 8
    // Fibonacci Series: Generate and print the first N elements of the Fibonacci series.**** + recursive solution.
    public static int problem8(int num) {
        if(num <= 1) {
            return 1;
        } else {
            return problem8(num-1) + problem8(num-2);
        }
    }

}