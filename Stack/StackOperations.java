import java.util.Scanner;
class Stack{
	class StackData{
		int data;
		StackData next;
	}
	// Data Members
	private StackData top;
	
	// Stack Operations
	public boolean push(int data){
		if(top == null){
			top = new StackData();
			top.next = null;
			// Pushed the data
			top.data = data;
		}else{
			
			StackData temp = top;
			top = new StackData();
			// Pushed the data
			top.data = data;
			top.next = temp;
		}
		return true;
	}
	
	public int pop() throws Exception{
		if(top != null){
			StackData temp = top.next;
			int poppedData = top.data;
			top.next = null;
			top = temp;
			return poppedData;
		}else{
			throw new Exception("Stack is Empty Can't pop");
		}
		
	}
	
	public void displayStack(){
		if(top!=null){
			StackData temp=top;
			while(temp.next!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
				System.out.println(temp.data);
		}
		else{	System.out.println("Stack is Empty");}
	 }
}

public class StackOperations{
	
	public static void main(String[] args){
		Stack stk=new Stack();
		Scanner scr=new Scanner(System.in);
		boolean execute=true;
		while(execute){
			System.out.println("Select your choice:\n 1.Push\n 2.Pop\n 3.Display\n 4.Exit");
			int inputChoice=scr.nextInt();
			switch(inputChoice){
				case 1:	System.out.println("Enter the number to push");
						int data=scr.nextInt();
						stk.push(data);
						break;
				case 2:	try{	
							System.out.println("Popped data is:"+stk.pop());
						}
						catch(Exception e){
							e.printStackTrace();
						}
						break;
				case 3: stk.displayStack();
						break;
				case 4: execute=false;
			}
		}
	}

}