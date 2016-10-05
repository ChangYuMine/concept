package tw.com.google.www_concept;

import javax.management.JMException;

import jdk.internal.org.xml.sax.SAXException;

/*
 自行拋出例外讓開發者處理：0828_4_50min
*/

public class Exceptions2 {

	public static void main(String[] args) {
		
		Bird b1 = new Bird();
		
		try{
		
		b1.setLeg(3);
		
		System.out.println(b1.leg);}
		
		catch (RuntimeException e){
			
			System.out.println("笨蛋!!鳥只有兩隻腳!!");
		}
		
		System.out.println("再去多看點書!!");
		//讓開發者處理例外
		
		Brad421 obj1 = new Brad421();
		
		try
		
		{obj1.m1(2);}
		
		catch (JMException e)
			
		{System.out.println("錯了!!");}
		
		catch (SAXException e)
		
		{System.out.println("又錯了!!");}
		//已經在Brad421宣告例外，所以在這邊要處理。
	}

}

class Bird{
	
	int leg;
	
	void setLeg(int n){
		
		leg = n;
		
		if(n<0 || n>2){
			
			throw new RuntimeException();
		//拋出例外
		}		
	}	
}

class Brad421{
		
	void m1(int n) throws JMException, SAXException{
	//check例外(編譯時期)，直接宣告例外：0828_4_58min25sec
		
			if(n<0){
				
				throw new JMException();				
			
			}else{
				
				throw new SAXException();
			}
	}
}
