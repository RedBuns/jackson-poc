
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirLowFareSearchRS"
})
public class UISearchResponse {

    @JsonProperty("AirLowFareSearchRS")
    private AirLowFareSearchRS airLowFareSearchRS;

    @JsonProperty("AirLowFareSearchRS")
    public AirLowFareSearchRS getAirLowFareSearchRS() {
        return airLowFareSearchRS;
    }

    @JsonProperty("AirLowFareSearchRS")
    public void setAirLowFareSearchRS(AirLowFareSearchRS airLowFareSearchRS) {
        this.airLowFareSearchRS = airLowFareSearchRS;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
