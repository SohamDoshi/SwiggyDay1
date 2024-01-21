
public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int len, int wid) {
		this.length = len;
		this.width = wid;
	}
	
	public int getLength () {
		return this.length;
	}
	
	public int getWidth () {
		return this.width;
	}
	
	public int getArea() {
		return this.length * this.width;
	}
	
	public int getCircumfurence() {
		return 2*(this.length + this.width);
	}
}
