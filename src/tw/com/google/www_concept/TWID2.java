package tw.com.google.www_concept;

public class TWID2 {

	public static void main(String[] args) {
		
		TWID myid = new TWID("N123957488");
		
		TWID urid = new TWID("N203536243");
		//傳遞字串參數；0827_1_1hr17min25sec		
		
		System.out.println(myid.getID());
		
		System.out.println(urid.getID());
		
		System.out.println(myid.getGender()?"男生":"女生");
		
		System.out.println(urid.getGender()?"男生":"女生");
		
		System.out.println(myid.getArea());

	}

}
