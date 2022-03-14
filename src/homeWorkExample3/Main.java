package homeWorkExample3;

public class Main {
    public static void main(String[] args) {
        /** Box деген generic класс тузунуз.
         * Ичинде Box деген объектти кайтарган статический generic метод болсун.
         */
        Box<String> box = new Box<>();
        box.setT("Smart box");

        Box.setBox(box);

        System.out.println(Box.getBox());

    }
}
