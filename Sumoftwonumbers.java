package twonumbers;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program
public class Sumoftwonumbers {
//public : members which can access as public,public members are visible to all other classes.
//class : is a context of java that are used to create objects and to define object data types and methods.
	static int add(int v, int i){
//static : is a member of class or related to class
//int : int is a integer in a class wraps the ordinary primitive in some situations when u need a class to 
//represent integer instead of primitive type.
//here we are declaring variables by taking static.
		int s ;//to initialize the variables.
		while (i!=0){
//while loop is statement in programming which repeats and excutes the statement as long as condition gets true.
//if i is not equal to zero it will excute the loop till the condition get false
			s =v&i;// 
			//here we are using & to add
			v = v^i;
			i = s <<1;
		}
		return v;//it will return the value v
	}
public static void main(String[] args) {
	//public : it can be called from anywhere.
	//static : doesn't belong to a specific object.
	//void : returns to no value.
	//main : is special because it will start the program.
			
		Scanner sc = new Scanner (System.in);//here we are using scanner to scan the values which we initilize.
		System.out.println("enter the values of a,b");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		int v= sc.nextInt();//it will scan next token of the input int
		int i=sc.nextInt();
		
		System.out.println("summ of values is "+add(v,i));
}
	}


