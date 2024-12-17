package LessonContent;

public class SingleLinkedList <E> {

    E element;

    static class Node<E>{

        E element;

        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}



