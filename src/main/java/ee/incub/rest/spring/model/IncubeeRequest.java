package ee.incub.rest.spring.model;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class IncubeeRequest {
	private String companyname;
	private String companyurl;
	private String logourl;
	private String highconcept;
	private String description;
	private String twitterurl;
	private String videourl;
	private String founder;
	private String location;
	private String contactemail;
	private String username;
	private String token;

	private MultipartFile[] images;
	
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyurl() {
		return companyurl;
	}

	public void setCompanyurl(String companyurl) {
		this.companyurl = companyurl;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

	public String getHighconcept() {
		return highconcept;
	}

	public void setHighconcept(String highconcept) {
		this.highconcept = highconcept;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTwitterurl() {
		return twitterurl;
	}

	public void setTwitterurl(String twitterurl) {
		this.twitterurl = twitterurl;
	}

	public String getVideourl() {
		return videourl;
	}

	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



	public String getPassword() {
		return token;
	}

	public void setPassword(String password) {
		this.token = password;
	}

	public MultipartFile[] getImages() {
		return images;
	}

	public void setImages(MultipartFile[] images) {
		this.images = images;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String toString() {
		return "Incubee [companyname=" + companyname + ", companyurl="
				+ companyurl + ", logourl=" + logourl + ", highconcept="
				+ highconcept + ", description=" + description
				+ ", twitterurl=" + twitterurl + ", videourl=" + videourl
				+ ", founder=" + founder + ", location=" + location
				+ ", username=" + username + ", idToken=" + token
				+ ", images="
				+ Arrays.toString(images) + "]";
	}

	/**
	 * @return the contactemail
	 */
	public String getContactemail() {
		return contactemail;
	}

	/**
	 * @param contactemail the contactemail to set
	 */
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
