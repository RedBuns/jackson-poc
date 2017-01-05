
package com.trvl.integration.domain.universalair.search.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EndUserIp",
    "TokenId",
    "AdultCount",
    "ChildCount",
    "InfantCount",
    "DirectFlight",
    "OneStopFlight",
    "JourneyType",
    "PreferredAirlines",
    "Segments",
    "Sources"
})
public class SearchRequest {

    @JsonProperty("EndUserIp")
    private String endUserIp;
    @JsonProperty("TokenId")
    private String tokenId;
    @JsonProperty("AdultCount")
    private String adultCount;
    @JsonProperty("ChildCount")
    private String childCount;
    @JsonProperty("InfantCount")
    private String infantCount;
    @JsonProperty("DirectFlight")
    private String directFlight;
    @JsonProperty("OneStopFlight")
    private String oneStopFlight;
    @JsonProperty("JourneyType")
    private String journeyType;
    @JsonProperty("PreferredAirlines")
    private Object preferredAirlines;
    @JsonProperty("Segments")
    private List<Segment> segments = null;
    @JsonProperty("Sources")
    private List<String> sources = null;

    @JsonProperty("EndUserIp")
    public String getEndUserIp() {
        return endUserIp;
    }

    @JsonProperty("EndUserIp")
    public void setEndUserIp(String endUserIp) {
        this.endUserIp = endUserIp;
    }

    @JsonProperty("TokenId")
    public String getTokenId() {
        return tokenId;
    }

    @JsonProperty("TokenId")
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @JsonProperty("AdultCount")
    public String getAdultCount() {
        return adultCount;
    }

    @JsonProperty("AdultCount")
    public void setAdultCount(String adultCount) {
        this.adultCount = adultCount;
    }

    @JsonProperty("ChildCount")
    public String getChildCount() {
        return childCount;
    }

    @JsonProperty("ChildCount")
    public void setChildCount(String childCount) {
        this.childCount = childCount;
    }

    @JsonProperty("InfantCount")
    public String getInfantCount() {
        return infantCount;
    }

    @JsonProperty("InfantCount")
    public void setInfantCount(String infantCount) {
        this.infantCount = infantCount;
    }

    @JsonProperty("DirectFlight")
    public String getDirectFlight() {
        return directFlight;
    }

    @JsonProperty("DirectFlight")
    public void setDirectFlight(String directFlight) {
        this.directFlight = directFlight;
    }

    @JsonProperty("OneStopFlight")
    public String getOneStopFlight() {
        return oneStopFlight;
    }

    @JsonProperty("OneStopFlight")
    public void setOneStopFlight(String oneStopFlight) {
        this.oneStopFlight = oneStopFlight;
    }

    @JsonProperty("JourneyType")
    public String getJourneyType() {
        return journeyType;
    }

    @JsonProperty("JourneyType")
    public void setJourneyType(String journeyType) {
        this.journeyType = journeyType;
    }

    @JsonProperty("PreferredAirlines")
    public Object getPreferredAirlines() {
        return preferredAirlines;
    }

    @JsonProperty("PreferredAirlines")
    public void setPreferredAirlines(Object preferredAirlines) {
        this.preferredAirlines = preferredAirlines;
    }

    @JsonProperty("Segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("Segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @JsonProperty("Sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("Sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
