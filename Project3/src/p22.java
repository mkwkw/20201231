//20201230
//그리디
//백준 2839
//무게-5를 반복적으로 시행, -5를 하고 남은 것을 5로 나눴을 때 나눠지는가 아니면 3으로 나눠지는가 따지기
//성공
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //설탕 봉지의 무게
		
		//ex1. 18
		//18-5 =13
		//13-5 =8
		//8-5 =3
		//3-3 =0
		//5킬로: 3개 3킬로: 1개 ->4개
		
		//ex2. 6
		//6-5 =1 성립X
		//6-3 =3
		//3-3 =0
		//5킬로: 0개 3킬로: 2개 -> 2개
		
		//ex3. 7
		//7-5 =2 성립X
		//7-3 =4
		//4-3 =1 성립X
		//-1 출력
		
		//최소 봉지 개수를 구하므로 5킬로 봉지로 구성하는 것을 먼저 따져봐야함.
		int result = 0; //최소 봉지 개수
		while(true) {
			//무게가 5와 3이 복합적으로 구성되는지 3으로만 구성되는지 확인이 필요함.
			int n1 = num/5; 
			int n2 = num- n1*5;
			int n3 = n2%3;
			if(num>=5 && n3==0) { //복합적으로 구성 or 5로만 구성
				num=num-5;
				result++;
				
				
			}
			else if(num>=5 && n3!=0) { //3으로만 구성
				num=num-3;
				result++;
				
			}
			else {
				if(num==3) {
					num=num-3;
					result++;
					
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
