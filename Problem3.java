import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
	
public static void main(String[] args){
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		System.out.println("Bir Sayý Giriniz : ");
		Scanner scanner = new Scanner(System.in);
		int veri = scanner.nextInt();
		
		for(int i = 1; i <= veri; i++) {
			if(veri % i == 0 && asalmi(i) == 1) {
				liste.add(i);
			}
		}
		
		System.out.println("Result : " + liste);
		
	}
	
	
	public static int asalmi(int data) {
		int asal = 1;
		int result = 0;
		
		for(int i = 2; i < data; i++) {
			for(int j = i; j < data; j++ ) {
				if(data % j == 0) {
					asal = 0;
					break;
				}
			}
			
			if(asal == 1) {
				result = 1;
				break;
			}
			else{
				result = 0;
				break;
			}
		}
		
		return result;
	}

}
