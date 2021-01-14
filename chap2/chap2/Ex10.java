package chap2;

public class Ex10 {
	public static void main(String[] args) {
		int i;
		/*
		初期値を代入していないためコンパイルエラー
		System.out.println("iの値	:" + i);
		*/
		
		int[] array = new int[2];
		//初期値を代入していない場合、int型は"0"がデフォで代入される
		System.out.println("array[0]:	" + array[0]);
		System.out.println("array[1]:	" + array[1]);
		/*
		配列の要素数を超えている場合は実行時エラーとなる
		System.out.println("array[2]:	" + array[2]);
		*/
	}
}
