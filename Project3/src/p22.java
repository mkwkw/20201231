//20201230
//�׸���
//���� 2839
//����-5�� �ݺ������� ����, -5�� �ϰ� ���� ���� 5�� ������ �� �������°� �ƴϸ� 3���� �������°� ������
//����
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //���� ������ ����
		
		//ex1. 18
		//18-5 =13
		//13-5 =8
		//8-5 =3
		//3-3 =0
		//5ų��: 3�� 3ų��: 1�� ->4��
		
		//ex2. 6
		//6-5 =1 ����X
		//6-3 =3
		//3-3 =0
		//5ų��: 0�� 3ų��: 2�� -> 2��
		
		//ex3. 7
		//7-5 =2 ����X
		//7-3 =4
		//4-3 =1 ����X
		//-1 ���
		
		//�ּ� ���� ������ ���ϹǷ� 5ų�� ������ �����ϴ� ���� ���� ����������.
		int result = 0; //�ּ� ���� ����
		while(true) {
			//���԰� 5�� 3�� ���������� �����Ǵ��� 3���θ� �����Ǵ��� Ȯ���� �ʿ���.
			int n1 = num/5; 
			int n2 = num- n1*5;
			int n3 = n2%3;
			if(num>=5 && n3==0) { //���������� ���� or 5�θ� ����
				num=num-5;
				result++;
				
				
			}
			else if(num>=5 && n3!=0) { //3���θ� ����
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
