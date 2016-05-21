package demo.constructs;

public class Loop {
	
	private String name;
	
	public void loop() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		Loop forLoop = new Loop();
		forLoop.loop();
	}
	
}
