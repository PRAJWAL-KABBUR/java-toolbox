import java.util.*;

public class $3_RegexEmailValidator {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String e = s.nextLine();
        System.out.println(e.matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$") ? "Valid" : "Invalid");
    }
}
