package asalSayý;

public class asalSayý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayý=2;
		int sayac=0;
		
		for (int i = 2; i < sayý; i++) {
			if(sayý%i==0) {
				sayac++;
			}
		}
		
		if(sayý<1) {
			System.out.println("geçerli sayý giriniz");
			}else if(sayý==1) {
				System.out.println("sayý asal deðildir");
			}else if(sayý==2) {
				System.out.println("sayý asal sayýdýr");
			}else {
				
				if(sayac>0) {
					System.out.println("sayý asal deðildir");
				}else {
					System.out.println("sayý asaldýr");
					}
				
			}
		

		

	}

}
