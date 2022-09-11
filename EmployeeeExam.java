package HasArelation;

public class EmployeeeExam {
	
	int age;
	Name n;
	
	public void display(int age, Name n) {
		System.out.println("Age: "+ age);
		System.out.println("full Name : "+n.FirstName+" "+n.MiddleName+" "+n.LastName);
	}

	public static void main(String[] args) {
		EmployeeeExam e=new EmployeeeExam();
		Name n = new Name("vijay","Kumar","Karsh");
		e.display(25, n);

	}

}
