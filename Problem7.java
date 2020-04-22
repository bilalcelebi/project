import java.util.ArrayList;

public class Problem7 {
	public static void main(String[] args){
		
		// ProjectEuler 7.Problem Cevab�
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		int count = 0;
		int i = 0;
		while(count <= 10001) {
			if(asalmi(i) == 1) {
				count++;
				liste.add(i);
			}
			i++;
		}
		
		int result = count;
		System.out.println("Sonu� : " + liste.get(result - 3)); // ilk asal say� 3.indisten ba�layaca�i i�in 3 eksilterek ald�k
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
