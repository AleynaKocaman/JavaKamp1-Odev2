package variables;

public class variables {

	//reusability --> tekrar tekrar kullanabilmek

	public static void main(String[] args) {
		
		//deðiþkenler camelCase isimlendirme ile yazýlýr
		
		int ogrenciSayisi=10; //tam sayý türü
		String mesaj="Öðrenci saysý: ";
		
		/*
		System.out.println("Öðrenci sayýsý: 9");
		System.out.println("Öðrenci sayýsý: 9");
		System.out.println("Öðrenci sayýsý: 9");
		*/
		
		/*
		System.out.println("Öðrenci sayýsý: "+ogrenciSayisi);
		System.out.println("Öðrenci sayýsý: "+ogrenciSayisi);
		System.out.println("Öðrenci sayýsý: "+ogrenciSayisi);
		*/
		
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println(mesaj+ogrenciSayisi);
		
		
		

	}

}
