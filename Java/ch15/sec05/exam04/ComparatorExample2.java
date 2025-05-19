package ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>(new Comparator<Fruit>(){
            @Override
            public int compare(Fruit f1, Fruit f2) {
                return Integer.compare(f1.price, f2.price);
            }
        });

        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        for(Fruit f : fruits){
            System.out.println(f.name + ", " + f.price);
        }
    }
}
