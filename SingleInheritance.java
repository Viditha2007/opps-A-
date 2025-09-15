package scenarioBasedPrograms;
class Animal{
	String name;
	void eat() {
		System.out.println(name + "is eating");
	}
}
class Lion extends Animal{
	void roar() {
		System.out.println(name + "is roaring");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion =new Lion();
		lion.name ="simba ";
		lion.eat();
		lion.roar();

	}

}
