//20201230
//그리디
//백준 2839
//무게-5를 반복적으로 시행, -5를 하고 남은 것을 5로 나눴을 때 나눠지는가 아니면 3으로 나눠지는가 따지기
//오류 발생
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //설탕 봉지의 무게
		
		
		int result = 0;
		while(true) {
			if(num>=5) {
				num=num-5;
				result++;
				System.out.println("5이상 "+result );
				
			}
			else {
				if(num==3) {
					num=num-3;
					result++;
					System.out.println("3 "+result);
				}
				else if(num==0) {
					break;
				}
				else {
					
					result=-1;
					break;
				}
			}
			
		
		}
		System.out.println(result);
		
	}

}
