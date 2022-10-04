package recapDemo2;

public class recapDemo2 {


	public static void main(String[] args) {
		
		double[] myList= {1.2,1.3,4.3,5.6};
		double total=0;
		double max=myList[0];
		
		for(double number:myList) {
			
			if(max<number) {max=number;}
			total=total+number;
			System.out.println(number);
		}
		
		System.out.println(total);
		System.out.println(max);
		
		//ÇOK BOYUTLU DÝZÝLER
		
		String [ ] [ ] sehirler= new String [ 3 ] [ 3 ] ;
		sehirler [ 0 ] [ 0 ] = " Ýstanbul " ;
		sehirler [ 0 ] [ 1 ] = " Bursa " ;
		sehirler [ 0 ] [ 2 ] = " Bilecik " ;
		sehirler [ 1 ] [ 0 ] = " Ankara " ; 
		sehirler [ 1 ] [ 1 ] = " Konya " ;
		sehirler [ 1 ] [ 2 ] =" Kayseri " ;
		sehirler [ 2 ] [ 0 ] = " Diyarbakýr " ;
		sehirler [ 2 ] [ 1 ] = " Þanlýurfa " ;
		sehirler [ 2 ] [ 2 ] = " Gaziantep " ;
		
		
		for ( int i = 0 ; i <=2 ; i ++ ) {	   
			   System.out.println("-------------------------");
		   for ( int j = 0 ; j <=2 ; j ++ ) {
			
		      System.out.println ( sehirler [ i ] [ j ] ) ;
		   } 
	}
 
		
		
		
		
		
	}
}
	
