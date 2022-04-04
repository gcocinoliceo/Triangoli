package p1;

public class Triangolo {
	int l1, l2, l3;
	
	public Triangolo (int l1, int l2, int l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	public int getPerimeter() {
		return l1+l2+l3;
	}
}
