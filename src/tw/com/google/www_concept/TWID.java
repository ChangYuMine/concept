package tw.com.google.www_concept;

//0827_1_52min

//身分證功能：1.出生地區 2.性別 3.驗證證號是否正確

public class TWID {
	
		private String id = "N123957488";
		/*(TWid物件類別中存在了字串id屬性，封裝(private)後只能透過建構式；
		 0827_1_56min40sec*/
		
		TWID(){
			
			
		}
				
		TWID(boolean gender){
			
			
		}
		
		TWID(int area){
			
			
		}
//		建構式命名限制：0827_3_40min50sec
		
		TWID(boolean gender,int area){
			
			
		}
//		方法2：0827_3_39min；身份證字號產生器	
		
		
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
			
			boolean ret = false; 
			
			if(testID.matches("^[A-Z][12][0-9]{8}$")){
			//驗證條件：1.長度須為10 ，	2.字母A-Z需大寫	 ，3.第二碼需為1或2，4.第3-10碼須為0-9	
			/*正規表示法：
			 if(test.matches("^A123456789$"))
			  上式比對的是整個字串
			 if(test.matches("^[A-Z][12][0-9]{8}$"))
			 
			 1.[]可用範圍性或分別列舉或並存
			 2.{}代表字元數出現的次數，如{8}，只會出現8個數字。
			 3.字首如果是固定字元，可不用加[]，如手機號碼。
			 */
				
			String check="ABCDEFGHJKLMNPQRSTUVXYWZIO";
			//0827_3_8min50sec
			
			int a = check.indexOf(testID.charAt(0))+10;
			/*利用indexof和charAt取得字母所在位置，再加上10，
			      即可取得身分證字母所代表的數字；0827_3_10min*/
			
			int a1 = a/10;
			
			int a2 = a%10;
			//把英文字母數字代表拆開，例：A拆成1跟0，以符合驗算公式。
			
			int a3 = Integer.parseInt(testID.substring(1, 2));
			//Integer.parseInt：	0827_3_17min30sec
			//substring：0827_3_19min
			int a4 = Integer.parseInt(testID.substring(2, 3));
			int a5 = Integer.parseInt(testID.substring(3, 4));
			int a6 = Integer.parseInt(testID.substring(4, 5));
			int a7 = Integer.parseInt(testID.substring(5, 6));
			int a8 = Integer.parseInt(testID.substring(6, 7));
			int a9 = Integer.parseInt(testID.substring(7, 8));
			int a10 = Integer.parseInt(testID.substring(8, 9));
			int a11 = Integer.parseInt(testID.substring(9, 10));
			
			int total = a1*1 + a2*9 + a3*8 + a4*7 
					
						+ a5*6 + a6*5 + a7*4 + a8*3
						
						+ a9*2 + a10*1 + a11*1;
			
			ret=total%10==0;
			//套用身分證計算公式
							
			ret = true;
				
			}else{
				
				ret = false;
				
			}
			return ret;
			//回傳驗證正確與否
				
		}
		
		//static boolean preCheck(String testID){		
		//0827_2_23min
			
			//boolean isOK = false;
			//預設布林值為false			
			
			//if(testID.length()==10){
			//檢查字串長度是否為10
			//0827_2_36min50sec
								
				//if(testID.charAt(1)=='1'||testID.charAt(1)=='2'){
				//比對首碼是否為1或2
					
					
					//抽出第一碼，testID.charAt(0)
					//是否為A-Z在字串中；.indexof(A-Z);
					//0827_2_39min；				
					
				//}
			
			//}
			//只要上述if式未通過檢查，即直接回傳預設布林值(false)
			//用正規表示法前
//			
//			return isOK;
//			
//		}
		
		

}
		