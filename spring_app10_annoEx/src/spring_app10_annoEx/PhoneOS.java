package spring_app10_annoEx;

public class PhoneOS {
	
	String name;
	String version;
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void printOS() {
		System.out.println("OS name : " + name);
	}
	
	public void prtVersion() {
		System.out.println("Version : " + version);
	}
	
	

}
