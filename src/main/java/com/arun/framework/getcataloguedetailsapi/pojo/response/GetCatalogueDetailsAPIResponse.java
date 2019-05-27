package com.arun.framework.getcataloguedetailsapi.pojo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.arun.framework.getcataloguedetailsapi.pojo.response.Promotions;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "CategoryId", "Name", "Path", "CanListAuctions", "CanListClassifieds", "CanRelist", "LegalNotice",
		"DefaultDuration", "AllowedDurations", "Fees", "FreePhotoCount", "MaximumPhotoCount", "IsFreeToRelist",
		"Promotions", "EmbeddedContentOptions", "MaximumTitleLength", "AreaOfBusiness", "DefaultRelistDuration" })
public class GetCatalogueDetailsAPIResponse {

	@JsonProperty("CategoryId")
	private String CategoryId;

	@JsonProperty("Path")
	private String Path;

	@JsonProperty("Promotions")
	private Promotions[] Promotions;

	@JsonProperty("EmbeddedContentOptions")
	private String[] EmbeddedContentOptions;

	@JsonProperty("AllowedDurations")
	private String[] AllowedDurations;

	@JsonProperty("IsFreeToRelist")
	private String IsFreeToRelist;

	@JsonProperty("CanListAuctions")
	private String CanListAuctions;

	@JsonProperty("Fees")
	private Fees Fees;

	@JsonProperty("Name")
	private String Name;

	@JsonProperty("CanListClassifieds")
	private String CanListClassifieds;

	@JsonProperty("AreaOfBusiness")
	private String AreaOfBusiness;

	@JsonProperty("DefaultRelistDuration")
	private String DefaultRelistDuration;

	@JsonProperty("MaximumPhotoCount")
	private String MaximumPhotoCount;

	@JsonProperty("CanRelist")
	private String CanRelist;

	@JsonProperty("LegalNotice")
	private String LegalNotice;

	@JsonProperty("DefaultDuration")
	private String DefaultDuration;

	@JsonProperty("MaximumTitleLength")
	private String MaximumTitleLength;

	@JsonProperty("FreePhotoCount")
	private String FreePhotoCount;

	public String getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(String CategoryId) {
		this.CategoryId = CategoryId;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String Path) {
		this.Path = Path;
	}

	public Promotions[] getPromotions() {
		return Promotions;
	}

	public void setPromotions(Promotions[] Promotions) {
		this.Promotions = Promotions;
	}

	public String[] getEmbeddedContentOptions() {
		return EmbeddedContentOptions;
	}

	public void setEmbeddedContentOptions(String[] EmbeddedContentOptions) {
	}

	public String[] getAllowedDurations() {
		return AllowedDurations;
	}

	public void setAllowedDurations(String[] AllowedDurations) {
		this.AllowedDurations = AllowedDurations;
	}

	public String getIsFreeToRelist() {
		return IsFreeToRelist;
	}

	public void setIsFreeToRelist(String IsFreeToRelist) {
		this.IsFreeToRelist = IsFreeToRelist;
	}

	public String getCanListAuctions() {
		return CanListAuctions;
	}

	public void setCanListAuctions(String CanListAuctions) {
		this.CanListAuctions = CanListAuctions;
	}

	public Fees getFees() {
		return Fees;
	}

	public void setFees(Fees Fees) {
		this.Fees = Fees;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getCanListClassifieds() {
		return CanListClassifieds;
	}

	public void setCanListClassifieds(String CanListClassifieds) {
		this.CanListClassifieds = CanListClassifieds;
	}

	public String getAreaOfBusiness() {
		return AreaOfBusiness;
	}

	public void setAreaOfBusiness(String AreaOfBusiness) {
		this.AreaOfBusiness = AreaOfBusiness;
	}

	public String getDefaultRelistDuration() {
		return DefaultRelistDuration;
	}

	public void setDefaultRelistDuration(String DefaultRelistDuration) {
		this.DefaultRelistDuration = DefaultRelistDuration;
	}

	public String getMaximumPhotoCount() {
		return MaximumPhotoCount;
	}

	public void setMaximumPhotoCount(String MaximumPhotoCount) {
		this.MaximumPhotoCount = MaximumPhotoCount;
	}

	public String getCanRelist() {
		return CanRelist;
	}

	public void setCanRelist(String CanRelist) {
		this.CanRelist = CanRelist;
	}

	public String getLegalNotice() {
		return LegalNotice;
	}

	public void setLegalNotice(String LegalNotice) {
		this.LegalNotice = LegalNotice;
	}

	public String getDefaultDuration() {
		return DefaultDuration;
	}

	public void setDefaultDuration(String DefaultDuration) {
		this.DefaultDuration = DefaultDuration;
	}

	public String getMaximumTitleLength() {
		return MaximumTitleLength;
	}

	public void setMaximumTitleLength(String MaximumTitleLength) {
		this.MaximumTitleLength = MaximumTitleLength;
	}

	public String getFreePhotoCount() {
		return FreePhotoCount;
	}

	public void setFreePhotoCount(String FreePhotoCount) {
		this.FreePhotoCount = FreePhotoCount;
	}

	@Override
	public String toString() {
		return "ClassPojo [CategoryId = " + CategoryId + ", Path = " + Path + ", Promotions = " + Promotions
				+ ", EmbeddedContentOptions = " + EmbeddedContentOptions + ", AllowedDurations = " + AllowedDurations
				+ ", IsFreeToRelist = " + IsFreeToRelist + ", CanListAuctions = " + CanListAuctions + ", Fees = " + Fees
				+ ", Name = " + Name + ", CanListClassifieds = " + CanListClassifieds + ", AreaOfBusiness = "
				+ AreaOfBusiness + ", DefaultRelistDuration = " + DefaultRelistDuration + ", MaximumPhotoCount = "
				+ MaximumPhotoCount + ", CanRelist = " + CanRelist + ", LegalNotice = " + LegalNotice
				+ ", DefaultDuration = " + DefaultDuration + ", MaximumTitleLength = " + MaximumTitleLength
				+ ", FreePhotoCount = " + FreePhotoCount + "]";
	}

}
