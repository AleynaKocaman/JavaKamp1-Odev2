package arkada�Say�;

public class arkada�Say� {



	public static void main(String[] args) {
		
		int say�1=22; //tam b�lenler toplam� 284 olacak
		int say�2=24; //tam b�lenler toplam� 220 olacak
		int tamB�len1=0;
		int tamB�len2=0;
		
		for (int i = 1; i <say�1; i++) {
			
			if(say�1%i==0) {
				tamB�len1+=i;
			}
			
			if(say�2%i==0) {
				tamB�len2+=i;
			}
	
			
		}
		
		System.out.println(say�1+" tam b�len say�lar�n toplam: "+tamB�len1);
		System.out.println(say�2+" tam b�len say�lar�n toplam: "+tamB�len2);

		if(say�1==tamB�len2 & say�2==tamB�len1) {
			System.out.println("Arkada� say�lard�r");
		}else {
			System.out.println("Arkada� say�s� de�ildir");
		}
		
		
		
		
		
	}

}
