public class smallestNum {
    public static void main(String[] args) {
        int[] num = {10, 4, 3, 14, 15};
        int smallest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println(smallest);
    }
}
