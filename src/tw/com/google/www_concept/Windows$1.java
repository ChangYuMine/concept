package tw.com.google.www_concept;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//0828
/*複習進度：0828_3_44min
		 0828_3_43min*/
		 
public class Windows$1 extends JFrame implements ActionListener{

	/*Windows is a(是) JFrame
	(也可繼續父類別續推定義：例：is a Window，)，
	is a是繼承關係，是一種"多型"的觀念*/
	
	//Windows物件實體has a(擁有)JButton三個按鈕的物件實體
	//觀念：0828_1_1hr11min
	
	private JButton year,day,time;
	//觀念：0828_1_1hr6min30sec
	
	private JTextArea edit;
	//觀念：0828_2
	
	public Windows$1(){
	//語法上可以繼承父類別建構式，但實作上要初始化視窗物件，故仍需定義建構式
		
		super("萬年曆");
		//super父類別建構式：JFrame(String title)
		
		year = new JButton("Year");
		
		day = new JButton("Day");
		
		time = new JButton("Time");		
		//JButton建構式：JButton(String text)
		//進行JButton初始化時，將按鈕一併初始化。
		
		edit = new JTextArea();
		//觀念：0828_2
				
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
		
		add(edit,BorderLayout.CENTER);
		//觀念：0828_2
				
		setSize(640, 480);
		//觀念：0828_1_27min
		
		setVisible(true);
		//觀念：0828_1_33min30sec
		/*到此行時執行程式雖可以出現實體視窗
		 	，但結束視窗後，程式仍留存於記憶體中*/
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//觀念：0828_1_36min
		
		year.addActionListener(this);
		//觀念：0828_2_5min10sec
		//觀念:set:A交給B ; add：單一累加
		//addActionListener：觸發
		//基本觸發方式：直接在新增方法中呼叫。
		//使用狀況：按鈕動作不複雜，直接呼叫，用this處理。
		
		day.addActionListener(this);
		//觀念：0828_2_19min30sec
		//第 一種觸發方式：用if判斷式。
		//使用狀況：按鈕動作不複雜，直接呼叫，用this處理。
		
		year.addActionListener(new MyListener());
		//觀念：0828_2_45min50sec
		//第二種觸發方式：外部單獨設計一個類別程式。
		//使用狀況：公用呼叫，
		
		year.addActionListener(new tw.com.google.www_concept.MyListener());
		//觀念：0828_2_45min50sec
		//越晚add的率先被聽到，從第二種觸發方式修改。
		//觀念：0828_2_56min
		
		year.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				doyear();
				
			}
		});
		//第四種觸發方式(最常被使用)：直接實作該介面的物件實體。
		//觀念：0828_2_1hr50sec
				
	}
	
	private void doyear(){
		
		System.out.println("方法四");
	}

	
	public static void main(String[] args) {
		
		new Windows$1();
		//static直接載入觀念，做出Windows類別的物件實體。	
	
	}
	
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("方法三");
			
			//對應第三種觸發方式：內部類別(和第四種方式相仿)
			//觀念：0828_2_51min30sec
			//內部類別可直接存取外部類別的屬性與方法
			//觀念：0828_2_57min25sec

		}				
	}
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource()==year){
		//可以改寫成(event.getSource().equals(year))
		//可以改寫成(year.equals(event.getSource()))
		//觀念：0828_2_25min40sec
			System.out.println("OK");
		
		}else if(event.getSource()==day){
			
			System.out.println("OKOK");
		}
	
		//對應第一種觸發方式		
				
	}

}

class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("方法二");
		
		//對應第二種觸發方式
	}
		
}
