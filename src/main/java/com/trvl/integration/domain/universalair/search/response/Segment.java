
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Baggage",
    "CabinBaggage",
    "TripIndicator",
    "SegmentIndicator",
    "Airline",
    "NoOfSeatAvailable",
    "Origin",
    "Destination",
    "AccumulatedDuration",
    "Duration",
    "GroundTime",
    "Mile",
    "StopOver",
    "StopPoint",
    "StopPointArrivalTime",
    "StopPointDepartureTime",
    "Craft",
    "Remark",
    "IsETicketEligible",
    "FlightStatus",
    "Status"
})
public class Segment {

    @JsonProperty("Baggage")
    private String baggage;
    @JsonProperty("CabinBaggage")
    private Object cabinBaggage;
    @JsonProperty("TripIndicator")
    private Integer tripIndicator;
    @JsonProperty("SegmentIndicator")
    private Integer segmentIndicator;
    @JsonProperty("Airline")
    private Airline airline;
    @JsonProperty("NoOfSeatAvailable")
    private Integer noOfSeatAvailable;
    @JsonProperty("Origin")
    private Origin origin;
    @JsonProperty("Destination")
    private Destination destination;
    @JsonProperty("AccumulatedDuration")
    private Integer accumulatedDuration;
    @JsonProperty("Duration")
    private Integer duration;
    @JsonProperty("GroundTime")
    private Integer groundTime;
    @JsonProperty("Mile")
    private Integer mile;
    @JsonProperty("StopOver")
    private Boolean stopOver;
    @JsonProperty("StopPoint")
    private String stopPoint;
    @JsonProperty("StopPointArrivalTime")
    private String stopPointArrivalTime;
    @JsonProperty("StopPointDepartureTime")
    private String stopPointDepartureTime;
    @JsonProperty("Craft")
    private String craft;
    @JsonProperty("Remark")
    private Object remark;
    @JsonProperty("IsETicketEligible")
    private Boolean isETicketEligible;
    @JsonProperty("FlightStatus")
    private String flightStatus;
    @JsonProperty("Status")
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Segment() {
    }

    /**
     * 
     * @param baggage
     * @param groundTime
     * @param craft
     * @param segmentIndicator
     * @param stopOver
     * @param status
     * @param remark
     * @param stopPointArrivalTime
     * @param origin
     * @param noOfSeatAvailable
     * @param accumulatedDuration
     * @param flightStatus
     * @param stopPoint
     * @param cabinBaggage
     * @param destination
     * @param isETicketEligible
     * @param stopPointDepartureTime
     * @param duration
     * @param tripIndicator
     * @param mile
     * @param airline
     */
    public Segment(String baggage, Object cabinBaggage, Integer tripIndicator, Integer segmentIndicator, Airline airline, Integer noOfSeatAvailable, Origin origin, Destination destination, Integer accumulatedDuration, Integer duration, Integer groundTime, Integer mile, Boolean stopOver, String stopPoint, String stopPointArrivalTime, String stopPointDepartureTime, String craft, Object remark, Boolean isETicketEligible, String flightStatus, String status) {
        super();
        this.baggage = baggage;
        this.cabinBaggage = cabinBaggage;
        this.tripIndicator = tripIndicator;
        this.segmentIndicator = segmentIndicator;
        this.airline = airline;
        this.noOfSeatAvailable = noOfSeatAvailable;
        this.origin = origin;
        this.destination = destination;
        this.accumulatedDuration = accumulatedDuration;
        this.duration = duration;
        this.groundTime = groundTime;
        this.mile = mile;
        this.stopOver = stopOver;
        this.stopPoint = stopPoint;
        this.stopPointArrivalTime = stopPointArrivalTime;
        this.stopPointDepartureTime = stopPointDepartureTime;
        this.craft = craft;
        this.remark = remark;
        this.isETicketEligible = isETicketEligible;
        this.flightStatus = flightStatus;
        this.status = status;
    }

    @JsonProperty("Baggage")
    public String getBaggage() {
        return baggage;
    }

    @JsonProperty("Baggage")
    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    @JsonProperty("CabinBaggage")
    public Object getCabinBaggage() {
        return cabinBaggage;
    }

    @JsonProperty("CabinBaggage")
    public void setCabinBaggage(Object cabinBaggage) {
        this.cabinBaggage = cabinBaggage;
    }

    @JsonProperty("TripIndicator")
    public Integer getTripIndicator() {
        return tripIndicator;
    }

    @JsonProperty("TripIndicator")
    public void setTripIndicator(Integer tripIndicator) {
        this.tripIndicator = tripIndicator;
    }

    @JsonProperty("SegmentIndicator")
    public Integer getSegmentIndicator() {
        return segmentIndicator;
    }

    @JsonProperty("SegmentIndicator")
    public void setSegmentIndicator(Integer segmentIndicator) {
        this.segmentIndicator = segmentIndicator;
    }

    @JsonProperty("Airline")
    public Airline getAirline() {
        return airline;
    }

    @JsonProperty("Airline")
    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    @JsonProperty("NoOfSeatAvailable")
    public Integer getNoOfSeatAvailable() {
        return noOfSeatAvailable;
    }

    @JsonProperty("NoOfSeatAvailable")
    public void setNoOfSeatAvailable(Integer noOfSeatAvailable) {
        this.noOfSeatAvailable = noOfSeatAvailable;
    }

    @JsonProperty("Origin")
    public Origin getOrigin() {
        return origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @JsonProperty("Destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("Destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("AccumulatedDuration")
    public Integer getAccumulatedDuration() {
        return accumulatedDuration;
    }

    @JsonProperty("AccumulatedDuration")
    public void setAccumulatedDuration(Integer accumulatedDuration) {
        this.accumulatedDuration = accumulatedDuration;
    }

    @JsonProperty("Duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("GroundTime")
    public Integer getGroundTime() {
        return groundTime;
    }

    @JsonProperty("GroundTime")
    public void setGroundTime(Integer groundTime) {
        this.groundTime = groundTime;
    }

    @JsonProperty("Mile")
    public Integer getMile() {
        return mile;
    }

    @JsonProperty("Mile")
    public void setMile(Integer mile) {
        this.mile = mile;
    }

    @JsonProperty("StopOver")
    public Boolean getStopOver() {
        return stopOver;
    }

    @JsonProperty("StopOver")
    public void setStopOver(Boolean stopOver) {
        this.stopOver = stopOver;
    }

    @JsonProperty("StopPoint")
    public String getStopPoint() {
        return stopPoint;
    }

    @JsonProperty("StopPoint")
    public void setStopPoint(String stopPoint) {
        this.stopPoint = stopPoint;
    }

    @JsonProperty("StopPointArrivalTime")
    public String getStopPointArrivalTime() {
        return stopPointArrivalTime;
    }

    @JsonProperty("StopPointArrivalTime")
    public void setStopPointArrivalTime(String stopPointArrivalTime) {
        this.stopPointArrivalTime = stopPointArrivalTime;
    }

    @JsonProperty("StopPointDepartureTime")
    public String getStopPointDepartureTime() {
        return stopPointDepartureTime;
    }

    @JsonProperty("StopPointDepartureTime")
    public void setStopPointDepartureTime(String stopPointDepartureTime) {
        this.stopPointDepartureTime = stopPointDepartureTime;
    }

    @JsonProperty("Craft")
    public String getCraft() {
        return craft;
    }

    @JsonProperty("Craft")
    public void setCraft(String craft) {
        this.craft = craft;
    }

    @JsonProperty("Remark")
    public Object getRemark() {
        return remark;
    }

    @JsonProperty("Remark")
    public void setRemark(Object remark) {
        this.remark = remark;
    }

    @JsonProperty("IsETicketEligible")
    public Boolean getIsETicketEligible() {
        return isETicketEligible;
    }

    @JsonProperty("IsETicketEligible")
    public void setIsETicketEligible(Boolean isETicketEligible) {
        this.isETicketEligible = isETicketEligible;
    }

    @JsonProperty("FlightStatus")
    public String getFlightStatus() {
        return flightStatus;
    }

    @JsonProperty("FlightStatus")
    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
