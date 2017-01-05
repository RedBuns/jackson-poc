
package com.trvl.integration.domain.internalobjects.search.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "-xmlns:pfx",
    "-xmlns:xsi",
    "-xsi:schemaLocation",
    "requesterDetails",
    "originDestinationInformation",
    "travelPreferences",
    "travelerInfoSummary",
    "tpaextensions"
})
public class AirLowFareSearchRQ {

    @JsonProperty("-xmlns:pfx")
    private String xmlnsPfx;
    @JsonProperty("-xmlns:xsi")
    private String xmlnsXsi;
    @JsonProperty("-xsi:schemaLocation")
    private String xsiSchemaLocation;
    @JsonProperty("requesterDetails")
    private RequesterDetails requesterDetails;
    @JsonProperty("originDestinationInformation")
    private List<OriginDestinationInformation> originDestinationInformation = null;
    @JsonProperty("travelPreferences")
    private TravelPreferences travelPreferences;
    @JsonProperty("travelerInfoSummary")
    private List<TravelerInfoSummary> travelerInfoSummary = null;
    @JsonProperty("tpaextensions")
    private Tpaextensions tpaextensions;

    @JsonProperty("-xmlns:pfx")
    public String getXmlnsPfx() {
        return xmlnsPfx;
    }

    @JsonProperty("-xmlns:pfx")
    public void setXmlnsPfx(String xmlnsPfx) {
        this.xmlnsPfx = xmlnsPfx;
    }

    @JsonProperty("-xmlns:xsi")
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    @JsonProperty("-xmlns:xsi")
    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    @JsonProperty("-xsi:schemaLocation")
    public String getXsiSchemaLocation() {
        return xsiSchemaLocation;
    }

    @JsonProperty("-xsi:schemaLocation")
    public void setXsiSchemaLocation(String xsiSchemaLocation) {
        this.xsiSchemaLocation = xsiSchemaLocation;
    }

    @JsonProperty("requesterDetails")
    public RequesterDetails getRequesterDetails() {
        return requesterDetails;
    }

    @JsonProperty("requesterDetails")
    public void setRequesterDetails(RequesterDetails requesterDetails) {
        this.requesterDetails = requesterDetails;
    }

    @JsonProperty("originDestinationInformation")
    public List<OriginDestinationInformation> getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    @JsonProperty("originDestinationInformation")
    public void setOriginDestinationInformation(List<OriginDestinationInformation> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    @JsonProperty("travelPreferences")
    public TravelPreferences getTravelPreferences() {
        return travelPreferences;
    }

    @JsonProperty("travelPreferences")
    public void setTravelPreferences(TravelPreferences travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    @JsonProperty("travelerInfoSummary")
    public List<TravelerInfoSummary> getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    @JsonProperty("travelerInfoSummary")
    public void setTravelerInfoSummary(List<TravelerInfoSummary> travelerInfoSummary) {
        this.travelerInfoSummary = travelerInfoSummary;
    }

    @JsonProperty("tpaextensions")
    public Tpaextensions getTpaextensions() {
        return tpaextensions;
    }

    @JsonProperty("tpaextensions")
    public void setTpaextensions(Tpaextensions tpaextensions) {
        this.tpaextensions = tpaextensions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
