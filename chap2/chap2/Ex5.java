package chap2;

public class Ex5 {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);
		num1 = 20;
		final int num2 = 30;
		/*
		 * "final"修飾子で定数になるため、新たに代入できない
		 * num2 = 40;
		 */
		System.out.println(num1);
		System.out.println(num2);
	}
}
