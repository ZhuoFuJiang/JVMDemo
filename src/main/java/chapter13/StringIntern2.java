package chapter13;

public class StringIntern2 {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();//调用此方法之前，字符串常量池已经存在了11
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();//在字符串常量池中已经有11了
        System.out.println(s3 == s4);
    }
}
