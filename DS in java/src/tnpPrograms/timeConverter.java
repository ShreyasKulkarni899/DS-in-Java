package tnpPrograms;

public class timeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour=07,min=05,sec=45;
		String zone= "PM"; 
		
		
		if(hour <=12 && min <=59 && sec<=59)
		{
			if((zone.toLowerCase().equals("pm")==true) && (hour!=0)&&(hour != 12)) {
				hour = hour +12;
			}
			if((zone.toLowerCase().equals("am")==true)&& (hour == 12)) {
				hour = 0;
			}
			System.out.println(hour+":"+min+":"+sec);
		}else {
			System.out.println("Worng inputs");
		}
	}

}
