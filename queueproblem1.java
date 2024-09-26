import java.util.*;
import java.util.Stack;

public class queueproblem1{
static class queue2{
  static Stack<Integer> s1=new Stack<>();
  static Stack<Integer> s2=new Stack<>();

public static boolean isEmpty(){
    return s1.isEmpty();
}
  public static void add(int data){
while(!s1.isEmpty()){
    s2.push(s1.pop());
}

s1.push(data);

while(!s2.isEmpty()){
    s1.push(s2.pop());
}



  }
  public static int remove(){
    if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
    }
   return s1.pop();
  }
  public static int peek(){
    if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
    }
   return s1.peek();
  }

}
public static void main(String[] args) {
    queue2 q2=new queue2();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter size of stack");
    int size=scanner.nextInt();
for(int i=0;i<size;i++){
    int data=scanner.nextInt();
    q2.add(data);
  
}
while(!q2.isEmpty()){
    System.out.println(q2.peek()); 
    q2.remove();
}
}
}