package pro.cal;

public class CalculatorDemo {
	public static void main(String args[]) {
		CalculatorDemo c = new CalculatorDemo();
		addition(10, 15, 25);
	}

	public static int addition(int a, int b) {
		return a + b;

	}

	public static int addition(int a, int... nums) {
		int result = 0;
		for (int n : nums) {
			result = result + n;
		}
		System.out.println(result + a);
		return result;

	}
}
