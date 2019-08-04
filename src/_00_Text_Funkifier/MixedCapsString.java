package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String hey = "";
		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0) {
				hey += String.valueOf(s.charAt(i)).toLowerCase();
			}
			else {
				hey += String.valueOf(s.charAt(i)).toUpperCase();
			}
		}
		return hey;
	}

}
