package in.rahulit.beans;

public class Person {
	
	private String name;
	private String job;
	private Long phno;
	
	public Person(String name, String job, Long phno) {
		super();
		this.name = name;
		this.job = job;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", phno=" + phno + "]";
	}
	
	

}
