package Launch;

class Vehicle{
        void display() {
		//System.out.println("This is a vehicle");
	}
}
class Car extends Vehicle{
	void display() {
	//System.out.println("the vehicle category is Car");//overidden method
}
	void color() {
		System.out.println("the color is black");//specialized method
	}
}
class Loan extends Vehicle{
	public void Interest() {
	
	}
}
class PersonalLoan extends Loan {
	public PersonalLoan Intrest() {
		System.out.println("this is personal loan");
		PersonalLoan pli=new PersonalLoan();
		return pli;
	}
	void display() {
		System.out.println("Now Under Personal Loan");
	}
}

public class LaunchInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalLoan pl=new PersonalLoan();
		
		Vehicle v=new Vehicle();
		Car c=new Car();
		Loan l=new Loan();
		pl.display();
		c.display();
		c.color();
		l.display();
		
	}

}
