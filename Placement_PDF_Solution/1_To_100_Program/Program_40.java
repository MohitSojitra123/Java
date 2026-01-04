// Given an array nums with n integers, your task is to check if it could become non-decreasing 
// by modifying at most one 
// Input: nums = [4,2,3] 
// Output: true 
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array.



// ----------------------------------------------------

// 1️⃣ What does non-decreasing mean?
// A non-decreasing array means:
// Every number is ≤ the next number


// 2️⃣ What is the task?
// You are allowed to change at most ONE element in the array.

// 👉 After changing only one number,
// check if the array can become non-decreasing.

// 3️⃣ Given Input
// nums = [4, 2, 3]

// 4️⃣ Check the array step by step
// Compare adjacent numbers:

// Compare 4 and 2
// 4 > 2  ❌  (this breaks non-decreasing rule)

// Compare 2 and 3
// 2 ≤ 3  ✅

// ➡ Only ONE problem exists.

// 5️⃣ Can we fix this ONE problem with ONE change?
// Yes.

// Change the first element (4)
// Change 4 → 1

// [1, 2, 3]


// Now check again:
// 1 ≤ 2 ≤ 3  ✅


// The array is now non-decreasing.

// ✔ We used only one modification
// ✔ The rule is satisfied
// ----------------------------------------------------

public class Program_40 {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) return false;

                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        System.out.println(checkPossibility(nums)); 
    }
}
