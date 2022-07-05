class Superclass {
String color="black";
	Superclass(){
		System.out.println("Iam parent");
	}
}
 class Child extends Superclass{
	 String color="red";
	Child(){
		System.out.println("Iam child");
	}
void color() {
		
		System.out.println(color);
	}
}
class Baby extends Child{
	String color="pink";
	Baby(){
		System.out.println("Iam baby");
	}
	void color() {
		
		System.out.println("green");
	}
}
 class Parent{
	 public static void main(String args[]) {
		 Baby c= new Baby();
		 c.color();
	 }
 }