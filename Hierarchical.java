package task4;

class Admin {
	void name() {
		System.out.println("admin checks the details");
	}
}
class Faculty extends Admin{
	@Override
	void name() {
		System.out.println("faculty will teach subject");
	}
	
}
class Student extends Admin{
	@Override
	void name () {
		System.out.println("Student is studying subjects");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a=new Admin();
		Admin b=new Faculty();
		Admin c=new Student();
		a.name();
		b.name();
		c.name();
	}

}
