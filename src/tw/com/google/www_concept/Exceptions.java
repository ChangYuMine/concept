package tw.com.google.www_concept;

/*0828_4_16min

1.Exceptions分為:
a.runtime(執行時發生)。
b.check(開發階段就應避免發生，即事先檢查好的)。

*/
public class Exceptions {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 0;
		
		int[]c = {1,2,3};
		
		try{
					
		System.out.println(a/b);
		
		System.out.println(c[4]);		
		/*若被catch到，即便下式列為正確，但從錯誤列開始皆不會印出
		;0828_4_32min10sec。*/
		
		}catch (ArithmeticException e){		
					
			System.out.println("抓到了!!");
		
		}catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println("再次抓到了!!");
			
		}catch(RuntimeException e){
		/*如果不清楚實際例外處理狀況，可一律用RuntimeExcpetion處理
		;0828_4_38min40sec。
	  	例外處理有父子類別關係的話，父類別須在子類別之後
	  	;0828_42min10sec。*/
			
			System.out.println("全部抓到了!!");}
		
		System.out.println("舞照跳!!馬照跑!!");

	}

}
