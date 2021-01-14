package chap2;

public class Ex9 {
	public static void main(String[] args) {
		char[] c; //char型の配列"c"を宣言
		c = new char[3]; //配列"c"の要素数を定義
		int[] i = new int[3]; //int型の配列"i"を宣言し、要素数を定義
		String[] str = {"Welcome", "to", "JAVA"}; //String型の配列"str"を宣言し、初期値を代入
		
		//配列cに値を代入
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		
		//配列iに値を代入
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		
		System.out.println("strのサイズ：" + str.length);
		System.out.println("c[0]:	" + c[0]);
		System.out.println("i[2]:	" + i[2]);
		
		for(int n = 0; n < 3; n++) {
			System.out.print(str[n] + " ");
		}
		
		System.out.print("\n");
		
		for(char chr : c) {
			System.out.print(chr + " ");
		}
		
		System.out.print("\n");
		
		for(int in : i) {
			System.out.print(in + " ");
		}
	}
}
