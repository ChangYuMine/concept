package tw.com.google.www_concept;

/*
 轉型：0828_4_4min
  */

public class Transformation {

	public static void main(String[] args) {
		
		Brad401 obj1 = new Brad401();
		
		Brad402 obj2 = new Brad402();
		
		Brad401 obj3 = new Brad402();
		
		//Brad402 obj4 = new Brad401();
		//繼承觀念：父類別不會去做子類別的物件實體;0828_4_7min15sec
		
		obj1.m1();
		
		obj2.m1();
		
		obj3.m1();
		/*方法來自Brad401定義，但實作來自Brad402(物件實體)
		;0828_4_8min50sec*/
		

	}

}

class Brad401{
	
	int a = 1;
	
	void m1(){
		
		System.out.println("Brad401:m1:"+a);
	}
}

class Brad402 extends Brad401{
	
	int a = 2;
	
	void m1(){
		
		System.out.println("Brad402:m1:"+a);
	}
	
	void m2(){
		
		System.out.println("Brad402:m2");
	}
}

