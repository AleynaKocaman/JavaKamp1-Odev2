package switchDemo;

public class switchDemo {
	

	public static void main(String[] args) {
	
		char grade ='F' ;
		switch ( grade ) {
		    case 'A' :
		         System.out.println ( " Mukemmel : Geçtiniz " ) ;
		         break ;
		    case 'B' :
		         System.out.println ( " Çok Guzel : Geçtiniz " ) ;
		         break ;
		    case 'C' :
		         System.out.println ( " iyi : Geçtiniz " ) ;
		         break ;
		    case 'D' :
		         System.out.println ( " Fena Deðil Geçtiniz " ) ;
		         break ;
		    case 'F' :                       
		         System.out.println ( " Maalesef Kaldýnýz " ) ;
		         break ;
		    default :
		         System.out.println ( " Geçersiz not girdiniz " ) ;
		}
		

	}

}
