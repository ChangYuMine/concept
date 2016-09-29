package tw.com.google.www_concept;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//0828
public class Windows$1 extends JFrame{

	/*Windows is a(是) JFrame
	(也可繼續父類別續推定義：例：is a Window，)，
	is a是繼承關係*/
	
	//Windows物件實體has a(擁有)JButton三個按鈕的物件實體
	//觀念：0828_1_1hr11min
	
	private JButton year,day,time;
	//觀念：0828_1_1hr6min30sec
	
	public Windows$1(){
	//語法上可以繼承父類別建構式，但實作上要初始化視窗物件，故仍需定義建構式
		
		super("萬年曆");
		//super父類別建構式：JFrame(String title)
		
		year = new JButton("Year");
		
		day = new JButton("Day");
		
		time = new JButton("Time");		
		//JButton建構式：JButton(String text)
		//進行JButton初始化時，將按鈕一併初始化。
		
		//setLayout(new FlowLayout(FlowLayout.RIGHT));
		//觀念：0828_1_1hr12min10sec(第 一種室內設計師概念)
		
		//FlowLayout is a Layoutmanager
		//觀念：0828_1_1hr17min(承接介面的觀念)
		
		//(new FlowLayout(FlowLayout.RIGHT));
		//觀念：0828_1_1hr28min
		
		
		setLayout(new BorderLayout());
		//觀念：0828_1_1hr26min
		//觀念：0828_1_1hr29min(第二種室內設計師概念)
		
		JPanel top = new JPanel
				
				(new FlowLayout(FlowLayout.LEFT));
		//觀念：0828_1_1hr33min30sec
		
		top.add(year);top.add(day);top.add(time);
		//觀念：0828_1_1hr22min
		//觀念：加入top：0828_1_1hr37min10sec
		
		add(top,BorderLayout.NORTH);
		//觀念：0828_1_1hr38min
				
		setSize(640, 480);
		//觀念：0828_1_27min
		
		setVisible(true);
		//觀念：0828_1_33min30sec
		/*到此行時執行程式雖可以出現實體視窗
		 	，但結束視窗後，程式仍留存於記憶體中*/
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//觀念：0828_1_36min
				
	}

	public static void main(String[] args) {
		
		new Windows$1();
		//static直接載入觀念，做出Windows類別的物件實體。	
	
	}

}
