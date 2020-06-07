package Calculator;

import java.util.Scanner;

public class main{

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Ýþlemi Giriniz : ");
			String islem = scan.next();
			int deger = 0;
			
			if(!islem.equals("q")) {
				System.out.println("Veriyi Giriniz : ");
				int veri = scan.nextInt();
				calc.setDisplay_value(veri);
				deger = veri;
			}
			
			if(islem.equals("/")) {
				calc.bolme(deger);
				System.out.println("Durum : " + calc.getToplam());
			}
			else if(islem.equals("*")) {
				calc.carpma(deger);
				System.out.println("Durum : " + calc.getToplam());
			}
			else if(islem.equals("+")) {
				calc.toplama(deger);
				System.out.println("Durum : " + calc.getToplam());
			}
			else if(islem.equals("-")) {
				calc.cikarma(deger);
				System.out.println("Durum : " + calc.getToplam());
			}
			else if(islem.equals("q")) {
				System.out.println("Result : " + calc.getToplam());
				break;
			}
			
		}
	}

}
		

