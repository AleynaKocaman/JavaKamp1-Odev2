package m�kemmelSay�;

public class m�kemmelSay� {

	

	public static void main(String[] args) {
		
		int say�=28;
		int toplam=0;
		for (int i = 1; i <say�; i++) {
			if(say�%i==0) {
				toplam+=i;
			
			}
		}
		
		if(toplam==say�) {
			System.out.println("m�kemmel say�d�r");
		}else {
			System.out.println("m�kemmel say� de�ildir");
		}

	}

}
