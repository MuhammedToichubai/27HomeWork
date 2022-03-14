package homeWorkExample2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Box деген generic класс тузунуз.
         * Ичинде Box деген объектти кайтарган статический generic метод болсун.
         */
        List<String> strings = new ArrayList<>();
        strings.add("Muhammed");

        Box.methodGeneric(strings,"Grazhdanskaya");

        System.out.println(strings);

        List<Integer> integers = new ArrayList<>(List.of(1997));

        Box.methodGeneric(integers,119);

        System.out.println(integers);






    }
}
