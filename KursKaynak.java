import java.util.ArrayList;
import java.util.Scanner;

public class KursKaynak {

	public static void main(String[] args){
		
		// Algoritma Çözümleri 
		
		while(true) {
			
			System.out.println("Bir Sayý Giriniz : ");
			Scanner scan = new Scanner(System.in);
			ArrayList<Integer> result = ArrayList(scan.nextInt());
			System.out.println(result);
		}
		
	}
	
	public static ArrayList<Integer> ArrayList (int data) {
		
		ArrayList<Integer> carpanlar = new ArrayList<Integer>();
		
		for(int i = data; i >= 1; i--) {
			if(data % i == 0) {
				carpanlar.add(i);
			}
		}
		
		return carpanlar;
	}
}