package tw.com.google.www_concept;

class Bike2 {

	// Field
		private double speed;
		static int count;
		
		// Constructor
		protected Bike2(){
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
