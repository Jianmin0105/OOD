package Locker;

public enum Size {
	LARGE(0), MEDIUM(1), SMALL(2);
	private int index;
	Size(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
}
