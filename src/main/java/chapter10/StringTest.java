package chapter10;

public class StringTest {

    public void test() {
        String s1 = "a" + "b" + "c";
        String s2 ="abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public void test1() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        // 如果拼接中出现了变量，相当于在堆空间new String()
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        // s1 + s2的执行细节
        // StringBuilder s = new StringBuilder()
        // s.append("a")
        // s.append("b")
        // s.toString() new String()
        String s4 = "javaEE" + "hadoop";

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);

        // intern如果能在常量池找到，则直接返回，否则放入常量池中，并返回地址
        String s8 = s6.intern();
        System.out.println(s3 == s8);
    }

    public static void main(String[] args) {
        StringTest test = new StringTest();
        test.test();
        test.test1();
    }
}
