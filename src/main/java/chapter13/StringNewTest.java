package chapter13;


public class StringNewTest {
    public static void main(String[] args) {
        // 一个对象是new关键字在堆中，一个是字符串常量
//        String str = new String("abc");

        // new StringBuilder 对象2: new String() 对象3: "a" 对象4:new String() 对象5:"b" 对象6: toString其实是new String
        // 但是toString不会在常量池中增加"ab"，因为不是字面量，而是传参
        String str1 = new String("a") + new String("b");
    }
}
