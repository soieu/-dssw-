package objectProblem.cylinderAvatar;

public class Cylinder {
	static final double PI = 3.14159;
	public int radius;
	public int height;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getVolume() {
		return (double)(this.radius * this.radius * PI * this.height); 
	}
	public double getArea() {
		return (double)(2 * PI * this.radius * this.height + 2 * PI * this.radius * this.radius); 
	}
	
}