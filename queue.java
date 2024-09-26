import java.util.Scanner;

public class queue {
    static class queue1{
        static int array[];
        static int size;
        static int rare;

        queue1(int n){
            array= new int [ n];
            size=n;
            rare=-1;
        }
        public static boolean isEmpty(){
            System.out.println("queue is empty");
          return rare==-1;
        
        }
    public static void add(int data){
            if(rare==size-1){
                System.out.println("queue is full!");
                return;
            }
            rare=rare+1;
            array[rare]=data;
        }

        public static  int remove(){
if(isEmpty()){
    System.out.println("queue is emoty");
    return -1;
}
int front=array[0];
for(int i=0;i<rare;i++){
    array[i]=array[i+1];

}
rare=rare-1;
return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return array[0];
        }

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of queue");
int n=scanner.nextInt();

        queue1 q=new queue1(n);
        System.out.println("Choose your option");
        System.out.println("1:Add element to queue");
        System.out.println("2:remove element to queue");
        System.out.println("3:check if queue empty");

        int choice=scanner.nextInt();
     
      do{  
      
        switch (choice) {
            case 1:
System.out.println("Enter element to queue");
            for(int i=1;i<=n;i++){
                int value=scanner.nextInt();
    
    q.add(value);
            } 
                
        case 2:
        int removee=q.remove();
        System.out.println(removee);
break;
                case 3:
                q.isEmpty();
                break;
                case 4:
                int top=q.peek();
                System.out.println(top);
                case 5:
                System.out.println("program finished");
        }
      
  
    
    }while(choice==5);

    }

}
