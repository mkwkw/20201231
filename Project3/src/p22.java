//20201230
//�׸���
//���� 2839
//����-5�� �ݺ������� ����, -5�� �ϰ� ���� ���� 5�� ������ �� �������°� �ƴϸ� 3���� �������°� ������
//���� �߻�
import java.util.*;
public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //���� ������ ����
		
		
		int result = 0;
		while(true) {
			if(num>=5) {
				num=num-5;
				result++;
				System.out.println("5�̻� "+result );
				
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
