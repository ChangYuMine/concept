package tw.com.google.www_concept;

//0827_1_52min

//身分證功能：1.出生地區 2.性別 3.驗證證號是否正確

public class TWID {
	
		private String id = "N123957488";
		/*(TWid物件類別中存在了字串id屬性，封裝(private)後只能透過建構式；
		 0827_1_56min40sec*/
		
		TWID(String id){
			
//			System.out.println("我是建構式");
			
			this.id = id;
			/*這一個ID代表String id，若不加this，可以把String中的id另外命名
	                              同時須傳遞參數給物件實體；參考0827_1_1hr15min*/
				
		}
		/*建構式：
		  1.沒有傳回值型別。
		  2.其方法名稱與類別名稱，大小寫區分需相同。
		  3.產生物件實體的初始化。 
		      ；0827_1_1hr12min50sec*/
		
		String getID(){
			
			
			return id;
			/*傳回身分證字串；0827_1_59min30sec*/
			 
		}
		
		boolean getGender(){
						
			//return false;
			//回傳性別
			
			return id.charAt(1)=='1';
			//用首碼判定性別；0827_1_1hr24min50sec			
		}
		
		String getArea(){
			
			return "台中市";
			//回傳居住地
			//參考身分證維基百科			
		}
		
		static boolean isOK(String testID){
		//0827_2_16min30sec			
			return true;
			//回傳驗證正確與否			
		}
		
		

}
		