package variables;

public class variables {

	//reusability --> tekrar tekrar kullanabilmek

	public static void main(String[] args) {
		
		//de�i�kenler camelCase isimlendirme ile yaz�l�r
		
		int ogrenciSayisi=10; //tam say� t�r�
		String mesaj="��renci says�: ";
		
		/*
		System.out.println("��renci say�s�: 9");
		System.out.println("��renci say�s�: 9");
		System.out.println("��renci say�s�: 9");
		*/
		
		/*
		System.out.println("��renci say�s�: "+ogrenciSayisi);
		System.out.println("��renci say�s�: "+ogrenciSayisi);
		System.out.println("��renci say�s�: "+ogrenciSayisi);
		*/
		
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println(mesaj+ogrenciSayisi);
		
		
		

	}

}
