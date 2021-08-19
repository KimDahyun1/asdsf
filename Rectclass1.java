//while문 분법으로 변경
public class Rectclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j<=10; j++) {
				if(i == 1 || i == 5 || j == 1 || j ==10) {
				System.out.print("*");	
				}
				else {
					System.out.print(" ");
			}
		}
			System.out.println();
	}
		
	
		int i=0;
			while (i<5) {
				int j=0;
				while (j < 10) 
				{
					if(i==0||i==4||j==0||j==9) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
						
					}
					j++;
					
				}
				
				i++;
				System.out.println();
			}
		
		
		
		
		
	}
		
}

