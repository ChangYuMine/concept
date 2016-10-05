package tw.com.google.www_concept;

import java.io.IOException;

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
		
		Brad422 obj2 = new Brad422();
		
//		obj2.m1(1);
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

class Brad422 extends Brad421 {	

	void m1(int n)throws JMException, SAXException{
	/*父類別有例外處理，override的子類別可先拋出例外處理，
	 但子類別例外處理須比父類別"範圍小"以及"數量少";0828_5*/		
//		super.m1(n);
		
		int a=10,b=3;
		
		try{
			
		int c = a/b;
		
		}catch (RuntimeException e){
			
			System.out.println("抓到了!!");
		
		}finally{
			
			System.out.println("遊戲結束!!");
		}
		
		System.out.println("馬照跑!!舞照跳!!");
	};
}
/*try catch的三種型態：

a.try{ }catch( ){ }：一般捕捉例外

b.try{ }catch( ){ }finally{ }：確保結構的完整性，到finally即會結束。

c.try{ }finally{ }：沒有要捕捉例外，但在離開前仍會執行finally。

;0828_5_12min30sec*/
