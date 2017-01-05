
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "elapsedTime",
    "flightSegment"
})
public class OriginDestinationOption {

    @JsonProperty("elapsedTime")
    private String elapsedTime;
    @JsonProperty("flightSegment")
    private FlightSegment flightSegment;

    @JsonProperty("elapsedTime")
    public String getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("elapsedTime")
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("flightSegment")
    public FlightSegment getFlightSegment() {
        return flightSegment;
    }

    @JsonProperty("flightSegment")
    public void setFlightSegment(FlightSegment flightSegment) {
        this.flightSegment = flightSegment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
