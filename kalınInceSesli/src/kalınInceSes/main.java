package kalýnInceSes;

public class main {

	public static void main(String[] args) {

		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'I':
		case '0':
		case 'U':
			System.out.println(" Kalýn sesli harf ");
			break;
		case 'E':
		case 'Ý':
		case 'Ö':
		case 'Ü':
			System.out.println(" Ýnce sesli harf ");
			break;
		default:
			System.out.println("Sessiz  harf ");

		}

	}

}
