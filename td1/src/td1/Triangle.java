package td1;

public class Triangle {
private double l1,l2,l3;
public Triangle(Point l1, Point l2 ,Point l3) {
	this.l1=l1.distance(l2);
	this.l2=l2.distance(l3);
	this.l3=l3.distance(l1);
	
}
public double  perimetre() {
	return l1+l2+l3; 
}
public boolean isocel() {
	return l1==l2 || l2==l3 || l1==l3;
}
}
