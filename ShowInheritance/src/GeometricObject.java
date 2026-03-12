
public class GeometricObject {
	
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		color="white";
		filled=false;
		dateCreated=new java.util.Date();
	}
	
	public GeometricObject(String color,boolean filled) {
		this.color=color;
		this.filled=filled;
		dateCreated=new java.util.Date();
	}
	
}
