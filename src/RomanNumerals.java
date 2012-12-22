
public class RomanNumerals {

	public String toRoman(int nmber) {
		String roman = "";
		while(nmber > 999){
			roman += "M";
			nmber -= 1000;
		}
		if(nmber > 899){
			roman += "CM";
			nmber -= 900;
		}
		if(nmber > 499){
			roman += "D";
			nmber -= 500;
		}
		if(nmber > 399){
			roman += "CD";
			nmber -= 400;
		}
		while(nmber > 99){
			roman += "C";
			nmber -= 100;
		}
		if(nmber > 89){
			roman += "XC";
			nmber -= 90;
		}
		if(nmber > 49){
			roman += "L";
			nmber -= 50;
		}
		if(nmber > 39){
			roman += "XL";
			nmber -= 40;
		}
		while(nmber > 9){
			roman += "X";
			nmber -= 10;
		}
		if(nmber > 8){
			roman += "IX";
			nmber -= 9;
		}
		if(nmber > 4){
			roman += "V";
			nmber -= 5;
		}
		if(nmber > 3){
			roman += "IV";
			nmber -= 4;
		}
		while(nmber > 0){
			roman += "I";
			nmber -= 1;
		}
		return roman;
	}

}
