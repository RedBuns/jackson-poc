
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "privateFareType",
    "departureAirportCode",
    "arrivalAirportCode",
    "fareComponentBeginAirport",
    "availabilityBreak",
    "fareComponentEndAirport",
    "fareComponentDirectionality",
    "fareBasisCode"
})
public class FareBasisCode {

    @JsonProperty("privateFareType")
    private String privateFareType;
    @JsonProperty("departureAirportCode")
    private String departureAirportCode;
    @JsonProperty("arrivalAirportCode")
    private String arrivalAirportCode;
    @JsonProperty("fareComponentBeginAirport")
    private String fareComponentBeginAirport;
    @JsonProperty("availabilityBreak")
    private String availabilityBreak;
    @JsonProperty("fareComponentEndAirport")
    private String fareComponentEndAirport;
    @JsonProperty("fareComponentDirectionality")
    private String fareComponentDirectionality;
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;

    @JsonProperty("privateFareType")
    public String getPrivateFareType() {
        return privateFareType;
    }

    @JsonProperty("privateFareType")
    public void setPrivateFareType(String privateFareType) {
        this.privateFareType = privateFareType;
    }

    @JsonProperty("departureAirportCode")
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    @JsonProperty("departureAirportCode")
    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    @JsonProperty("arrivalAirportCode")
    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    @JsonProperty("arrivalAirportCode")
    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    @JsonProperty("fareComponentBeginAirport")
    public String getFareComponentBeginAirport() {
        return fareComponentBeginAirport;
    }

    @JsonProperty("fareComponentBeginAirport")
    public void setFareComponentBeginAirport(String fareComponentBeginAirport) {
        this.fareComponentBeginAirport = fareComponentBeginAirport;
    }

    @JsonProperty("availabilityBreak")
    public String getAvailabilityBreak() {
        return availabilityBreak;
    }

    @JsonProperty("availabilityBreak")
    public void setAvailabilityBreak(String availabilityBreak) {
        this.availabilityBreak = availabilityBreak;
    }

    @JsonProperty("fareComponentEndAirport")
    public String getFareComponentEndAirport() {
        return fareComponentEndAirport;
    }

    @JsonProperty("fareComponentEndAirport")
    public void setFareComponentEndAirport(String fareComponentEndAirport) {
        this.fareComponentEndAirport = fareComponentEndAirport;
    }

    @JsonProperty("fareComponentDirectionality")
    public String getFareComponentDirectionality() {
        return fareComponentDirectionality;
    }

    @JsonProperty("fareComponentDirectionality")
    public void setFareComponentDirectionality(String fareComponentDirectionality) {
        this.fareComponentDirectionality = fareComponentDirectionality;
    }

    @JsonProperty("fareBasisCode")
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("fareBasisCode")
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
