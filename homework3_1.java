package homework;
import java.util.Scanner;
public class homework3_1 {

	public static void main(String[] args) {

/*
		 1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
		三角形、其它三角形或不是三角形，如圖示結果：
		(進階功能：加入直角三角形的判斷)
 */
// 設計判斷是否為三角形，總共可以判斷10次，如果不想判斷了可以於第一個數字輸入-1結束迴圈
		
		finish:
		for(int count = 1;count <= 10;count ++){

		Scanner sc = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("(你總共可以判斷10次，" + "第" + count + "次)");
		System.out.println("(如果想結束判斷第一個數字輸入-1即可)");
		System.out.println("請輸入三個整數判斷是否為三角形(以空白鍵分開)： ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		while(a == -1) {
			break finish;
		}
		outer:
		while(true) {
		while(a + b > c && a + c > b && a * b * c != 0) {
		if(a == b && a == c) {
			System.out.println("正三角形");
			break outer;
		}else if(a == b || a == c || b == c){
			System.out.println("等腰三角形");
			break outer;
		}else if((a*a) + (b*b) == (c*c) || (c*c) + (b*b) == (a*a) || (a*a) + (c*c) == (b*b)) {
			System.out.println("直角三角形");
			break outer;	
		}else {
			System.out.println("其它三角形");
			break outer;
		}
		}
		System.out.println("你輸入的三個數字不能構成三角形 ! ");
		break outer;
		}		
	}		
		System.out.println("=============================================");
		System.out.println("恭喜你~結束囉~~~");

}
}
