
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirlineCode",
    "AirlineName",
    "FlightNumber",
    "FareClass",
    "OperatingCarrier"
})
public class Airline {

    @JsonProperty("AirlineCode")
    private String airlineCode;
    @JsonProperty("AirlineName")
    private String airlineName;
    @JsonProperty("FlightNumber")
    private String flightNumber;
    @JsonProperty("FareClass")
    private String fareClass;
    @JsonProperty("OperatingCarrier")
    private String operatingCarrier;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Airline() {
    }

    /**
     * 
     * @param operatingCarrier
     * @param airlineName
     * @param airlineCode
     * @param flightNumber
     * @param fareClass
     */
    public Airline(String airlineCode, String airlineName, String flightNumber, String fareClass, String operatingCarrier) {
        super();
        this.airlineCode = airlineCode;
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.fareClass = fareClass;
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("AirlineCode")
    public String getAirlineCode() {
        return airlineCode;
    }

    @JsonProperty("AirlineCode")
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @JsonProperty("AirlineName")
    public String getAirlineName() {
        return airlineName;
    }

    @JsonProperty("AirlineName")
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    @JsonProperty("FlightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("FlightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("FareClass")
    public String getFareClass() {
        return fareClass;
    }

    @JsonProperty("FareClass")
    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    @JsonProperty("OperatingCarrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("OperatingCarrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
