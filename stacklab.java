import java.util.ArrayList;
import java.util.Scanner;

public class stacklab  {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack stack=new Stack();
boolean exit=false;
while(!exit){
        System.out.println("Stack operations ");
        System.out.println("1:push in stack");
       
        System.out.println("2:pop in stack");
        System.out.println("3:peak in stack");
        System.out.println("4:check stack is empty");
        System.out.println("5:size of stack");
        System.out.println("6:exit");
        
int input=scanner.nextInt();

switch (input) {
    case 1:
        System.out.println("Enter your data");
        int data=scanner.nextInt();

stack.push(data);
stack.displaystack();
        break;
case 2:
stack.pop();
stack.displaystack();
    
        break;

case 3:
stack.peek();
stack.displaystack();
break;
case 4:
stack.isEmpty();
break;
case 5:
stack.stacksize();
stack.displaystack();
break;
case 6:
exit=true;
System.out.println("System is exiting");
   default:
System.out.println("Enter valid option!"); }
}}}
class Stack{
    private ArrayList<Integer>arraylist;
    public Stack(){
        arraylist=new ArrayList<>();
    }
    public void push(int value){
    arraylist.add(value);
    System.out.println("value is added");
}
public int pop(){
    if(isEmpty()){
    

System.out.println("Stack is empty");
return -1;    
}
else{

    int popdata= arraylist.remove(arraylist.size()-1);
    System.out.println("data is popped:"+popdata);
    return popdata;
}


}
public boolean isEmpty(){
    return arraylist.isEmpty();
}
public void displaystack(){
    System.out.println("the stack is:"+arraylist);
}
public int peek() {
    if(isEmpty()){
        System.out.println("the stack is empty");
return -1;
    }
    else{
        int peekelement=arraylist.get(arraylist.size()-1);
        System.out.println("peek element:"+peekelement);
        return peekelement;
    }
}
public int stacksize(){
    if (isEmpty()) {
        System.out.println("stack   is empty");
        return -1;
    }
    else{
        int size=arraylist.size();
        System.out.println("size of stack:"+size);
        return size;
    }
}
}