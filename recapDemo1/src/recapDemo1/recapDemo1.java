package recapDemo1;

public class recapDemo1 {


	public static void main(String[] args) {
		
		int say�1=9;
		int say�2=15;
		int say�3=99;
		
		//1.��Z�M
		int max=say�1;
		
		if(max<say�2) {
			max=say�2;
		}
		
		if(max<say�3) {
			max=say�3;
		}
		
		System.out.println(max);
		
		
		/*
		  2.��Z�M
		 
		int max;
		//bir say� temel say� olarak al 
		//onu if bloklar� ile kar��la�t�r
		
		if(say�1<say�2) {
			
			//20<25 e�er true ise  zaman say� 2 b�y�kt�r
			max=say�2; //onu max de�ere ata
			if(max<say�3) {//max de�eri say�3  ile kar��la�t�r
				max=say�3;//e�er true ise max say�ya ata
				} 
			
		}else {  //de�il ise o zaman say�1 b�y�kt�r 
			
			max=say�1; //onu max de�i�kene ata
			if(max<say�3) {//max de�eri say�3  ile kar��la�t�r
				max=say�3;//e�er true ise max say�ya ata
				}
			
		}
		
		System.out.println(max);//en son max de�eri yazd�r
		*/
		
		
	}

}
