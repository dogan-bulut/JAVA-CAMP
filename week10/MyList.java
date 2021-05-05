package beykent.java.week10;


import java.util.ArrayList;

public class MyList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public ArrayList<T> getList(){
        return list;
    }
}
