package asalSay�;

public class asalSay� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int say�=2;
		int sayac=0;
		
		for (int i = 2; i < say�; i++) {
			if(say�%i==0) {
				sayac++;
			}
		}
		
		if(say�<1) {
			System.out.println("ge�erli say� giriniz");
			}else if(say�==1) {
				System.out.println("say� asal de�ildir");
			}else if(say�==2) {
				System.out.println("say� asal say�d�r");
			}else {
				
				if(sayac>0) {
					System.out.println("say� asal de�ildir");
				}else {
					System.out.println("say� asald�r");
					}
				
			}
		

		

	}

}
