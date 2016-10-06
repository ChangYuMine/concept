package tw.com.google.www_concept;

//0828_3

public class InterfaceII {

	public static void main(String[] args) {
		
		final int a = 10;
		//區域變數		
		
		System.out.println(Brad6.c);
		/*觀念：Brad5的C值是static
			
			;0828_3_26min30sec*/	

	}

}

interface Brad1{
	
	void m1();
}

interface Brad2{
	void m2();
}

class Brad3 implements Brad1,Brad2{
	
	public void m1(){
		
	}
	
	public void m2(){
		
	}
	
	//觀念：只能找一個父類別，但介面可以多個(一個人可以有多張證照(介面))，但都需要有實作方法;0828_3
}

interface Brad4 extends Brad1{
	
	int a = 10;
	/*觀念：介面除方法外，也可以有屬性，但宣告同時就必須給值
	 
	 ;0828_3_10min20sec*/ 

	
	void m3();	
	/*觀念：介面可以繼承介面(只能繼承介面)
	 
	 (乙級(m3方法)證照接續丙級證照(m1和m2方法));
	 
	 ，但m1和m2要有被實作，0828_3_4min35sec*/	
	
}

interface Brad5 extends Brad1,Brad2{
	
	int c = 10;
		
	void m3();
	
	/*介面可以繼承多個介面，但須一起實作方法(class Brad6)
	 
	 0828_3_7min10sec*/	
}

class Brad6 implements Brad5{
	
	int a;
	
	final int b;
	
	Brad6(){
		
		b=10;
	}
	/*觀念：final變數只能給值一次
	 
	 ;0828_3_13min*/
	
	public void m1(){
		
		a++;
		
	}
	
	public void m2(){
		
	}
	
	public void m3(){
		
	}
	
}