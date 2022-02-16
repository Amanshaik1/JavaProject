package Practice;

import java.util.Scanner;

public class UserInputEx {

	public static void main(String[] args) {
		 
		
			    Scanner myObj = new Scanner(System.in);
			    System.out.println("Enter name:");
			    String name = myObj.nextLine();
			    
			    System.out.println("Enter Age:");
			    int age = myObj.nextInt();
			    
			    double salary = myObj.nextDouble();
			    System.out.println("Enter Salary:");
			    
			    System.out.println("Name: " + name); 
			    System.out.println("Age: " + age);  
			    System.out.println("Salary: " + salary); 


	}

}
