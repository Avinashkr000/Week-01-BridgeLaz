import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sc.next();

        System.out.print("Enter second string : ");
        String str2 = sc.next();

        boolean areEqualByCharAt = compareUsingCharAt(str1, str2);
        boolean areEqualByEqualsMethod = str1.equals(str2);

        System.out.println("Comparison using charAt method : " + areEqualByCharAt);
        System.out.println("Comparison using equals() method : " + areEqualByEqualsMethod);

        if (areEqualByCharAt == areEqualByEqualsMethod) {
            System.out.println("Results of both methods match");
        } else {
            System.out.println("Results of both methods do not match");
        }

        sc.close();
    }

    private static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
