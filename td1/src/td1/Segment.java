package td1;

public class Segment {
	private double extr1;
	private double extr2;
	public Segment(double extr1,double extr2) {
		this.extr1=extr1;
		this.extr2=extr2;
	}
public void ordonne() {
	if(extr1>extr2) {
		double temp=extr1;
		extr1=extr2;
		extr2=temp;
	}
}
public double getLongeur() {
	return extr2-extr1;
}
public boolean appartient(int x) {
	if( x>extr1 && x<extr2) {
		return true;
	}return false;
}
public String toString() {
	return "SEGMENT["+extr1+","+extr2+"]";
}
}


