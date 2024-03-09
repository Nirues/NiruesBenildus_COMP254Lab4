public class Exercise3<E> {

    public static class SinglyLinkedList<E> {
        public void concatenate(SinglyLinkedList<E> list) {
        }

    }


    public static class LinkedQueue<E> {
        private SinglyLinkedList<E> list = new SinglyLinkedList<>();

        public void concatenate(LinkedQueue<E> Q2) {
            list.concatenate(Q2.list);
            Q2.list = new SinglyLinkedList<>();
        }


    }
}
