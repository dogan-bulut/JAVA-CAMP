package beykent.java.week10;

import java.util.Arrays;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {

        MyList<String> stringList = new MyList<>();
        stringList.addElement("Istamnbul");

        MyList<Integer> intList = new MyList<>();
        intList.addElement(1);
        intList.addElement(3);

        MyList<Double> doubleList = new MyList<>();
        doubleList.addElement(1.4);
        doubleList.addElement(2.3);
        doubleList.addElement(4.6);

        //findSum(stringList);
        findSum(intList);
        findSum(doubleList);

        MapRecord<Integer, String> p1 = new MapRecord<>(1, "Istanbul");
        MapRecord<String, String> p2 = new MapRecord<>("IST", "Istanbul");

       duplicateList(stringList);
       duplicateList(intList);
       duplicateList(doubleList);

    }

    public static void findSum(MyList<? extends Number> numbers){

        double sum = 0.0;
        for(Number n: numbers.getList()){
            sum += n.doubleValue();
        }
        System.out.println(sum);
    }

    public static <U> void duplicateList(MyList<U> l2 ){
         l2.getList().addAll(l2.getList());
    }
}
