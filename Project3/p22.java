//20201230
//�׸���
//���� 2839
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //���� ������ ����
		
		int three = 0; //3ų�� ���� ����
		int five = 0; //5ų�� ���� ����
		int sum = 0; //�� ���� ����
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
