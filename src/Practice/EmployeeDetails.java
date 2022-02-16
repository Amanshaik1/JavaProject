package Practice;

public class EmployeeDetails {

	public static void main(String[] args) {
		//not working right now
		
		/*System.out.println("Java Variables");*/
		
		
		//System.out.println("Employee Detail");
		
		
		int empId = 6492;
		String name = "pradeep";
		String designation= "java Developer";
		int Sal=50000;
		int incent = 10000;
		int tax = 200;
		int totalsalary = Sal + incent - tax;
		System.out.println(empId);
		
		System.out.println("Employee Detail");
		System.out.println("Employee Id      : "+  empId);
		System.out.println("Name             : " + name);
		System.out.println("Designation      : " +designation);
		System.out.println("Salary           : " +Sal);
		System.out.println("Extra hours      : "+ incent);
		System.out.println("State tax        : "+ tax);
		System.out.println("Total Salary     : " + totalsalary);
		
	}

}
