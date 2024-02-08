package chapter13;

public class StringIntern3 {
    public static void main(String[] args) {
        String x = "ab";
        String s1 = new String("a") + new String("b");
        String s2 = s1.intern();
        System.out.println(s1 == "ab");
        System.out.println(s2 == "ab");
    }
}
