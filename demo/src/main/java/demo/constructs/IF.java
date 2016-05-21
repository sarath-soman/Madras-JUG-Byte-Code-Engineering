package demo.constructs;

public class IF {

	public static void main(String[] args) {
		printGreatest(10, 20);
	}
	
	public static void printGreatest(int x, int y) {
		if(x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}

}
