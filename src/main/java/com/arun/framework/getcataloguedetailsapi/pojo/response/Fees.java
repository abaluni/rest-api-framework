package com.arun.framework.getcataloguedetailsapi.pojo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Bundle", "EndDate", "Feature", "Gallery", "Listing", "Reserve", "Subtitle", "TenDays",
		"ListingFeeTiers", "SecondCategory" })
public class Fees {

	@JsonProperty("Bundle")
	private String Bundle;

	@JsonProperty("EndDate")
	private String EndDate;

	@JsonProperty("Feature")
	private String Feature;

	@JsonProperty("Gallery")
	private String Gallery;

	@JsonProperty("Listing")
	private String Listing;

	@JsonProperty("Reserve")
	private String Reserve;

	@JsonProperty("Subtitle")
	private String Subtitle;

	@JsonProperty("TenDays")
	private String TenDays;

	@JsonProperty("ListingFeeTiers")
	private ListingFeeTiers[] ListingFeeTiers;

	@JsonProperty("SecondCategory")
	private String SecondCategory;

	public String getReserve() {
		return Reserve;
	}

	public void setReserve(String Reserve) {
		this.Reserve = Reserve;
	}

	public String getSubtitle() {
		return Subtitle;
	}

	public void setSubtitle(String Subtitle) {
		this.Subtitle = Subtitle;
	}

	public ListingFeeTiers[] getListingFeeTiers() {
		return ListingFeeTiers;
	}

	public void setListingFeeTiers(ListingFeeTiers[] ListingFeeTiers) {
		this.ListingFeeTiers = ListingFeeTiers;
	}

	public String getListing() {
		return Listing;
	}

	public void setListing(String Listing) {
		this.Listing = Listing;
	}

	public String getBundle() {
		return Bundle;
	}

	public void setBundle(String Bundle) {
		this.Bundle = Bundle;
	}

	public String getGallery() {
		return Gallery;
	}

	public void setGallery(String Gallery) {
		this.Gallery = Gallery;
	}

	public String getTenDays() {
		return TenDays;
	}

	public void setTenDays(String TenDays) {
		this.TenDays = TenDays;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String EndDate) {
		this.EndDate = EndDate;
	}

	public String getFeature() {
		return Feature;
	}

	public void setFeature(String Feature) {
		this.Feature = Feature;
	}

	public String getSecondCategory() {
		return SecondCategory;
	}

	public void setSecondCategory(String SecondCategory) {
		this.SecondCategory = SecondCategory;
	}

	@Override
	public String toString() {
		return "ClassPojo [Reserve = " + Reserve + ", Subtitle = " + Subtitle + ", ListingFeeTiers = " + ListingFeeTiers
				+ ", Listing = " + Listing + ", Bundle = " + Bundle + ", Gallery = " + Gallery + ", TenDays = "
				+ TenDays + ", EndDate = " + EndDate + ", Feature = " + Feature + ", SecondCategory = " + SecondCategory
				+ "]";
	}
}
