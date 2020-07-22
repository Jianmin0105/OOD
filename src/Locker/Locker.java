package Locker;

public class Locker {
	private int id;
	private Status status;
	private String key;
	private Size size;
	private int packageId;
	
	Locker(String key, int id) {
		this.id = id;
		this.status = Status.EMPTY;		
		this.key = key;
		this.packageId = -1;
	}
	public boolean dropOff(Package pack, String key) {
		if (key.equals(this.key) && pack.getSize().getIndex() <= this.size.getIndex()) {
			this.packageId = pack.getId();
			status = Status.FULL;
			return true;
		}
		return false;
	}
	public boolean pickUp(String key) {
		if (key.equals(this.key)) {
			this.status = Status.EMPTY;
			packageId = -1;
			return true;
		}
		return false;
	}
	public int getPackageId() {
		return packageId;
	}
	public Status getStatus() {
		return status;
	}
	public int getId() {
		return id;
	}
}
