package say�Bulma;

public class say�Bulma {


	public static void main(String[] args) {
		
		int[] say�lar=new int[] {1,2,5,7,9,0};
		int aranacakSay�=1;
		boolean varM�=false;
		
		for (int i = 0; i < say�lar.length; i++) {
			
			if(say�lar[i]==aranacakSay�) {
				varM�=true;
				break;
			}
			
		}
		
		if(varM�) {
			System.out.println("say� dizide bulunuyor");
			
		}else {
			System.out.println("say� dizide bulunmuyor");
		}
 
	}

}
