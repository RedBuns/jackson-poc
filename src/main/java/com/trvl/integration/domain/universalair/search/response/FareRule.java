
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Origin",
    "Destination",
    "Airline",
    "FareBasisCode",
    "FareRuleDetail",
    "FareRestriction"
})
public class FareRule {

    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("Airline")
    private String airline;
    @JsonProperty("FareBasisCode")
    private String fareBasisCode;
    @JsonProperty("FareRuleDetail")
    private String fareRuleDetail;
    @JsonProperty("FareRestriction")
    private String fareRestriction;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FareRule() {
    }

    /**
     * 
     * @param fareRuleDetail
     * @param fareBasisCode
     * @param origin
     * @param fareRestriction
     * @param airline
     * @param destination
     */
    public FareRule(String origin, String destination, String airline, String fareBasisCode, String fareRuleDetail, String fareRestriction) {
        super();
        this.origin = origin;
        this.destination = destination;
        this.airline = airline;
        this.fareBasisCode = fareBasisCode;
        this.fareRuleDetail = fareRuleDetail;
        this.fareRestriction = fareRestriction;
    }

    @JsonProperty("Origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("Destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("Destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("Airline")
    public String getAirline() {
        return airline;
    }

    @JsonProperty("Airline")
    public void setAirline(String airline) {
        this.airline = airline;
    }

    @JsonProperty("FareBasisCode")
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("FareBasisCode")
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @JsonProperty("FareRuleDetail")
    public String getFareRuleDetail() {
        return fareRuleDetail;
    }

    @JsonProperty("FareRuleDetail")
    public void setFareRuleDetail(String fareRuleDetail) {
        this.fareRuleDetail = fareRuleDetail;
    }

    @JsonProperty("FareRestriction")
    public String getFareRestriction() {
        return fareRestriction;
    }

    @JsonProperty("FareRestriction")
    public void setFareRestriction(String fareRestriction) {
        this.fareRestriction = fareRestriction;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
