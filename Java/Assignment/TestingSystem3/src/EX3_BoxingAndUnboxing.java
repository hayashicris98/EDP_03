public class EX3_BoxingAndUnboxing {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
	}

	// Question 1:
	public static void question1() {
		Integer salary = 5000;
		System.out.printf("%2.2f", (float) salary);
	}

	// Question 2:
	public static void question2() {
		String s1 = "1234567";
		Integer a = Integer.parseInt(s1);
		System.out.println(a);
	}

	// Question 3:
	public static void question3() {
		Integer a = 1234567;
		int b = a.intValue();
		System.out.println(b);
	}
}
