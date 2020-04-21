package lesson3;


public class MyClass {

	private int x=5;

	public void printString(){
		System.out.println("Print this String");
		

	}

	public void number(int xNumber) {
		System.out.println("xNumber is: " + xNumber);
	}
	
	public static void main(String[] args) {
		MyClass myObj = new MyClass ();
		myObj.printString();
        System.out.println("myObj x is: " + myObj.x);
        myObj.number(333);
	}
}

