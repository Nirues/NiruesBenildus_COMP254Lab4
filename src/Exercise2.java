import java.util.Stack;

public class Exercise2 {

    // Implementation of transfer method
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stackS = new Stack<>();
        Stack<Integer> stackT = new Stack<>();

        stackS.push(1);
        stackS.push(2);
        stackS.push(3);

        transfer(stackS, stackT);

        // Print the elements of stackT to see the transferred elements
        while (!stackT.isEmpty()) {
            System.out.println(stackT.pop());
        }
    }
}
