package chapter04;


/**
 * -Xss256k 可以设置栈的最大内存空间
 */
public class StackErrorTest {
    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
