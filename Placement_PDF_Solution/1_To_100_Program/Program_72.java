//  You are given a 0-indexed array nums consisting of positive integers. You can choose two // indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of // nums[j]. // Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices // i and j that satisfy the conditions. // Input: nums = [18,43,36,13,7] // Output: 54 // Explanation: The pairs (i, j) that satisfy the conditions are: // - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54. // - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50. // So the maximum sum that we can obtain is 54. 
// 

// Step 1️⃣ Digit sums (you already did this correctly) // 18 → 1 + 8 = 9 // 43 → 4 + 3 = 7 // 36 → 3 + 6 = 9 // 13 → 1 + 3 = 4 // 22 → 2 + 2 = 4 // 45 → 4 + 5 = 9 // 7 → 7 // Step 2️⃣ Group numbers with the same digit sum // 🔹 Digit sum = 9 // 18, 36, 45 // Possible pairs: // 18 + 36 = 54 // 18 + 45 = 63 // 36 + 45 = 81 ✅ // ➡ Max here = 81 // 🔹 Digit sum = 7 // 43, 7 // Pair: // 43 + 7 = 50 // 🔹 Digit sum = 4 // 13, 22 // Pair: // 13 + 22 = 35 // Step 3️⃣ Choose the maximum sum from all valid groups // 81 (digit sum 9) // 50 (digit sum 7) // 35 (digit sum 4) // ✅ Final Answer // 81

import java.util.ArrayList;
import java.util.Scanner;

public class Program_72 {

    // Function to calculate digit sum
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            nums[i] = sc.nextInt();
        }

        ArrayList<Integer> sums = new ArrayList<>();
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        // Step 1 & 2: Group numbers by digit sum
        for (int i = 0; i < nums.length; i++) {

            int sum = digitSum(nums[i]);

            if (sums.contains(sum)) {
                int index = sums.indexOf(sum);
                groups.get(index).add(nums[i]);
            } else {
                sums.add(sum);
                ArrayList<Integer> newGroup = new ArrayList<>();
                newGroup.add(nums[i]);
                groups.add(newGroup);
            }
        }

        int maxSum = -1;

        // Step 3: Find maximum pair sum
        for (ArrayList<Integer> group : groups) {

            if (group.size() >= 2) {

                int firstMax = 0;
                int secondMax = 0;

                for (int num : group) {
                    if (num > firstMax) {
                        secondMax = firstMax;
                        firstMax = num;
                    } else if (num > secondMax) {
                        secondMax = num;
                    }
                }

                maxSum = Math.max(maxSum, firstMax + secondMax);
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
