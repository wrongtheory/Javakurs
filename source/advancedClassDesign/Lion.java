package advancedClassDesign;

public class Lion {

	private int idNumber;
	private int age;
	private String name;

	public Lion(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Lion))
			return false;
		Lion otherLion = (Lion) obj;
		return this.idNumber == otherLion.idNumber;
	}
	
	public boolean equals(Lion obj) {
		if(obj == null) return false;
		return this.idNumber == obj.idNumber;
	}
	
	@Override
	public int hashCode() {
		return idNumber;
	}

}
