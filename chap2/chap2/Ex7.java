package chap2;

public class Ex7 {
	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		x = 200;
		System.out.println(x);
	}
	
	public static void method() {
		/*
		 * "x"を宣言したブロックを外れているため使用不可
		 * x = 300;
		 */
	}
}
