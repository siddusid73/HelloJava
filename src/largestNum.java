public class largestNum {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60};
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("Largest = " + largest);
    }
}
