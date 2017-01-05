
package com.trvl.integration.domain.universalair.search.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Origin",
    "Destination",
    "FlightCabinClass",
    "PreferredDepartureTime",
    "PreferredArrivalTime"
})
public class Segment {

    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("FlightCabinClass")
    private String flightCabinClass;
    @JsonProperty("PreferredDepartureTime")
    private String preferredDepartureTime;
    @JsonProperty("PreferredArrivalTime")
    private String preferredArrivalTime;

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

    @JsonProperty("FlightCabinClass")
    public String getFlightCabinClass() {
        return flightCabinClass;
    }

    @JsonProperty("FlightCabinClass")
    public void setFlightCabinClass(String flightCabinClass) {
        this.flightCabinClass = flightCabinClass;
    }

    @JsonProperty("PreferredDepartureTime")
    public String getPreferredDepartureTime() {
        return preferredDepartureTime;
    }

    @JsonProperty("PreferredDepartureTime")
    public void setPreferredDepartureTime(String preferredDepartureTime) {
        this.preferredDepartureTime = preferredDepartureTime;
    }

    @JsonProperty("PreferredArrivalTime")
    public String getPreferredArrivalTime() {
        return preferredArrivalTime;
    }

    @JsonProperty("PreferredArrivalTime")
    public void setPreferredArrivalTime(String preferredArrivalTime) {
        this.preferredArrivalTime = preferredArrivalTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
