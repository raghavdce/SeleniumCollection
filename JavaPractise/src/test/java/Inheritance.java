//Parent can call only the method in the parent
//Child can call the method both in parent & child
//When static methods are used, then irrespective of the variable type, parent method alone will be called
//When non-static methods are used, then irrespective of the variable type, child method will be called

class Parent{
	
	public void walk() {
		System.out.println("Human Walk from parent");
	}
	
	public void humanRun() {
		System.out.println("Human Run from parent");
	}
}

class Child extends Parent{
	
	@Override
	public void walk() {
		System.out.println("Man Walk from child");
	}
	
	public void run() {
		System.out.println("Man Run from child");
	}
}
public class Inheritance {

	public static void main(String[] args) {

		Parent parentObj = new Parent();
		parentObj.walk();		//Human Walk from parent
		Parent parentObj1  = new Child();
		parentObj1.walk();		//Man Walk from child
		Child childObj = new Child();
		childObj.walk();	//Man Walk from child
		childObj.run();	//Man Run from child
		childObj.humanRun();	//Human Run from parent
	}

}
