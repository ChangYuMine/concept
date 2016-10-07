package tw.com.google.www_concept2;

import tw.com.google.www_concept.Bike;

/*觀念：
 	1.類別沒有public則可以任意改名;0828_3_46min20sec
 	
 	2.類別只有public或沒有存取修飾字兩種;0828_3_49min
 	
 	3.繼承觀念(父類別無傳參數建構式);0828_3_50min
	(對應package_concept內的Bike來看)
	
	4.Bike2不是public，所以即便內部建構式是public，也無法呼叫。
	;0828_3_53min
	
	5.不同package下的類別，即便有繼承關係，若方法沒有protected
	      以上的存取修飾字，也無法呼叫。
	  ;828_3_55min30sec
*/

class III021 extends Bike{
	
	void myUpspeed(){
		
			super.upSpeed();
	};
}

class III022 extends III01 {

}

