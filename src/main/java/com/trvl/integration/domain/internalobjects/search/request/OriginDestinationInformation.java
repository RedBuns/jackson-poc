
package com.trvl.integration.domain.internalobjects.search.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "departureDateTime",
    "originLocation",
    "destinationLocation"
})
public class OriginDestinationInformation {

    @JsonProperty("departureDateTime")
    private String departureDateTime;
    @JsonProperty("originLocation")
    private String originLocation;
    @JsonProperty("destinationLocation")
    private String destinationLocation;

    @JsonProperty("departureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("originLocation")
    public String getOriginLocation() {
        return originLocation;
    }

    @JsonProperty("originLocation")
    public void setOriginLocation(String originLocation) {
        this.originLocation = originLocation;
    }

    @JsonProperty("destinationLocation")
    public String getDestinationLocation() {
        return destinationLocation;
    }

    @JsonProperty("destinationLocation")
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
