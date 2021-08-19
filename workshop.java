
public class workshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 분리버전
		for (int i = 1; i<=5; i++) {
			
		//spacebar를 출력하는 부분
			for (int j = 1; j<= 5-i; j++) {
			System.out.print(" ");
			
		}
			for (int j = 1; j<= 2*i-1; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		for (int i = 1; i <=4; i++) {
			//spcebar를 출력하는 부분
			for (int j = 1; j<= i; j++) {
			System.out.print(" ");
			
		}
			for (int j = 1; j<= 9-2*i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		//2.합친버전
		for (int i =1; i<=9; i++) {
			
			if(i <= 5) {
			//spacebar를 출력하는 부분
			for (int j = 1; j<= 5-i; j++) {
			System.out.print(" ");
			
		}
			for (int j = 1; j<= 2*i-1; j++) {
				System.out.print(j);
				
			}
			}
			else {
			for (int j = 1; j<= i-5; j++) {
			System.out.print(" ");
			
		}
			for (int j = 1; j<= 19-2*i; j++) {
				System.out.print(j);
				
			}
			}
			System.out.println();
		
	}
			
			System.out.println();
			

		
		
	//3.
	for (int i =1; i <= 9; i++) {
		int spaceNumber = ( i <= 5) ? 5 - i : i - 5;
		int maxNumber = (i <= 5) ? 2*1-1 : 19-2*i;
		for (int j = 1; j <= spaceNumber; j++) {
			System.out.print(" ");
			
		}
			for (int j = 1; j <= maxNumber; j++) {
				System.out.print(j);
				
			}
			System.out.println();
	}
}
}


