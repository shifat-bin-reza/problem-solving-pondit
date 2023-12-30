import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 30, 4, 50, 4, 1};

        // Problem 1
        System.out.println("Problem 1: " + problem1(array));

        // Problem 2
        System.out.println();
        System.out.println("Problem 2: " + problem2(array));

        // Problem 3
        System.out.println();
        problem3(array);

        // Problem 4
        System.out.println();
        problem4(array);

        // Problem 5
        System.out.println();
        System.out.println("Problem 5: " + problem5(5));

        // Problem 6
        System.out.println();
        boolean isPalindrome = problem6("madam");
        if(isPalindrome) {
            System.out.println("Problem 6: Palindrome");
        } else {
            System.out.println("Problem 6: Not Palindrome");
        }

        // Problem 7
        System.out.println();
        boolean isPrime = problem7(7);
        if(isPrime) {
            System.out.println("Problem 7: Prime");
        } else {
            System.out.println("Problem 7: Not Prime");
        }

        // Problem 8
        System.out.println();
        System.out.println("Problem 8: " + problem8(5));

        // Problem 9
        System.out.println();
        boolean isAvailable = problem9(array, 4);
        if(isAvailable) {
            System.out.println("Problem 9: Found the element");
        } else {
            System.out.println("Problem 9: Not Found the element");
        }

        // Problem 10
        System.out.println();
        int available = problem10(array, 30);
        if(available == -1) {
            System.out.println("Problem 10: Search Element not found");
        } else {
            System.out.println("Problem 10: Search Element found at index "+available);
        }

        // Problem 11
        System.out.println();
        boolean isDuplicate = problem11(array);
        if(isDuplicate) {
            System.out.println("is the duplicate element");
        } else {
            System.out.println("Problem 11: There is no duplicate element");
        }

        // Problem 12
        System.out.println();
        problem12("Bangladesh");

        // Problem 13
        System.out.println();
        problem13(2);

        // Problem 14
        System.out.println();
        int[][] m1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] m2 = {
                {26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45},
                {46, 47, 48, 49, 50}
        };
        int[][] res = problem14(m1, m2);
        System.out.println("Problem 14: ");
        for(int i=0; i<res.length; i++) {
            for (int j=0; j<res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        // Problem 15
        System.out.println();
        System.out.println("Problem 15: " + problem15(array));

        // Problem 16
        System.out.println();
        if(problem16(1900)) {
            System.out.println("Problem 16: Leap Year");
        } else {
            System.out.println("Problem 16: Not a Leap Year");
        }

        // Problem 17
        System.out.println();
        problem17();

        // Problem 18
        System.out.println();
        problem18("apple");

        // Problem 19
        System.out.println();
        problem19(1634);

        // Problem 20
        System.out.println();
        problem20(array);

        // Problem 21
        System.out.println();
        System.out.println("Problem 21: " + problem21(1000, 5.0, 2));

        // Problem 22
        System.out.println();
        problem22(25, 77);

        // Problem 23
        System.out.println();
        problem23('$');

        // Problem 24
        System.out.println();
        System.out.println("Problem 24: " + problem24(array));

        // Problem 25
        System.out.println();
        System.out.println("Problem 25: " + problem25("sh1fa5t1"));

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

    // Problem 9
    // Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)
    public static boolean problem9(int[] array, int search) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == search) {
                return true;
            }
        }
        return false;
    }

    // Problem 10
    // Binary Search: Implement binary search for a sorted array
    public static int problem10(int[] array, int search) {
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        while(low <= high) {
            int middle = (low+high) / 2;
            if(array[middle] == search) {
                return middle;
            } else if(search > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    // Problem 11
    // Duplicate Elements: Find and print duplicate elements in an array.
    public static boolean problem11(int[] array) {
        ArrayList<Integer> duplicateData = new ArrayList<>();
        for(int i=0; i < array.length-1; i++) {
            for(int j=i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicateData.add(array[i]);
                }
            }
        }
        if (!duplicateData.isEmpty()) {
            System.out.print("Problem 11: " + duplicateData + " ");
            return true;
        }
        return false;
    }

    // Problem 12
    // Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
    public static void problem12(String str) {
        String s = str.toLowerCase();
        int vowel = 0;
        int consonant = 0;

        for(int i=0; i<str.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else  {
                consonant++;
            }
        }

        System.out.println("Problem 12: Vowel = " + vowel + ", Consonant = " + consonant);
    }

    // Problem 13
    // Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
    public static void problem13(int number) {
        System.out.println("Problem 13: ");
        for(int i=1; i<=10; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }

    // Problem 14
    // Matrix Addition: Add two matrices and print the result. 5x5 (return 2d array)
    public static int[][] problem14(int[][] m1, int[][] m2) {

        int row = m1.length;
        int col = m1[0].length;
        int[][] result = new int [row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // Problem 15
    // Calculate Average: Calculate the average of elements in an array.
    public static double problem15(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double avg;
        avg = (double)sum / array.length;
        return avg;
    }

    // Problem 16
    // Leap Year Check: Determine whether a given year is a leap year.
    public static boolean problem16(int year) {
        if(year % 2 == 0 && year % 100 != 0) {
            return true;
        } else if(year % 400 == 0) {
            return true;
        }
        return false;
    }

    // Problem 17
    // Pattern Printing: Print a pattern (e.g., a pyramid) using loops.
    public static void problem17(){
        for(int i=1; i <= 5; i++) {
            for(int j=1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Problem 18
    // String Reversal: Reverse a given string without using built-in functions. apple, elppa
    public static void problem18(String str) {
        int low = 0;
        int high = str.length() - 1;
        char temp;
        char[] newStr = str.toCharArray();
        while(low < high) {
            temp = newStr[low];
            newStr[low] = newStr[high];
            newStr[high] = temp;

            low++;
            high--;
        }

        String reverseString = new String(newStr);
        System.out.println("Problem 18: " + reverseString);
    }

    // Problem 19
    // Armstrong Number: Check if a number is an Armstrong number.
    public static void problem19(int num) {
        int length = String.valueOf(num).length();
        int originalNum = num;
        int lastDigit;
        int sum = 0;
        while(num > 0) {
            lastDigit = num % 10;
            sum += (int) Math.pow(lastDigit, length);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("Problem 19: Armstrong Number");
        } else  {
            System.out.println("Problem 19: Not  Armstrong Number");
        }
    }

    // Problem 20
    // Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
    public static void problem20(int[] array) {
        int min = array[0];
        int max = array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Problem 20: " + "Min = " + min + ", Max = " + max);
    }

    // Problem 21
    // Calculate the simple interest for given principal, rate of interest, and time.
    public static double problem21(double principle, double rateOfInterest, double time) {
        return (principle * rateOfInterest * time) / 100;
    }

    // Problem 22
    // Write a program to convert temperatures from Celsius to Fahrenheit and vice versa.
    public static void problem22(double c, double f) {
        double fahrenheit = ((double) 9 /5) * c + 32;
        double celsius = ((double) 5/9) * (f - 32);
        System.out.println("Problem 22: Fahrenheit = " + fahrenheit + ", Celsius = " + celsius);
    }

    // Problem 23
    // Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character.
    public static void problem23(char c) { // Solved using ASCII code
        if(c >= 65 && c <= 90) {
            System.out.println("Problem 23: Upper Case Letter");
        } else if (c >= 97 && c <= 122) {
            System.out.println("Problem 23: Lower Case Letter");
        } else if(c >= 48 && c <= 57) {
            System.out.println("Problem 23: Number");
        } else {
            System.out.println("Problem 23: Special Character");
        }
    }

    // Problem 24
    // Write a program to find the second-largest number in a given array.
    public static int problem24(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        int secondMax = array[0];
        for (int i : array) {
            if(i > secondMax && i < max) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    // Problem 25
    // Given a string containing both letters and numbers, find the sum of all the numbers in the string.
    public static int problem25(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            char number = s.charAt(i);
            if(Character.isDigit(number)) {
                sum = sum + Character.getNumericValue(number);
            }
        }
        return sum;
    }

}