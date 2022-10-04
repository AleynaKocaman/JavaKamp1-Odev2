package loopDemo;



public class loopDemo {

	public static void main(String[] args) {
		
		//for döngüsü
	for (int i=1; i<=10; i++) {
		System.out.println(i);
	}	
	System.out.println("ilk döngü bitti");
	
	for (int i=2; i<=10; i+=2) {
		System.out.println(i);
	}
	System.out.println("ikinci döngü bitti");
	
	    //while döngüsü
	
	int i=1;
	/*
	 SONSUZ DÖNGÜ
	while(i<10) {
		System.out.println(i);
	}
	*/
	
	while(i<10) {
		System.out.println(i);
		i++;
	}
	System.out.println("While döngüsü bitti");
	
	   //do-while döngüsü
	
	int j=1;
	do {
		System.out.println(j);
		j+=2;
		
	}while(j<10);
	
	System.out.println("do-while döngüsü bitti");

	int k=100;
	do {
		System.out.println(k);
		k+=2;
		
	}while(k<10);
	
	System.out.println("döngü çalýþmasa bile bir kere döngüyü döndürür");
	
	}

}
