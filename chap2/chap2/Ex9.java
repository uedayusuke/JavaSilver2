package chap2;

public class Ex9 {
	public static void main(String[] args) {
		char[] c;
		c = new char[3];
		int[] i = new int[3];
		String[] str = {"Welcome", "to", "JAVA"};
		
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		
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
