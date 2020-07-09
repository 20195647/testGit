package neusoftpractice;

class Vehicle {
	private String brand;
	private String color;
	private double speed;

	public Vehicle() {
	}

	public Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void run() {
		System.out.println("[品牌]:" + brand + "\n" + "[颜色]:" + color + "\n" + "[时速]:" + speed + "km/h");
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("benz", "black");
		vehicle.run();
	}
}