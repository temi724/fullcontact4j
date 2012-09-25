package com.fullcontact.api.libs.fullcontact4j.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FullContactEntity {

    @SerializedName("contactInfo")
    private ContactInfo contactInfo;

    @SerializedName("demographics")
    private Demographics demographics;

    @SerializedName("digitalFootprint")
    private DigitalFootPrints digitalFootprint;

    @SerializedName("organizations")
    private List<Organizations> organizations;

	@SerializedName("photos")
	private List<Photos> photos;

	@SerializedName("status")
	private int statusCode;

    private transient SocialProfiles socialProfiles;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Demographics getDemographics() {
        return demographics;
    }

    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public List<Organizations> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organizations> organizations) {
        this.organizations = organizations;
    }

    public DigitalFootPrints getDigitalFootprint() {
        return digitalFootprint;
    }

    public void setDigitalFootprint(DigitalFootPrints digitalFootprint) {
        this.digitalFootprint = digitalFootprint;
    }

	public SocialProfiles getSocialProfiles() {
		return socialProfiles;
	}

	public void setSocialProfiles(SocialProfiles socialProfiles) {
		this.socialProfiles = socialProfiles;
	}

	public List<Photos> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}
}