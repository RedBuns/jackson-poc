
package com.trvl.integration.domain.internalobjects.search.response;

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
    "pricedItineraries"
})
public class AirLowFareSearchRS {

    @JsonProperty("-xmlns:pfx")
    private String xmlnsPfx;
    @JsonProperty("-xmlns:xsi")
    private String xmlnsXsi;
    @JsonProperty("-xsi:schemaLocation")
    private String xsiSchemaLocation;
    @JsonProperty("requesterDetails")
    private RequesterDetails requesterDetails;
    @JsonProperty("pricedItineraries")
    private PricedItineraries pricedItineraries;

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

    @JsonProperty("pricedItineraries")
    public PricedItineraries getPricedItineraries() {
        return pricedItineraries;
    }

    @JsonProperty("pricedItineraries")
    public void setPricedItineraries(PricedItineraries pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
