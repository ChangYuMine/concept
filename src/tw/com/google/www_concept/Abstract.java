package tw.com.google.www_concept;

/*
 0828_3_1hr:抽象類別
 */

public class Abstract {

	public static void main(String[] args) {
		
		Brad391 obj1 = new Brad391();
		
		Brad392 obj2 = new Brad393();
		//0828_3_1hr16min	
		
		Brad393 obj3 = new Brad393();
		
		Brad393 obj4 = (Brad393)obj2;
		//多型轉換;0828_3_1hr20min		

	}

}

class Brad391{
	
	void m1(){}
	
	void m2(){}
	
}

abstract class Brad392{
	
	Brad392(){System.out.println("Brad392");}
	
	/*抽象類別雖無法直接建構出物件實體，但抽象類別仍可以定義自己的建構式給子類別使用
	      對應Brad393來看;0828_3_1hr8min25sec	
	*/
	void m1(){System.out.println("Brad392:m1");}
	
	abstract void m2();
}

class Brad393 extends Brad392{
	
	void m2(){System.out.println("Brad392:m2");};
	/*當子類別繼承父類別為抽象類別時，則須有實作方法，否則只能繼續抽象(即Brad394...)
                  對應Brad392來看;0828_3_1hr10min
    */
	
	void m3(){System.out.println("Brad392:m3");}
}

final class Brad394{
	
	/*與抽象類別不會並存，final類別沒有繼承關係，即到我這裡為止。
	0828_4*/	
	
}
