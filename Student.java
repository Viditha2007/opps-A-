package tasks;

public class Student{
	private String name;
	private int rollNumber;
	private int marks[];
	public Student(String name, int rollNumber, int marks[]) {
		this.name =name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	public String getname() {
		return name;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	public int[] getmarks() {
		return marks;
	}
	public void setname() {
		this.name=name;
	}
	public void setrollNumber() {
		this.rollNumber =rollNumber;
	}
	public void setmarks() {
		this.marks =marks;
		
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		for(int marks : marks ) {
			System.out.println("Marks: "+marks);
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {45,50,48};
		Student s =new Student("Viditha", 32,marks);
		s.display();
		

	}

}
