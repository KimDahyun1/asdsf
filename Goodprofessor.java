import java.util.Scanner;

public class Goodprofessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("����� �����ϴ� �������� �Է��ϼ���");
			String professor = sc.next();
			
			if(professor.contentEquals("������")) {
				System.out.println("�����л��Դϴ�.");
				break;
			}
			else {
				System.out.println("�ٽ� ������ ������̤�");
			}
		}
	}

}
