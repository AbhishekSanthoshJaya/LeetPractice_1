package com.leet;

import java.util.Scanner;

public class LeetExamples {
    public static void main(String[] args) {

        int[] num2; int target2 = 0;
        num2 = new int[5];
        LeetExamples obj1 = new LeetExamples();
        int[] num3 = obj1.twoSum(num2 , target2);
        for(int i =0; i<num3.length; i++) {
            System.out.println(num3[i]);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        target = input.nextInt();
        nums = new int[3];
        int[] numsOut = new int[2];
        System.out.println("Enter the members of the array: ");
        for (int i = 0; i< 3; i++ ) {
            nums[i] = input.nextInt();
        }
        for(int j = 0;  j < nums.length; j++){
            for (int k= j+1; k <nums.length; k++){
                if (nums[j] + nums[k] == target){
                    numsOut[0] = j;
                    numsOut[1] = k;
            }

            }
        }
        return numsOut;
    }
}

