
package com.trvl.integration.domain.internalobjects.search.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirLowFareSearchRQ"
})
public class UISearchRequest {

    @JsonProperty("AirLowFareSearchRQ")
    private AirLowFareSearchRQ airLowFareSearchRQ;

    @JsonProperty("AirLowFareSearchRQ")
    public AirLowFareSearchRQ getAirLowFareSearchRQ() {
        return airLowFareSearchRQ;
    }

    @JsonProperty("AirLowFareSearchRQ")
    public void setAirLowFareSearchRQ(AirLowFareSearchRQ airLowFareSearchRQ) {
        this.airLowFareSearchRQ = airLowFareSearchRQ;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
