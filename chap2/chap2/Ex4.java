package chap2;

public class Ex4 {
	public static void main(String[] args) {
		int num1 = 10;
		long num2 = 30;
		
		/*
		long num3 = 1000000000000000;
		整数リテラルはデフォでint型に認識されるため、
		int型の範囲を超える場合は末尾に"l(L)"を付けてlong型で宣言する
		*/
		long num3 = 1000000000000000l;
		
		/*
		float num4 = 10.0;
		浮動小数リテラルはデフォでdouble型で認識されるため、
		型の小さいfloat型で宣言する場合は末尾に"f(F)"を付けて宣言する
		*/
		float num4 = 10.0f;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
