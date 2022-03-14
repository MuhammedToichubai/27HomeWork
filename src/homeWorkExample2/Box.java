package homeWorkExample2;

import java.util.List;

public class Box <T>{
    private T s;

    public Box() {
    }

    public Box(T s) {
        this.s = s;
    }

    public static <T> void methodGeneric(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }

    public T getS() {
        return s;
    }

    public void setS(T s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Box: " +
                "\ns: " + s
                ;
    }
}
