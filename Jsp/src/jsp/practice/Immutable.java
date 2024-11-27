package jsp.practice;

public class Immutable {
	private int radius;
	public Immutable(int r) {
		radius=r;
	}
	public int getradius() {
		return radius;
		
	}
	public Immutable setradius(int r) {
		return new Immutable(r);
	}

}
