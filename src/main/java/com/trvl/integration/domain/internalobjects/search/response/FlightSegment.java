
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "departureDateTime",
    "arrivalDateTime",
    "stopQuantity",
    "flightNumber",
    "resBookDesigCode",
    "elapsedTime",
    "departureAirportLocationCode",
    "arrivalAirportLocationCode",
    "departureAirportTerminalID",
    "arrivalAirportTerminalID",
    "airEquipType",
    "marketingAirlineCode",
    "departureTimeZone",
    "arrivalTimeZone",
    "eTicketInd"
})
public class FlightSegment {

    @JsonProperty("departureDateTime")
    private String departureDateTime;
    @JsonProperty("arrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("stopQuantity")
    private String stopQuantity;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("resBookDesigCode")
    private String resBookDesigCode;
    @JsonProperty("elapsedTime")
    private String elapsedTime;
    @JsonProperty("departureAirportLocationCode")
    private String departureAirportLocationCode;
    @JsonProperty("arrivalAirportLocationCode")
    private String arrivalAirportLocationCode;
    @JsonProperty("departureAirportTerminalID")
    private String departureAirportTerminalID;
    @JsonProperty("arrivalAirportTerminalID")
    private String arrivalAirportTerminalID;
    @JsonProperty("airEquipType")
    private String airEquipType;
    @JsonProperty("marketingAirlineCode")
    private String marketingAirlineCode;
    @JsonProperty("departureTimeZone")
    private String departureTimeZone;
    @JsonProperty("arrivalTimeZone")
    private String arrivalTimeZone;
    @JsonProperty("eTicketInd")
    private String eTicketInd;

    @JsonProperty("departureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("arrivalDateTime")
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    @JsonProperty("arrivalDateTime")
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    @JsonProperty("stopQuantity")
    public String getStopQuantity() {
        return stopQuantity;
    }

    @JsonProperty("stopQuantity")
    public void setStopQuantity(String stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("resBookDesigCode")
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    @JsonProperty("resBookDesigCode")
    public void setResBookDesigCode(String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }

    @JsonProperty("elapsedTime")
    public String getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("elapsedTime")
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("departureAirportLocationCode")
    public String getDepartureAirportLocationCode() {
        return departureAirportLocationCode;
    }

    @JsonProperty("departureAirportLocationCode")
    public void setDepartureAirportLocationCode(String departureAirportLocationCode) {
        this.departureAirportLocationCode = departureAirportLocationCode;
    }

    @JsonProperty("arrivalAirportLocationCode")
    public String getArrivalAirportLocationCode() {
        return arrivalAirportLocationCode;
    }

    @JsonProperty("arrivalAirportLocationCode")
    public void setArrivalAirportLocationCode(String arrivalAirportLocationCode) {
        this.arrivalAirportLocationCode = arrivalAirportLocationCode;
    }

    @JsonProperty("departureAirportTerminalID")
    public String getDepartureAirportTerminalID() {
        return departureAirportTerminalID;
    }

    @JsonProperty("departureAirportTerminalID")
    public void setDepartureAirportTerminalID(String departureAirportTerminalID) {
        this.departureAirportTerminalID = departureAirportTerminalID;
    }

    @JsonProperty("arrivalAirportTerminalID")
    public String getArrivalAirportTerminalID() {
        return arrivalAirportTerminalID;
    }

    @JsonProperty("arrivalAirportTerminalID")
    public void setArrivalAirportTerminalID(String arrivalAirportTerminalID) {
        this.arrivalAirportTerminalID = arrivalAirportTerminalID;
    }

    @JsonProperty("airEquipType")
    public String getAirEquipType() {
        return airEquipType;
    }

    @JsonProperty("airEquipType")
    public void setAirEquipType(String airEquipType) {
        this.airEquipType = airEquipType;
    }

    @JsonProperty("marketingAirlineCode")
    public String getMarketingAirlineCode() {
        return marketingAirlineCode;
    }

    @JsonProperty("marketingAirlineCode")
    public void setMarketingAirlineCode(String marketingAirlineCode) {
        this.marketingAirlineCode = marketingAirlineCode;
    }

    @JsonProperty("departureTimeZone")
    public String getDepartureTimeZone() {
        return departureTimeZone;
    }

    @JsonProperty("departureTimeZone")
    public void setDepartureTimeZone(String departureTimeZone) {
        this.departureTimeZone = departureTimeZone;
    }

    @JsonProperty("arrivalTimeZone")
    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    @JsonProperty("arrivalTimeZone")
    public void setArrivalTimeZone(String arrivalTimeZone) {
        this.arrivalTimeZone = arrivalTimeZone;
    }

    @JsonProperty("eTicketInd")
    public String getETicketInd() {
        return eTicketInd;
    }

    @JsonProperty("eTicketInd")
    public void setETicketInd(String eTicketInd) {
        this.eTicketInd = eTicketInd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
