
package com.trvl.integration.domain.universalair.search.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResultIndex",
    "Source",
    "IsLCC",
    "IsRefundable",
    "AirlineRemark",
    "Fare",
    "FareBreakdown",
    "Segments",
    "LastTicketDate",
    "TicketAdvisory",
    "FareRules",
    "AirlineCode",
    "ValidatingAirline",
    "BaggageAllowance"
})
public class Result {

    @JsonProperty("ResultIndex")
    private String resultIndex;
    @JsonProperty("Source")
    private Integer source;
    @JsonProperty("IsLCC")
    private Boolean isLCC;
    @JsonProperty("IsRefundable")
    private Boolean isRefundable;
    @JsonProperty("AirlineRemark")
    private Object airlineRemark;
    @JsonProperty("Fare")
    private Fare fare;
    @JsonProperty("FareBreakdown")
    private List<FareBreakdown> fareBreakdown = null;
    @JsonProperty("Segments")
    private List<List<Segment>> segments = null;
    @JsonProperty("LastTicketDate")
    private String lastTicketDate;
    @JsonProperty("TicketAdvisory")
    private String ticketAdvisory;
    @JsonProperty("FareRules")
    private List<FareRule> fareRules = null;
    @JsonProperty("AirlineCode")
    private String airlineCode;
    @JsonProperty("ValidatingAirline")
    private String validatingAirline;
    @JsonProperty("BaggageAllowance")
    private String baggageAllowance;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param ticketAdvisory
     * @param isRefundable
     * @param segments
     * @param resultIndex
     * @param fare
     * @param baggageAllowance
     * @param validatingAirline
     * @param isLCC
     * @param fareBreakdown
     * @param airlineCode
     * @param source
     * @param lastTicketDate
     * @param airlineRemark
     * @param fareRules
     */
    public Result(String resultIndex, Integer source, Boolean isLCC, Boolean isRefundable, Object airlineRemark, Fare fare, List<FareBreakdown> fareBreakdown, List<List<Segment>> segments, String lastTicketDate, String ticketAdvisory, List<FareRule> fareRules, String airlineCode, String validatingAirline, String baggageAllowance) {
        super();
        this.resultIndex = resultIndex;
        this.source = source;
        this.isLCC = isLCC;
        this.isRefundable = isRefundable;
        this.airlineRemark = airlineRemark;
        this.fare = fare;
        this.fareBreakdown = fareBreakdown;
        this.segments = segments;
        this.lastTicketDate = lastTicketDate;
        this.ticketAdvisory = ticketAdvisory;
        this.fareRules = fareRules;
        this.airlineCode = airlineCode;
        this.validatingAirline = validatingAirline;
        this.baggageAllowance = baggageAllowance;
    }

    @JsonProperty("ResultIndex")
    public String getResultIndex() {
        return resultIndex;
    }

    @JsonProperty("ResultIndex")
    public void setResultIndex(String resultIndex) {
        this.resultIndex = resultIndex;
    }

    @JsonProperty("Source")
    public Integer getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(Integer source) {
        this.source = source;
    }

    @JsonProperty("IsLCC")
    public Boolean getIsLCC() {
        return isLCC;
    }

    @JsonProperty("IsLCC")
    public void setIsLCC(Boolean isLCC) {
        this.isLCC = isLCC;
    }

    @JsonProperty("IsRefundable")
    public Boolean getIsRefundable() {
        return isRefundable;
    }

    @JsonProperty("IsRefundable")
    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    @JsonProperty("AirlineRemark")
    public Object getAirlineRemark() {
        return airlineRemark;
    }

    @JsonProperty("AirlineRemark")
    public void setAirlineRemark(Object airlineRemark) {
        this.airlineRemark = airlineRemark;
    }

    @JsonProperty("Fare")
    public Fare getFare() {
        return fare;
    }

    @JsonProperty("Fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    @JsonProperty("FareBreakdown")
    public List<FareBreakdown> getFareBreakdown() {
        return fareBreakdown;
    }

    @JsonProperty("FareBreakdown")
    public void setFareBreakdown(List<FareBreakdown> fareBreakdown) {
        this.fareBreakdown = fareBreakdown;
    }

    @JsonProperty("Segments")
    public List<List<Segment>> getSegments() {
        return segments;
    }

    @JsonProperty("Segments")
    public void setSegments(List<List<Segment>> segments) {
        this.segments = segments;
    }

    @JsonProperty("LastTicketDate")
    public String getLastTicketDate() {
        return lastTicketDate;
    }

    @JsonProperty("LastTicketDate")
    public void setLastTicketDate(String lastTicketDate) {
        this.lastTicketDate = lastTicketDate;
    }

    @JsonProperty("TicketAdvisory")
    public String getTicketAdvisory() {
        return ticketAdvisory;
    }

    @JsonProperty("TicketAdvisory")
    public void setTicketAdvisory(String ticketAdvisory) {
        this.ticketAdvisory = ticketAdvisory;
    }

    @JsonProperty("FareRules")
    public List<FareRule> getFareRules() {
        return fareRules;
    }

    @JsonProperty("FareRules")
    public void setFareRules(List<FareRule> fareRules) {
        this.fareRules = fareRules;
    }

    @JsonProperty("AirlineCode")
    public String getAirlineCode() {
        return airlineCode;
    }

    @JsonProperty("AirlineCode")
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @JsonProperty("ValidatingAirline")
    public String getValidatingAirline() {
        return validatingAirline;
    }

    @JsonProperty("ValidatingAirline")
    public void setValidatingAirline(String validatingAirline) {
        this.validatingAirline = validatingAirline;
    }

    @JsonProperty("BaggageAllowance")
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    @JsonProperty("BaggageAllowance")
    public void setBaggageAllowance(String baggageAllowance) {
        this.baggageAllowance = baggageAllowance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
