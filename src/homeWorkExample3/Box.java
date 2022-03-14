package homeWorkExample3;

public class Box <T>{
    private static Box box;
    private T t;

    public Box() {
    }

    public Box(T t) {
        this.t = t;
    }

    public static <T> Box getBox() {
        return box;
    }

    public static <T> void setBox(Box box) {
        Box.box = box;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box: " +
                "\nt: " + t
                ;
    }
}
