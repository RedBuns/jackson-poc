
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseFareAmount",
    "baseFareCurrencyCode",
    "fareConstructionAmount",
    "fareConstructionCurrencyCode",
    "currencyCodeDecimalPlaces",
    "equivFareAmount",
    "equivFareCurrencyCode",
    "equivFareDecimalPlaces",
    "taxes",
    "TotalFareAmount",
    "TotalFareCurrencyAmount",
    "surcharges",
    "messages",
    "baggageInformationList"
})
public class PassengerFare {

    @JsonProperty("baseFareAmount")
    private String baseFareAmount;
    @JsonProperty("baseFareCurrencyCode")
    private String baseFareCurrencyCode;
    @JsonProperty("fareConstructionAmount")
    private String fareConstructionAmount;
    @JsonProperty("fareConstructionCurrencyCode")
    private String fareConstructionCurrencyCode;
    @JsonProperty("currencyCodeDecimalPlaces")
    private String currencyCodeDecimalPlaces;
    @JsonProperty("equivFareAmount")
    private String equivFareAmount;
    @JsonProperty("equivFareCurrencyCode")
    private String equivFareCurrencyCode;
    @JsonProperty("equivFareDecimalPlaces")
    private String equivFareDecimalPlaces;
    @JsonProperty("taxes")
    private Taxes taxes;
    @JsonProperty("TotalFareAmount")
    private String totalFareAmount;
    @JsonProperty("TotalFareCurrencyAmount")
    private String totalFareCurrencyAmount;
    @JsonProperty("surcharges")
    private Surcharges surcharges;
    @JsonProperty("messages")
    private Messages messages;
    @JsonProperty("baggageInformationList")
    private BaggageInformationList baggageInformationList;

    @JsonProperty("baseFareAmount")
    public String getBaseFareAmount() {
        return baseFareAmount;
    }

    @JsonProperty("baseFareAmount")
    public void setBaseFareAmount(String baseFareAmount) {
        this.baseFareAmount = baseFareAmount;
    }

    @JsonProperty("baseFareCurrencyCode")
    public String getBaseFareCurrencyCode() {
        return baseFareCurrencyCode;
    }

    @JsonProperty("baseFareCurrencyCode")
    public void setBaseFareCurrencyCode(String baseFareCurrencyCode) {
        this.baseFareCurrencyCode = baseFareCurrencyCode;
    }

    @JsonProperty("fareConstructionAmount")
    public String getFareConstructionAmount() {
        return fareConstructionAmount;
    }

    @JsonProperty("fareConstructionAmount")
    public void setFareConstructionAmount(String fareConstructionAmount) {
        this.fareConstructionAmount = fareConstructionAmount;
    }

    @JsonProperty("fareConstructionCurrencyCode")
    public String getFareConstructionCurrencyCode() {
        return fareConstructionCurrencyCode;
    }

    @JsonProperty("fareConstructionCurrencyCode")
    public void setFareConstructionCurrencyCode(String fareConstructionCurrencyCode) {
        this.fareConstructionCurrencyCode = fareConstructionCurrencyCode;
    }

    @JsonProperty("currencyCodeDecimalPlaces")
    public String getCurrencyCodeDecimalPlaces() {
        return currencyCodeDecimalPlaces;
    }

    @JsonProperty("currencyCodeDecimalPlaces")
    public void setCurrencyCodeDecimalPlaces(String currencyCodeDecimalPlaces) {
        this.currencyCodeDecimalPlaces = currencyCodeDecimalPlaces;
    }

    @JsonProperty("equivFareAmount")
    public String getEquivFareAmount() {
        return equivFareAmount;
    }

    @JsonProperty("equivFareAmount")
    public void setEquivFareAmount(String equivFareAmount) {
        this.equivFareAmount = equivFareAmount;
    }

    @JsonProperty("equivFareCurrencyCode")
    public String getEquivFareCurrencyCode() {
        return equivFareCurrencyCode;
    }

    @JsonProperty("equivFareCurrencyCode")
    public void setEquivFareCurrencyCode(String equivFareCurrencyCode) {
        this.equivFareCurrencyCode = equivFareCurrencyCode;
    }

    @JsonProperty("equivFareDecimalPlaces")
    public String getEquivFareDecimalPlaces() {
        return equivFareDecimalPlaces;
    }

    @JsonProperty("equivFareDecimalPlaces")
    public void setEquivFareDecimalPlaces(String equivFareDecimalPlaces) {
        this.equivFareDecimalPlaces = equivFareDecimalPlaces;
    }

    @JsonProperty("taxes")
    public Taxes getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("TotalFareAmount")
    public String getTotalFareAmount() {
        return totalFareAmount;
    }

    @JsonProperty("TotalFareAmount")
    public void setTotalFareAmount(String totalFareAmount) {
        this.totalFareAmount = totalFareAmount;
    }

    @JsonProperty("TotalFareCurrencyAmount")
    public String getTotalFareCurrencyAmount() {
        return totalFareCurrencyAmount;
    }

    @JsonProperty("TotalFareCurrencyAmount")
    public void setTotalFareCurrencyAmount(String totalFareCurrencyAmount) {
        this.totalFareCurrencyAmount = totalFareCurrencyAmount;
    }

    @JsonProperty("surcharges")
    public Surcharges getSurcharges() {
        return surcharges;
    }

    @JsonProperty("surcharges")
    public void setSurcharges(Surcharges surcharges) {
        this.surcharges = surcharges;
    }

    @JsonProperty("messages")
    public Messages getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    @JsonProperty("baggageInformationList")
    public BaggageInformationList getBaggageInformationList() {
        return baggageInformationList;
    }

    @JsonProperty("baggageInformationList")
    public void setBaggageInformationList(BaggageInformationList baggageInformationList) {
        this.baggageInformationList = baggageInformationList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
