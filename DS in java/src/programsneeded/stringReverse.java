package programsneeded;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCA";
		System.out.println(reverse(str));
		
	}
	
	public static String reverse(String ining) {
		if(ining == null) {
			return "First enter the  string";
		}
		else {
			StringBuilder outting = new StringBuilder();
			char[] chars = ining.toCharArray();
			for(int i=chars.length-1; i >= 0;i--) {
				outting.append(chars[i]);
			}
			return outting.toString();
		}
		
	}
}
