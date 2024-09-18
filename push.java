import java.util.Scanner;
import java.util.Stack;



public class push {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your stack size");
int input=scanner.nextInt();
Stack<Integer> stack=new Stack<>();
System.out.println("Enter your data to stack");
for(int i=0;i<input;i++){
  
    int number=scanner.nextInt();
    if(stack.size()<input){
stack.push(number);


    }
    else {
        System.out.println("stack is full");
    }
}
for(Integer element:stack){
    System.out.println(element);
}
    
}}
