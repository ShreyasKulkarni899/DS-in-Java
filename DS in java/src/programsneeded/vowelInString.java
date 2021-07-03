package programsneeded;

public class vowelInString {
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelCheck("Shreyas");

	}
	
	public static void vowelCheck(String data) {
		//variable for storing the status for presence of vowel in string with use of .matches with regex help 
		boolean status = data.toLowerCase().matches(".*[aeiou].*");
		//for output showing
		if(status == false) {
			System.out.println("String not having any vowel in it");
		}else {
			System.out.print("Vowels are there!!");
		}
		 //else {
			//char chars[] = data.toLowerCase().toCharArray();
			//char vowelsChar[] = {'a','e','i','o','u'};
			//for(int i=0;i<=chars.length-1;i++) {
				//char temp = chars[i];
				//if(Character.compare(temp,vowelsChar[0]) == 1 || Character.compare(temp, vowelsChar[1])== 1 || Character.compare(temp, vowelsChar[2])== 1 || Character.compare(temp,vowelsChar[3])==1|| Character.compare(temp,vowelsChar[4])==1) {
					//System.out.println("Vowels present in " + data + chars[i]);
				//}
			//}
			
		//}
	}

}
