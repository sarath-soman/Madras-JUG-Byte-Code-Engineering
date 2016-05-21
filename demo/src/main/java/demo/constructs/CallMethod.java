package demo.constructs;

public class CallMethod {
	
	public boolean greaterThan(int x, int y) {
		return x > y;
	}
	
	public void check10GT20() {
		boolean is10GT20 = greaterThan(10, 20);
		System.out.println(is10GT20);
	}
	
	public static void main(String[] args) {
		CallMethod testClass = new CallMethod();
		testClass.check10GT20();
	}
}
