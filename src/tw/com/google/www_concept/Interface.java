package tw.com.google.www_concept;

//0828
/*1.定義那些類別符合規格。
  2.用證照觀念來思考。*/

public class Interface {

	public static void main(String[] args) {		
		
		 john4 j1 = new john4();//車子
		 
		 john2 j2 = new john2();//輪胎1
		 
		 john3 j3 = new john3();//輪胎2
		 
		 j1.m1(j3);
		 
		 //觀念：0828_1_1hr1min
		 
	}

}

interface john1{
	
	void m1();
	
	void m2();
	
	//需宣告方法，但不能有實作。
	//例：你須考過證照，才能說是該職業職人，但不能說考證照的方法
	//觀念：0828_1_47min40sec
	
}

class john2 implements john1{
	
	public void m1(){System.out.println("john2:m1");
		
	}
	
	public void m2(){System.out.println("john2:m2");
		
	}
	//class john2實作interface john1。
	//1.當john2出現"{}"時，已定義、宣告該類別。
	/*2.java的介面無存取修飾字，一律是public，
	 	故需在類別方法前加上public。*/
	//觀念：0828_1_49min30sec
	
	void m3(){System.out.println("john2:m3");
		
	}
}

class john3 implements john1{
	
	public void m1(){System.out.println("john3:m1");
				
	}
	
	public void m2(){System.out.println("john3:m2");
		
	}
	
	void m4(){System.out.println("john3:m4");
		
		
	}
}

class john4{
	
	void m1(john1 obj1){
		
		obj1.m1();
		
		obj1.m2();
	//對立思考：為何上述john2和john3為何不各自獨立實作就好??
	//介面實作目的在於傳遞方法參數給john4的m1方法
	//觀念：0828_1_57min20sec
				
	}
}

