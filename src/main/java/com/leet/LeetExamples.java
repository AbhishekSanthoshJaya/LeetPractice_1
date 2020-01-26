package com.leet;

import java.util.Scanner;

public class LeetExamples {
    public static void main(String[] args) {

        int[] num2;
        int target2 = 0;
        num2 = new int[5];
        LeetExamples obj1 = new LeetExamples();
        // int[] num3 = obj1.twoSum2(num2 , target2);
        //for(int i =0; i<num3.length; i++) {
        //   System.out.println(num3[i]);
        //}
        obj1.printPascals(target2);
    }

    public int[] twoSum(int[] nums, int target) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        target = input.nextInt();
        nums = new int[3];
        int[] numsOut = new int[2];
        System.out.println("Enter the members of the array: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = input.nextInt();
        }
        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] + nums[k] == target) {
                    numsOut[0] = j;
                    numsOut[1] = k;
                }

            }
        }
        return numsOut;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] newNums = new int[2];
        nums = new int[5];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    newNums[0] = j;
                    newNums[1] = i;
                }
            }
        }
        return newNums;
    }

    public boolean isPalindrome() {
        int test = 1214;
        int test2 = test;
        int result = 0;
        for (; test != 0; test /= 10) {
            int digit = test % 10;
            result = result * 10 + digit;
        }
        return result == test2;
    }

    public int removeDuplicates() {
        int count = 0;
        int count2 = 0;
        int[] arr = new int[]{1, 1, 2, 2, 4, 5, 5, 5, 5, 6, 7, 8, 9, 10, 10, 11, 11, 11};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count + 1;
    }

    public int factorial(int n) {
        int i;
        for (i = 1; n > 1; n--) {
            i = i * n;
        }
        return i;
    }
    public int combinationValue(int n, int r){
        int result;
        result = factorial(n)/ (factorial(n-r) * factorial(r));
        return result;
    }

    public void printPascals(int n){
        int result2 = 0;
        int j =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows of your triangle pls: ");
        n = input.nextInt();
        for (int i = 0; i <= n; i++){
            for (j =0 ; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(j =0; j <= i; j++) {
                result2 = combinationValue(i, j);
                System.out.print(" " + result2);
            }
            System.out.println();
        }

    }
}
