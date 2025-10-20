import java.util.ArrayList;

public class MyDeque implements DequeueInterface {
    private ArrayList<Object> list = new ArrayList<>();

    @Override
    public void addFront(Object o) {
        list.addFirst(o);
    }

    @Override
    public void addRear(Object o) {
        list.add(o);
    }

    @Override
    public Object removeFront() {
        Object removed = list.removeFirst();
        return removed;
    }

    @Override
    public Object removeRear() {
        Object removed = list.remove(list.size()-1);
        return removed;
    }

    public void displayList() {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
