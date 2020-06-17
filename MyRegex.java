package OOPLearning;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

	public static void main(String[] args) {
		
		while (true) {
		
			Pattern eslesme = Pattern.compile("(\\d+).(\\d+).(\\d+).(\\d+)");
			System.out.println("Bir IP Adresi Giriniz : ");
			Scanner scan = new Scanner(System.in);
			String ip = new String(scan.next(eslesme));
			
			Matcher match = eslesme.matcher(ip);
			
			while(match.find()) {
				if(match.group(1).length() <= 3 && match.group(2).length() <= 3 && match.group(3).length() <= 3 && 
						Integer.parseInt(match.group(4)) > 0 && Integer.parseInt(match.group(4)) <= 256
						)
					System.out.println("YES  " + ip);
				else {
					System.out.println("Last Number Group Must Be 0 - 256 Numbers");
				}
			}
			
		}
	}

}
