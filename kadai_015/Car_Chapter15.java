import java.io.*;
package kadai_015{

public class Car_Chapter15 {

	// フィールド（内部データ）
	private int gear; // ギア
	private int speed; // speed

	public CarChapter15(int gear,int speed) {
			 this.gear = gear;
			 this.speed = speed;
		 }

	public void gearchange(int afterGear) {
		if (afterGear < 1 || afterGear > 5) {
			System.out.println("エラー：ギアは１から５の範囲で指定してください");
			return;
		}
		this.gear = afterGear;
		this.speed = calculatespeed(afterGear);
	}

	private int calculateSpeed(int gear) {
			 return gear * 10;

	public void run() {
		System.out.println(start);
		carchapter15 car = new CarChapter15(1, 10);
		car.gearChange(3);// 引数３
		car.run();
		System.out.println(end);
	}
}}
