
package com.trvl.integration.domain.internalobjects.search.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seatsRequested",
    "passengerTypeQuantityCode",
    "directFlightsPriority",
    "passengerTypeQuantity"
})
public class TravelerInfoSummary {

    @JsonProperty("seatsRequested")
    private String seatsRequested;
    @JsonProperty("passengerTypeQuantityCode")
    private String passengerTypeQuantityCode;
    @JsonProperty("directFlightsPriority")
    private String directFlightsPriority;
    @JsonProperty("passengerTypeQuantity")
    private String passengerTypeQuantity;

    @JsonProperty("seatsRequested")
    public String getSeatsRequested() {
        return seatsRequested;
    }

    @JsonProperty("seatsRequested")
    public void setSeatsRequested(String seatsRequested) {
        this.seatsRequested = seatsRequested;
    }

    @JsonProperty("passengerTypeQuantityCode")
    public String getPassengerTypeQuantityCode() {
        return passengerTypeQuantityCode;
    }

    @JsonProperty("passengerTypeQuantityCode")
    public void setPassengerTypeQuantityCode(String passengerTypeQuantityCode) {
        this.passengerTypeQuantityCode = passengerTypeQuantityCode;
    }

    @JsonProperty("directFlightsPriority")
    public String getDirectFlightsPriority() {
        return directFlightsPriority;
    }

    @JsonProperty("directFlightsPriority")
    public void setDirectFlightsPriority(String directFlightsPriority) {
        this.directFlightsPriority = directFlightsPriority;
    }

    @JsonProperty("passengerTypeQuantity")
    public String getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("passengerTypeQuantity")
    public void setPassengerTypeQuantity(String passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
