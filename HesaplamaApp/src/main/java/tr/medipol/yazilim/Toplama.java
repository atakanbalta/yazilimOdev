package tr.medipol.yazilim;
import java.math.BigDecimal;

public class Toplama implements Hesap {

	@Override
	public String sonucHesap(String sayi1, String sayi2) {
		
		return new BigDecimal(sayi1).add(new BigDecimal(sayi2)).toString();
	}
	
	
	
	
	
	

}
