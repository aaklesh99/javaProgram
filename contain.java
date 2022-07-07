import java.util.*;

public class contain {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.next();
String pat = sc.next();
if (s.contains(pat)) {
System.out.println("YES");
} else System.out.println("No");
}
}