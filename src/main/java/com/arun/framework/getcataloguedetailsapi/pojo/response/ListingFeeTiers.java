package com.arun.framework.getcataloguedetailsapi.pojo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MinimumTierPrice",
    "FixedFee"
})
public class ListingFeeTiers {
    
    @JsonProperty("MinimumTierPrice")
    private String MinimumTierPrice;
    
    @JsonProperty("FixedFee")
    private String FixedFee;

    public String getFixedFee ()
    {
        return FixedFee;
    }

    public void setFixedFee (String FixedFee)
    {
        this.FixedFee = FixedFee;
    }

    public String getMinimumTierPrice ()
    {
        return MinimumTierPrice;
    }

    public void setMinimumTierPrice (String MinimumTierPrice)
    {
        this.MinimumTierPrice = MinimumTierPrice;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [FixedFee = "+FixedFee+", MinimumTierPrice = "+MinimumTierPrice+"]";
    }
}
