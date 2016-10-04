package tw.com.google.www_concept;

public class Equals {

	public static void main(String[] args) {
		
		//觀念：0828_2_30min20sec
		
		String a = "john";
		
		String b = "john";
		
		String c = new String("john");
		
		String d = new String("john");
		
		if(a.equals(d)){
			
			System.out.println("OK");
		
		}else{
			
			System.out.println("XX");
		}
	}

}
