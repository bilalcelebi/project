import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz : ");
		int birinci = scan.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		int ikinci = scan.nextInt();
		scan.close();
		int durum = 0;
		
		while(true) {
			
			int islem = birinci * ikinci;
			String sonuc = Integer.toString(islem);
			String reversing = new StringBuilder(sonuc).reverse().toString();
			
			if(Integer.parseInt(sonuc) == Integer.parseInt(reversing)) {
				System.out.println("Sonuç Bulundu : " + sonuc);
				durum = 1;
				break;
			}
			else {
				birinci++;
				ikinci++;
			}
		}
		
		if(durum == 0)
			System.out.println("Bulunamadý");
	}

}
