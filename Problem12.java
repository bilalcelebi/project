public class Problem12 {
	public static void main(String[] args) {
		
		// ProjectEuler 12.Problem Kodlamasý
		
		int number = 1;
		int fark = 2;
		int counter = 0;
		int bolen = 1;
		
		while(counter <= 500) {
			if(number % bolen == 0) {
				counter++;
			}
			number += fark;
			fark++;
			bolen++;
		}
		
		System.out.println("Result : " + number);
	}
}
