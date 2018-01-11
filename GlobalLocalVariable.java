class A {

	// Global variable declared out side the
	// method but inside the class is a
	// global variable.

	// Here data is Instance or global variable.
	int data = 200;

	// Local variable declare
	// inside the method only.

	// So variable d inside the
	// method is local variable.
	public A(int d) {
		data = d;
		System.out.println(data);

	}

	void display() {
		System.out.println(data);
	}
}

public class LocalClass {

	public static void main(String[] args) {

		A obj = new A(100);
		obj.display();

	}

}
