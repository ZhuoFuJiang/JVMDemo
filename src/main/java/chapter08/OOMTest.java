package chapter08;

import java.util.ArrayList;
import java.util.Random;

public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> arrayList = new ArrayList<Picture>();
        while(true) {
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            arrayList.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture {
    private byte[] id;

    public Picture(int id) {
        this.id = new byte[id];
    }
}
