import java.util.Scanner;

public class priorityqueue {
    static class queue3 {
        static int array[];
        static int size;

        queue3(int n) {
            array = new int[n];
            size = 0;
        }

        public static void sortqueue() {
            for (int i = 1; i < size; i++) {  
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }

        public void add(int data) {
            if (size < array.length) {
                array[size] = data;
                size++;
                sortqueue();
            } else {
                System.out.println("Queue is full");
            }JAVA
            
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of queue:");
        int size = scanner.nextInt();
        queue3 p1 = new queue3(size);
        System.out.println("Enter data to queue");
        for (int i = 1; i <= size; i++) {
           
            int data = scanner.nextInt();
            p1.add(data);
        }
        System.out.println("prioritized data");
        p1.display();
    }
}
