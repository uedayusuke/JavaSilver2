package chap1.com.se;

class Foo {
	//printメソッド
	void print() {
		System.out.println("package sample");
	}
}

public class Ex6 {
	public static void main(String[] args) {
		//クラスFooをインスタンス化して
		Foo f = new Foo();
		//printメソッドを呼び出し
		f.print();
	}
}