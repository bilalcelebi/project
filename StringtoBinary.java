import java.util.Scanner;

public class StringtoBinary {
	
public static void main(String[] args){
		
		while(true) {
			
			System.out.println("Bir S�zc�k Giriniz : ");
			Scanner scan = new Scanner(System.in);
			String sozcuk = scan.next();
			String sonuc = "";
			
			for(int i = 0; i < sozcuk.length(); i++) {
				
					int harf = sozcuk.charAt(i);
					String result = toBinary(harf);
					sonuc += result;
			}
			
			System.out.println("Sonu� : " + sonuc);
		}
		
	}

	public static String toBinary(int sayi) {
	
		String binaryconvert = Integer.toBinaryString(sayi);
	
		return binaryconvert;
	}
}
