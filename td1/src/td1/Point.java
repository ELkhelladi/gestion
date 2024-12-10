package td1;

public class Point {
private double x;
private double y;
public Point(double x, double y) {
	this.setX(x);
	this.setY(y);
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public double distance (Point p) {
	return Math.sqrt(this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY());
	
}
}
