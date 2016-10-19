package tw.com.google.www_concept;

//0827_3_42minsec

/*Java原始碼中可以有多個類別定義，但只有一個主類別程式，
      其存取修飾字為public，且其類別名稱需與原始檔名相同。
      ；0827_3_46min
*/

public class Construction {

	public static void main(String[] args) {
		
		Brad301 obj = new Brad301();
		
		Brad302 obj2 = new Brad302();
		

	}

}

class Brad301{
	
	Brad301(){System.out.println("a");}
	
	Brad301(int a){System.out.println("b");}
	
	Brad301(short a){System.out.println("c");}
			
/*overloading：傳遞的參數"型別"和"個數"的差異；0827_3_47min35sec*/	
		
}

class Brad302 extends Brad301{
/*繼承觀念；0827_3_55min35sec*/	
	
	/*複習進度：0827_3_	56min30sec
	 0827_PM_3_1min*/
	
}
