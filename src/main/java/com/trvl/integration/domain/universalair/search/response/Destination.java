
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Airport",
    "ArrTime"
})
public class Destination {

    @JsonProperty("Airport")
    private Airport_ airport;
    @JsonProperty("ArrTime")
    private String arrTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Destination() {
    }

    /**
     * 
     * @param airport
     * @param arrTime
     */
    public Destination(Airport_ airport, String arrTime) {
        super();
        this.airport = airport;
        this.arrTime = arrTime;
    }

    @JsonProperty("Airport")
    public Airport_ getAirport() {
        return airport;
    }

    @JsonProperty("Airport")
    public void setAirport(Airport_ airport) {
        this.airport = airport;
    }

    @JsonProperty("ArrTime")
    public String getArrTime() {
        return arrTime;
    }

    @JsonProperty("ArrTime")
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
