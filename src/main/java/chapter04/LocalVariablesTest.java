package chapter04;

public class LocalVariablesTest {
    private int count = 0;

    public void test3() {
        this.count++;
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        int c = a + 1;
    }

    public static void main(String[] args) {

    }
}
