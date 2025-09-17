public class Ques2 {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; 
                 }
            if (num == candidate) {
                count++; 
            } else {
                count--; 
            }
        }
        return candidate; 
    }

    public static void main(String[] args) {
        // Sample Input 1
        int[] nums1 = { 3, 2, 3 };
        System.out.println("Majority Element: " + majorityElement(nums1)); 

        // Sample Input 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element: " + majorityElement(nums2));
    }
}

