package chapter08;


/**
 * -XX:SurvivorRatio：设置新生代Eden和S1 S2的比例
 * -Xmn：设置新生代的空间大小
 */
public class EdenSurvisor {
    public static void main(String[] args) {

//        System.out.println("系统内存大小为：" + initialMemory * 64 / 1024 + "G");
//        System.out.println("系统内存大小为：" + maxMemory * 4 / 1024 + "G");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
