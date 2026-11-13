//Reverse String Method 2

public class reverseStringBuilder {
    public static void main(String[] args) {
        String text = "avaJ nraeL";

        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();

        System.out.println(reversed);
    }
}
