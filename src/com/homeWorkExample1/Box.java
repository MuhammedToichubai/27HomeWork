package com.homeWorkExample1;

public class Box<T,C> {

    private T s;
    private C c;

    public Box() {
    }

    public Box(T t,C c) {
        this.s = t;
        this.c = c;
    }

    public T getS() {
        return s;
    }

    public void setS(T s) {
        this.s = s;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public static <T,C> Box getBoxMethod() {
        Box<Integer,String> box = new Box<>(100,"white");
        return box;
    }

    @Override
    public String toString() {
        return "Box:" +
                "\ns: " + s +
                "\ncolor: " + c
                ;
    }
}
;