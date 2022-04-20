import java.util.Scanner;
	public class Watermelon{
		public static void main(String args[ ]){
			Scanner scan = new Scanner(System.in);
		  System.out.print("반지름을 입력하세요:");

		  int melon = scan.nextInt();
		  double pi = 3.14;
		  int cal = melon;
		
		  System.out.println("수박의 넓이는:" + (pi*cal*cal));



		}
	}