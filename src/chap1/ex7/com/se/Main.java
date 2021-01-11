package chap1.ex7.com.se;
//import文でFooクラスを読み込み
import chap1.ex7.com.se.ren.Foo;

public class Main {
	public static void main(String[] args) {
		//インスタンス化
		Foo f = new Foo();
		//printメソッドを呼び出し
		f.print();
	}
}
