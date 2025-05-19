package ch18.sec10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 파일을 읽고 역직렬화해서 객체로 복원
        Member m2 = (Member)ois.readObject();
        Product p2 = (Product)ois.readObject();
        int[] arr2 = (int[])ois.readObject();

        ois.close();
        fis.close();

        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));
    }
}
