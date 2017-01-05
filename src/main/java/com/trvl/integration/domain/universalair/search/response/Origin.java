
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Airport",
    "DepTime"
})
public class Origin {

    @JsonProperty("Airport")
    private Airport airport;
    @JsonProperty("DepTime")
    private String depTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Origin() {
    }

    /**
     * 
     * @param depTime
     * @param airport
     */
    public Origin(Airport airport, String depTime) {
        super();
        this.airport = airport;
        this.depTime = depTime;
    }

    @JsonProperty("Airport")
    public Airport getAirport() {
        return airport;
    }

    @JsonProperty("Airport")
    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @JsonProperty("DepTime")
    public String getDepTime() {
        return depTime;
    }

    @JsonProperty("DepTime")
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
