
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Currency",
    "PassengerType",
    "PassengerCount",
    "BaseFare",
    "Tax",
    "YQTax",
    "AdditionalTxnFeeOfrd",
    "AdditionalTxnFeePub"
})
public class FareBreakdown {

    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("PassengerType")
    private Integer passengerType;
    @JsonProperty("PassengerCount")
    private Integer passengerCount;
    @JsonProperty("BaseFare")
    private Integer baseFare;
    @JsonProperty("Tax")
    private Integer tax;
    @JsonProperty("YQTax")
    private Integer yQTax;
    @JsonProperty("AdditionalTxnFeeOfrd")
    private Integer additionalTxnFeeOfrd;
    @JsonProperty("AdditionalTxnFeePub")
    private Integer additionalTxnFeePub;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FareBreakdown() {
    }

    /**
     * 
     * @param baseFare
     * @param additionalTxnFeeOfrd
     * @param tax
     * @param passengerType
     * @param passengerCount
     * @param additionalTxnFeePub
     * @param yQTax
     * @param currency
     */
    public FareBreakdown(String currency, Integer passengerType, Integer passengerCount, Integer baseFare, Integer tax, Integer yQTax, Integer additionalTxnFeeOfrd, Integer additionalTxnFeePub) {
        super();
        this.currency = currency;
        this.passengerType = passengerType;
        this.passengerCount = passengerCount;
        this.baseFare = baseFare;
        this.tax = tax;
        this.yQTax = yQTax;
        this.additionalTxnFeeOfrd = additionalTxnFeeOfrd;
        this.additionalTxnFeePub = additionalTxnFeePub;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("PassengerType")
    public Integer getPassengerType() {
        return passengerType;
    }

    @JsonProperty("PassengerType")
    public void setPassengerType(Integer passengerType) {
        this.passengerType = passengerType;
    }

    @JsonProperty("PassengerCount")
    public Integer getPassengerCount() {
        return passengerCount;
    }

    @JsonProperty("PassengerCount")
    public void setPassengerCount(Integer passengerCount) {
        this.passengerCount = passengerCount;
    }

    @JsonProperty("BaseFare")
    public Integer getBaseFare() {
        return baseFare;
    }

    @JsonProperty("BaseFare")
    public void setBaseFare(Integer baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("Tax")
    public Integer getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    @JsonProperty("YQTax")
    public Integer getYQTax() {
        return yQTax;
    }

    @JsonProperty("YQTax")
    public void setYQTax(Integer yQTax) {
        this.yQTax = yQTax;
    }

    @JsonProperty("AdditionalTxnFeeOfrd")
    public Integer getAdditionalTxnFeeOfrd() {
        return additionalTxnFeeOfrd;
    }

    @JsonProperty("AdditionalTxnFeeOfrd")
    public void setAdditionalTxnFeeOfrd(Integer additionalTxnFeeOfrd) {
        this.additionalTxnFeeOfrd = additionalTxnFeeOfrd;
    }

    @JsonProperty("AdditionalTxnFeePub")
    public Integer getAdditionalTxnFeePub() {
        return additionalTxnFeePub;
    }

    @JsonProperty("AdditionalTxnFeePub")
    public void setAdditionalTxnFeePub(Integer additionalTxnFeePub) {
        this.additionalTxnFeePub = additionalTxnFeePub;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
