import lists.LinkedPositionalList;
import lists.Position;
import lists.PositionalList;

public class Exercise1 {

    public static void main(String[] args) {
        PositionalList<Integer> list = new LinkedPositionalList<>();

        Position<Integer> a = list.addFirst(10);
        Position<Integer> b = list.addLast(20);
        Position<Integer> c = list.addLast(30);

        System.out.println("Index of a: " + list.indexOf(a));
        System.out.println("Index of b: " + list.indexOf(b));
        System.out.println("Index of c: " + list.indexOf(c));

        Position<Integer> d = new Position<Integer>() {
            @Override
            public Integer getElement() {
                return 99;
            }
        };
        System.out.println("Index of d: " + list.indexOf(d));
    }
}
