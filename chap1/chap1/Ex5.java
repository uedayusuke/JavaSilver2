package chap1;

public class Ex5 {
	public static void main(String[] args) {
		int result = 0;
		//処理開始時刻
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			result += 1;
		}
		
		//処理完了時刻
		long end =System.currentTimeMillis();
		System.out.println(result);
		//開始から完了を引いてかかった時間を出力
		System.out.println((end - start) + " ms");
	}
}
