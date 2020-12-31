//20201230
//그리디
//백준 2839
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //설탕 봉지의 무게
		
		int three = 0; //3킬로 봉지 개수
		int five = 0; //5킬로 봉지 개수
		int sum = 0; //총 봉지 개수
		five = num/five;
		
		num= num- 5*five;
		
		if(num%3==0) {
			three = num/3;
			
			sum = five+three;
			System.out.println(sum);
		}
		else
			System.out.println(-1);
		
		
		
	}

}
