package sayıBulma;

public class sayıBulma {


	public static void main(String[] args) {
		
		int[] sayılar=new int[] {1,2,5,7,9,0};
		int aranacakSayı=1;
		boolean varMı=false;
		
		for (int i = 0; i < sayılar.length; i++) {
			
			if(sayılar[i]==aranacakSayı) {
				varMı=true;
				break;
			}
			
		}
		
		if(varMı) {
			System.out.println("sayı dizide bulunuyor");
			
		}else {
			System.out.println("sayı dizide bulunmuyor");
		}
 
	}

}
