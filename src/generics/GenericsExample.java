package generics;
public class GenericsExample {
/* This is my first java program.
* This will print 'Hello World' as the output
*/
	
	/*
	 * Type-safety
		We can hold only a single type of objects in generics. It doesn’t allow to
		store other objects. Without Generics, we can store any type of objects.

	 List list = new ArrayList();
	list.add(10); //Storing an int value in list
	list.add("10"); //Storing a String value in list
	
	With Generics, it is required to specify the type of object we need to store.
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add("10");// compile-time error
	
	
	2 Type casting is not required
	There is no need to typecast the object. Before Generics, we need to type cast.
	Example:
	List list = new ArrayList();
	list.add("hello");
	String s = (String) list.get(0); //typecasting
	
	After Generics, we don't need to typecast the object.
	List<String> list = new ArrayList<String>();
	list.add("hello");
	String s = list.get(0);
	
	3 Compile-Time Checking: Type checking is done at compile time so errors will not occur at runtime.
Example:
List<String> list = new ArrayList<String>();
list.add("hello");
list.add(32);//Compile Time Error

	 */
	
	public static void print(String str)
	{
		System.out.println(str.getClass().getName());
	}
	
	
	public static <T> void printGeneral(T t)
	{
		System.out.println(t.getClass().getName());
	}
	 
	
	
	// generic method printArray
	public static < T > void printArray( T[] i )
	{
	// Display array elements
	for(T element : i) {
		System.out.printf("%s ", element);
		}
		System.out.println();
	}
		
		
public static void main(String []args) {
	//System.out.println("Hello World"); // prints Hello World
	
//	GenericsExample.print("Hello World");
	
	Integer[] intArray = { 1, 2, 3, 4, 5 };
	Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	System.out.println("Array integerArray contains:");
	printArray(intArray); // pass an Integer array
	System.out.println("\nArray doubleArray contains:");
	printArray(doubleArray); // pass a Double array
	System.out.println("\nArray characterArray contains:");
	printArray(charArray); // pass a Character array
	
	printGeneral(6);
	
	printGeneral(6.00012);
	
	
	printGeneral("\n general hello");
	
	
	}
}



/* 
commands to run this program
    Type 'javac MyFirstJavaProgram.java' and press enter to compile your code. If
there are no errors in your code, the command prompt will take you to the next
line (Assumption : The path variable is set).
 Now, type ' java MyFirstJavaProgram ' to run your program.
 You will be able to see ' Hello World ' printed on the window.


*/