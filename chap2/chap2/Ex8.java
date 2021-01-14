package chap2;

public class Ex8 {	
	/*
	クラス直下のメンバ変数では使用不可
	var a = 100;
	static var b = 100;
	*/
	
	public static void main(String[] args) {
		var c = 100;
		var d = "Hello WOrld!!";
		/*
		右辺に値を代入しないと型を推論できない
		var e;
		var f = null;
		*/
		final var g = 10;
		/*
		定数で宣言する場合、fainalは先に記述
		var final h = 10;
		*/
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(g);
	}
}
