
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequenceNumber",
    "airItinerary",
    "airItineraryPricingInfo",
    "ticketingInfo",
    "tPA_Extensions"
})
public class PricedItinerary {

    @JsonProperty("sequenceNumber")
    private String sequenceNumber;
    @JsonProperty("airItinerary")
    private AirItinerary airItinerary;
    @JsonProperty("airItineraryPricingInfo")
    private AirItineraryPricingInfo airItineraryPricingInfo;
    @JsonProperty("ticketingInfo")
    private TicketingInfo ticketingInfo;
    @JsonProperty("tPA_Extensions")
    private TPAExtensions tPAExtensions;

    @JsonProperty("sequenceNumber")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("airItinerary")
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    @JsonProperty("airItinerary")
    public void setAirItinerary(AirItinerary airItinerary) {
        this.airItinerary = airItinerary;
    }

    @JsonProperty("airItineraryPricingInfo")
    public AirItineraryPricingInfo getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    @JsonProperty("airItineraryPricingInfo")
    public void setAirItineraryPricingInfo(AirItineraryPricingInfo airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }

    @JsonProperty("ticketingInfo")
    public TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    @JsonProperty("ticketingInfo")
    public void setTicketingInfo(TicketingInfo ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }

    @JsonProperty("tPA_Extensions")
    public TPAExtensions getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("tPA_Extensions")
    public void setTPAExtensions(TPAExtensions tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
