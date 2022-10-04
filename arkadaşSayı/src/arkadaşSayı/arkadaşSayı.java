package arkadaşSayı;

public class arkadaşSayı {



	public static void main(String[] args) {
		
		int sayı1=22; //tam bölenler toplamı 284 olacak
		int sayı2=24; //tam bölenler toplamı 220 olacak
		int tamBölen1=0;
		int tamBölen2=0;
		
		for (int i = 1; i <sayı1; i++) {
			
			if(sayı1%i==0) {
				tamBölen1+=i;
			}
			
			if(sayı2%i==0) {
				tamBölen2+=i;
			}
	
			
		}
		
		System.out.println(sayı1+" tam bölen sayıların toplam: "+tamBölen1);
		System.out.println(sayı2+" tam bölen sayıların toplam: "+tamBölen2);

		if(sayı1==tamBölen2 & sayı2==tamBölen1) {
			System.out.println("Arkadaş sayılardır");
		}else {
			System.out.println("Arkadaş sayısı değildir");
		}
		
		
		
		
		
	}

}
