import java.util.Scanner;
public class NotOrtalamasiHesaplamaOrnegi {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner inp = new Scanner(System.in); // Scanner classýndan inp isimli obje ürettim.
		
		System.out.print("Mat notunu giriniz :");
		mat = inp.nextInt();
		
		System.out.print("Fizik notunu giriniz :");
		fizik = inp.nextInt();
		
		System.out.print("Kimya notunu giriniz :");
		kimya = inp.nextInt();
		
		System.out.print("Turkce notunu giriniz :");
		turkce = inp.nextInt();
		
		System.out.print("Tarih notunu giriniz :");
		tarih = inp.nextInt();
		
		System.out.print("Müzik notunu giriniz :");
		muzik = inp.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6.0 ;
		System.out.println("Ortalamanýz : "+sonuc);
		
		String result = (sonuc > 60) ? "Geçti" : "Kaldý"; // Sonuç 60 dan büyükse resulta Geçti yi ata, deðilse Kaldý yý ata.
		System.out.println(result);

	}

}
