package chap2;

public class Ex2 {
	public static void main(String[] args) {
		//float x1 = 3_.1415F; 
		//float x2 = 3._1415F; 小数点の前後はダメ
		//long x3 = 999_99_9999_L; long値を表す"L(l)"の前はダメ
		//int x4 = _56; 
		//int x6 = 45_; 先頭、末尾はダメ
		
		int x5 = 100_000;
		System.out.println(x5);
				
		int x7 = 5______2;
		System.out.println(x7);
		
		//int x8 = 0_x78;
		//int x9 = 0x_34; 16進数を表す"0x"、2進数を表す"0b"の中間、前後はダメ
		
		int x10 = 0x5_1;
		int x11 = 0_56;
		System.out.println(x10);
		System.out.println(x11);
	}
}
