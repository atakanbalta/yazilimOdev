package tr.medipol.yazilim;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ToplamaTest {
	@Test
	public void testNegatifToplama() {
		//Given
		Hesap toplama = new Toplama();
		String sayi1 = "-500";
		String sayi2 = "-50000";

		//When
		String sonuc =toplama.sonucHesap(sayi1,sayi2);

		//Then
		assertEquals("-50500", sonuc);
		
	}
	
	@Test
	public void testPozitifToplama() {
		//Given
		Hesap toplama = new Toplama();
		String sayi1 = "500";
		String sayi2 = "50000";

		//When
		String sonuc =toplama.sonucHesap(sayi1,sayi2);

		//Then
		assertEquals("50500", sonuc);
		
	}
	@Test
	public void testSifirIleToplama() {
		//Given
		Hesap toplama = new Toplama();
		String sayi1 = "500";
		String sayi2 = "0";

		//When
		String sonuc =toplama.sonucHesap(sayi1,sayi2);

		//Then
		assertEquals("500", sonuc);
		
	}
	@Test
	public void testBuyukSayi() {
		//Given
		Hesap toplama = new Toplama();
		String sayi1 = "1000000";
		String sayi2 = "9000000";

		//When
		String sonuc =toplama.sonucHesap(sayi1,sayi2);

		//Then
		assertEquals("10000000", sonuc);
		
	}
	
	
	
	
	

}
