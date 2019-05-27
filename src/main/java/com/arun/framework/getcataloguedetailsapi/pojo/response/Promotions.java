package com.arun.framework.getcataloguedetailsapi.pojo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Name",
    "Description",
    "Price",
    "OriginalPrice",
    "MinimumPhotoCount"
})
public class Promotions {


    @JsonProperty("Id")
    private String Id;

    @JsonProperty("Name")
    private String Name;
    
    @JsonProperty("Description")
    private String Description;
    
    @JsonProperty("Price")
    private String Price;
    
    @JsonProperty("OriginalPrice")
    private String OriginalPrice;
    
    @JsonProperty("Recommended")
    private String Recommended;
    
    @JsonProperty("MinimumPhotoCount")
    private String MinimumPhotoCount;

    public String getMinimumPhotoCount ()
    {
        return MinimumPhotoCount;
    }

    public void setMinimumPhotoCount (String MinimumPhotoCount)
    {
        this.MinimumPhotoCount = MinimumPhotoCount;
    }

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public String getPrice ()
    {
        return Price;
    }

    public void setPrice (String Price)
    {
        this.Price = Price;
    }
    
    public String getRecommended ()
    {
        return Recommended;
    }

    public void setRecommended (String Recommended)
    {
        this.Recommended = Recommended;
    }
    
    public String getOriginalPrice ()
    {
        return OriginalPrice;
    }

    public void setOriginalPrice (String OriginalPrice)
    {
        this.OriginalPrice = OriginalPrice;
    }

    public String getId ()
    {
        return Id;
    }

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MinimumPhotoCount = "+MinimumPhotoCount+", Description = "+Description+", Price = "+Price+", Id = "+Id+", Name = "+Name+"]";
    }
}
