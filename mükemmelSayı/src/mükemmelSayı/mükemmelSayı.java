package mükemmelSayý;

public class mükemmelSayý {

	

	public static void main(String[] args) {
		
		int sayý=28;
		int toplam=0;
		for (int i = 1; i <sayý; i++) {
			if(sayý%i==0) {
				toplam+=i;
			
			}
		}
		
		if(toplam==sayý) {
			System.out.println("mükemmel sayýdýr");
		}else {
			System.out.println("mükemmel sayý deðildir");
		}

	}

}
