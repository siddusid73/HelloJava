public class sumOfElements {
    public static void main(String[] args) {
        int[] nums = {10, 30, 50, 40, 5, 3, 2};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
