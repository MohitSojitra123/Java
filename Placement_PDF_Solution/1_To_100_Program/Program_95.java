// Given an unsorted integer array nums, return the smallest missing positive integer. 
// You must implement an algorithm that runs in O(n) time and uses constant extra space. 
// Input: nums = [1,2,0] 
// Output: 3 
// Input: nums = [3,4,-1,1] 
// Output: 2


// Using HashSet (BEST choice)
// HashSet<Integer> set = new HashSet<>();
// Why it’s good:
// contains() → O(1) (very fast)
// No duplicate values
// Clean and efficient

// Using ArrayList (Works, but slow)
// ArrayList<Integer> list = new ArrayList<>();
// Problem with ArrayList:
// contains() → O(n) (slow)
// Needs loop internally
// Bad for large inputs

import java.util.HashSet;
import java.util.Scanner;

public class Program_95 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];


        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }


        int missing = 1;
        while (true) {
            if (!set.contains(missing)) {
                System.out.println("Smallest Missing Positive Number: " + missing);
                break;
            }
            missing++;
        }

        sc.close();

    }
}


// import java.util.*;

// public class Test {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Step 1: Take array size
//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();

//         int[] nums = new int[n];

//         // Step 2: Take array elements
//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         ArrayList<Integer> list = new ArrayList<>();

//         // Step 3: Store only positive numbers
//         for (int num : nums) {
//             if (num > 0 && !list.contains(num)) {
//                 list.add(num);
//             }
//         }

//         // Step 4: Find smallest missing positive number
//         int missing = 1;
//         while (true) {
//             if (!list.contains(missing)) {
//                 System.out.println("Smallest Missing Positive Number: " + missing);
//                 break;
//             }
//             missing++;
//         }

//         sc.close();
//     }
// }
