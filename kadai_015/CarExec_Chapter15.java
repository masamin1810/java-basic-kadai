import java.io.*;
package class kadai_015 {

	public class CarExec_Chapter15{
		
		 // フィールド（内部データ）
		 private int gear ;  //ギア
		 private int speed;  //speed
		
		 public carchapter15(int gear,int speed) {
			 this.gear = gear;
			 this.speed = speed;
		 }
		 
		 public void gearchange(int afterGear){
			this.gear = aftergear;
			this.speed = calculatespeed(afterGear);
		 }
	
		 private int calculateSpeed(intgear) {
			 return gear * 10;
		 public void run() {
			 System.out.println(start);
			 carchapter15 car = new CarChapter15(1,10);
			 car.gearChange(3);　//引数３
			 car.run();
			 System.out.println(end);
		 }
	}
}
	

