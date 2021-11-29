package in.rahulit.beans;

public class Country {
	
	@Override
	public String toString() {
		return "Country==> [countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}
	private Integer countryCode;
	private String countryName;
	public Country(Integer countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	

}
