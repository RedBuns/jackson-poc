
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "privateFareType",
    "passengerTypeQuantityCode",
    "passengerTypeQuantity",
    "nonRefundableIndicator",
    "fareBasisCodes",
    "passengerFare",
    "fareInfos"
})
public class PtcFareBreakdown {

    @JsonProperty("privateFareType")
    private String privateFareType;
    @JsonProperty("passengerTypeQuantityCode")
    private String passengerTypeQuantityCode;
    @JsonProperty("passengerTypeQuantity")
    private String passengerTypeQuantity;
    @JsonProperty("nonRefundableIndicator")
    private String nonRefundableIndicator;
    @JsonProperty("fareBasisCodes")
    private FareBasisCodes fareBasisCodes;
    @JsonProperty("passengerFare")
    private PassengerFare passengerFare;
    @JsonProperty("fareInfos")
    private FareInfos fareInfos;

    @JsonProperty("privateFareType")
    public String getPrivateFareType() {
        return privateFareType;
    }

    @JsonProperty("privateFareType")
    public void setPrivateFareType(String privateFareType) {
        this.privateFareType = privateFareType;
    }

    @JsonProperty("passengerTypeQuantityCode")
    public String getPassengerTypeQuantityCode() {
        return passengerTypeQuantityCode;
    }

    @JsonProperty("passengerTypeQuantityCode")
    public void setPassengerTypeQuantityCode(String passengerTypeQuantityCode) {
        this.passengerTypeQuantityCode = passengerTypeQuantityCode;
    }

    @JsonProperty("passengerTypeQuantity")
    public String getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("passengerTypeQuantity")
    public void setPassengerTypeQuantity(String passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    @JsonProperty("nonRefundableIndicator")
    public String getNonRefundableIndicator() {
        return nonRefundableIndicator;
    }

    @JsonProperty("nonRefundableIndicator")
    public void setNonRefundableIndicator(String nonRefundableIndicator) {
        this.nonRefundableIndicator = nonRefundableIndicator;
    }

    @JsonProperty("fareBasisCodes")
    public FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    @JsonProperty("fareBasisCodes")
    public void setFareBasisCodes(FareBasisCodes fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }

    @JsonProperty("passengerFare")
    public PassengerFare getPassengerFare() {
        return passengerFare;
    }

    @JsonProperty("passengerFare")
    public void setPassengerFare(PassengerFare passengerFare) {
        this.passengerFare = passengerFare;
    }

    @JsonProperty("fareInfos")
    public FareInfos getFareInfos() {
        return fareInfos;
    }

    @JsonProperty("fareInfos")
    public void setFareInfos(FareInfos fareInfos) {
        this.fareInfos = fareInfos;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
