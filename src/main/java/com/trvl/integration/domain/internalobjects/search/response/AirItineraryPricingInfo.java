
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pricingSource",
    "pricingSubSource",
    "fareReturned",
    "privateFareType",
    "itinTotalFare",
    "pTC_FareBreakdowns",
    "divideInPartyInd"
})
public class AirItineraryPricingInfo {

    @JsonProperty("pricingSource")
    private String pricingSource;
    @JsonProperty("pricingSubSource")
    private String pricingSubSource;
    @JsonProperty("fareReturned")
    private String fareReturned;
    @JsonProperty("privateFareType")
    private String privateFareType;
    @JsonProperty("itinTotalFare")
    private ItinTotalFare itinTotalFare;
    @JsonProperty("pTC_FareBreakdowns")
    private PTCFareBreakdowns pTCFareBreakdowns;
    @JsonProperty("divideInPartyInd")
    private String divideInPartyInd;

    @JsonProperty("pricingSource")
    public String getPricingSource() {
        return pricingSource;
    }

    @JsonProperty("pricingSource")
    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    @JsonProperty("pricingSubSource")
    public String getPricingSubSource() {
        return pricingSubSource;
    }

    @JsonProperty("pricingSubSource")
    public void setPricingSubSource(String pricingSubSource) {
        this.pricingSubSource = pricingSubSource;
    }

    @JsonProperty("fareReturned")
    public String getFareReturned() {
        return fareReturned;
    }

    @JsonProperty("fareReturned")
    public void setFareReturned(String fareReturned) {
        this.fareReturned = fareReturned;
    }

    @JsonProperty("privateFareType")
    public String getPrivateFareType() {
        return privateFareType;
    }

    @JsonProperty("privateFareType")
    public void setPrivateFareType(String privateFareType) {
        this.privateFareType = privateFareType;
    }

    @JsonProperty("itinTotalFare")
    public ItinTotalFare getItinTotalFare() {
        return itinTotalFare;
    }

    @JsonProperty("itinTotalFare")
    public void setItinTotalFare(ItinTotalFare itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
    }

    @JsonProperty("pTC_FareBreakdowns")
    public PTCFareBreakdowns getPTCFareBreakdowns() {
        return pTCFareBreakdowns;
    }

    @JsonProperty("pTC_FareBreakdowns")
    public void setPTCFareBreakdowns(PTCFareBreakdowns pTCFareBreakdowns) {
        this.pTCFareBreakdowns = pTCFareBreakdowns;
    }

    @JsonProperty("divideInPartyInd")
    public String getDivideInPartyInd() {
        return divideInPartyInd;
    }

    @JsonProperty("divideInPartyInd")
    public void setDivideInPartyInd(String divideInPartyInd) {
        this.divideInPartyInd = divideInPartyInd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
