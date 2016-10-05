package tw.com.google.www_concept;

/*觀念：
call static例外堆疊:
 當父類別拋出例外時，若依序之子類別沒有處理，則會遞次堆疊， 
 一直到實作方法public處理throws Excpetion(處理方式1) 
 或者是try catch(處理方式2) 。
;0828_5_25minsec*/

public class Exceptions3 {

	public static void main(String[] args) throws Exception{
		
		Brad433 obj1 = new Brad433();
		
		obj1.m3();
	}

}

class Brad431{
	
	void m1()throws Exception{
		
		throw new Exception();
	}
}

class Brad432 extends Brad431{
	
	void m2()throws Exception{
		
		m1();
	}
}

class Brad433 extends Brad432{
	
	void m3() throws Exception{
		
		m2();
	}
}
