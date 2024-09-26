import java.util.Scanner;

public class circularqueue {
    static class queue1 {
        static int array[];
        static int size;
        static int rare;
        static int front;
        
        queue1(int n) {
            array = new int[n];
            size = n;
            rare = -1;
            front = -1;
        }
        
        public static boolean isempty() {
            return rare == -1 && front == -1;
        }
        
        public static boolean isfull() {
            return (rare + 1) % size == front;
        }
        
        public static void add(int data) {
            if (isfull()) {
                System.out.println("Queue is full!");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rare = (rare + 1) % size;
            array[rare] = data;
        }

        public static int remove() {
            if (isempty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = array[front];

            if (front == rare) {
                rare = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isempty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[front];
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        queue1 q = new queue1(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.remove();
        q.add(5);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
        scanner.close();
    }
}
