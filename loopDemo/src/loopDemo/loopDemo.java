package loopDemo;



public class loopDemo {

	public static void main(String[] args) {
		
		//for d�ng�s�
	for (int i=1; i<=10; i++) {
		System.out.println(i);
	}	
	System.out.println("ilk d�ng� bitti");
	
	for (int i=2; i<=10; i+=2) {
		System.out.println(i);
	}
	System.out.println("ikinci d�ng� bitti");
	
	    //while d�ng�s�
	
	int i=1;
	/*
	 SONSUZ D�NG�
	while(i<10) {
		System.out.println(i);
	}
	*/
	
	while(i<10) {
		System.out.println(i);
		i++;
	}
	System.out.println("While d�ng�s� bitti");
	
	   //do-while d�ng�s�
	
	int j=1;
	do {
		System.out.println(j);
		j+=2;
		
	}while(j<10);
	
	System.out.println("do-while d�ng�s� bitti");

	int k=100;
	do {
		System.out.println(k);
		k+=2;
		
	}while(k<10);
	
	System.out.println("d�ng� �al��masa bile bir kere d�ng�y� d�nd�r�r");
	
	}

}
