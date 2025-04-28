package utils;


import adt.list.Queue;
import adt.list.Stack;
import adt.list.StaticQueue;
import adt.list.StaticStack;

public class QueueUtil {

    public static Queue copy(Queue queue) {
        Queue aux = new StaticQueue();
        Queue copy = new StaticQueue();
        while (!queue.isEmpty()) {
            aux.add(queue.getFirst());
            queue.remove();
        }

        while (!aux.isEmpty()) {
            copy.add(aux.getFirst());
            queue.add(aux.getFirst());
            aux.remove();
        }

        return copy;
    }

    public static Queue revert(Queue queue) {
        Queue copy = copy(queue);
        Stack stack = new StaticStack();

        while (!copy.isEmpty()) {
            stack.add(copy.getFirst());
            copy.remove();
        }

        while (!stack.isEmpty()) {
            copy.add(stack.getTop());
            stack.remove();
        }

        return copy;
    }

    public static boolean esCapicua(Queue queue) {
        Queue copy = copy(queue);
        Queue aux = revert(queue);

        while (!copy.isEmpty()) {
            if (copy.getFirst() != aux.getFirst()) {
                return false;
            }
            copy.remove();
            aux.remove();
        }
        return true;
    }

}
