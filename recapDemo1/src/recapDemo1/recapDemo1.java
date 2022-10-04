package recapDemo1;

public class recapDemo1 {


	public static void main(String[] args) {
		
		int sayý1=9;
		int sayý2=15;
		int sayý3=99;
		
		//1.ÇÖZÜM
		int max=sayý1;
		
		if(max<sayý2) {
			max=sayý2;
		}
		
		if(max<sayý3) {
			max=sayý3;
		}
		
		System.out.println(max);
		
		
		/*
		  2.ÇÖZÜM
		 
		int max;
		//bir sayý temel sayý olarak al 
		//onu if bloklarý ile karþýlaþtýr
		
		if(sayý1<sayý2) {
			
			//20<25 eðer true ise  zaman sayý 2 büyüktür
			max=sayý2; //onu max deðere ata
			if(max<sayý3) {//max deðeri sayý3  ile karþýlaþtýr
				max=sayý3;//eðer true ise max sayýya ata
				} 
			
		}else {  //deðil ise o zaman sayý1 büyüktür 
			
			max=sayý1; //onu max deðiþkene ata
			if(max<sayý3) {//max deðeri sayý3  ile karþýlaþtýr
				max=sayý3;//eðer true ise max sayýya ata
				}
			
		}
		
		System.out.println(max);//en son max deðeri yazdýr
		*/
		
		
	}

}
