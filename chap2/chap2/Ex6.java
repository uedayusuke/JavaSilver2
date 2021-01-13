package chap2;

public class Ex6 {
	public static void main(String[] args) {
		{
			int x = 100;
			System.out.println(x);
			x = 200;
			System.out.println(x);
		}
		
		/*
		ブロックを外れているため、"x"は使えない
		System.out.println(x);
		x = 300;		
		*/
		
	}
}
