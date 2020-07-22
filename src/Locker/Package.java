package Locker;

public class Package {
	private int id;
	private Size size;
	
	Package(int id, Size size) {
		this.id = id;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public Size getSize() {
		return size;
	}
}
