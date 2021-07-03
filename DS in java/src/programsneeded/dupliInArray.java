package programsneeded;

public class dupliInArray {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		int Arr[] = new int[]{1,2,3,4,5,7,7,3,2,10}; 
        for(int i=0;i<=Arr.length;i++) {
        	for(int j = i+1;j<Arr.length;j++) {
        		if(Arr[i]==Arr[j]) {
        			System.out.println(Arr[i]);
        		}
        	}
        
        }
	}

}
