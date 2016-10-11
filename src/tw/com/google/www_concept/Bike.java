package tw.com.google.www_concept;

public class Bike {

	// Field
		private double speed;
		static int count;
		/*static觀念：
		1.當任何的屬性或方法，前面加上static，
		     該屬性或方法，並非僅限該物件所擁有，而是屬於全類別所
		     共同擁有。		   
		     ；0827_2_7min
		2.由於static可以直接呼叫方式，所以必須應用在非物件環境下。
		     ；0827_2_15min30sec*/		
		
		// Constructor
		public Bike(){
			count++;
			speed = 1;
			System.out.println("Bike():" + speed);
		}
		
		void Bike(){
			
		}
		
		// Method
		protected void upSpeed(){
			speed = speed<1?1:speed*1.2;
		}
		void downSpeed(){
			speed = speed<1?0:speed*0.7;
		}
		double getSpeed(){
			return speed;
		}
		
		@Override
		public String toString() {
			return "Brad's Bike";
		}
		
	}
