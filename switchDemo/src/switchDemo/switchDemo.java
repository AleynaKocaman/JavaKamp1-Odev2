package switchDemo;

public class switchDemo {
	

	public static void main(String[] args) {
	
		char grade ='F' ;
		switch ( grade ) {
		    case 'A' :
		         System.out.println ( " Mukemmel : Ge�tiniz " ) ;
		         break ;
		    case 'B' :
		         System.out.println ( " �ok Guzel : Ge�tiniz " ) ;
		         break ;
		    case 'C' :
		         System.out.println ( " iyi : Ge�tiniz " ) ;
		         break ;
		    case 'D' :
		         System.out.println ( " Fena De�il Ge�tiniz " ) ;
		         break ;
		    case 'F' :                       
		         System.out.println ( " Maalesef Kald�n�z " ) ;
		         break ;
		    default :
		         System.out.println ( " Ge�ersiz not girdiniz " ) ;
		}
		

	}

}
