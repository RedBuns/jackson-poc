
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BaseFareAmount",
    "BaseFareCurrencyCode",
    "BaseFareDecimalPlaces",
    "FareConstructionAmount",
    "FareConstructionCurrencyCode",
    "FareConstructionDecimalPlaces",
    "EquivFareAmount",
    "EquivFareCurrencyCode",
    "EquivFareDecimalPlaces",
    "TaxCode",
    "TaxAmount",
    "TaxCurrencyCode",
    "TaxDecimalPlaces",
    "TotalFareAmount",
    "TotalFareCurrencyCode",
    "TotalFareDecimalPlaces"
})
public class ItinTotalFare {

    @JsonProperty("BaseFareAmount")
    private String baseFareAmount;
    @JsonProperty("BaseFareCurrencyCode")
    private String baseFareCurrencyCode;
    @JsonProperty("BaseFareDecimalPlaces")
    private String baseFareDecimalPlaces;
    @JsonProperty("FareConstructionAmount")
    private String fareConstructionAmount;
    @JsonProperty("FareConstructionCurrencyCode")
    private String fareConstructionCurrencyCode;
    @JsonProperty("FareConstructionDecimalPlaces")
    private String fareConstructionDecimalPlaces;
    @JsonProperty("EquivFareAmount")
    private String equivFareAmount;
    @JsonProperty("EquivFareCurrencyCode")
    private String equivFareCurrencyCode;
    @JsonProperty("EquivFareDecimalPlaces")
    private String equivFareDecimalPlaces;
    @JsonProperty("TaxCode")
    private String taxCode;
    @JsonProperty("TaxAmount")
    private String taxAmount;
    @JsonProperty("TaxCurrencyCode")
    private String taxCurrencyCode;
    @JsonProperty("TaxDecimalPlaces")
    private String taxDecimalPlaces;
    @JsonProperty("TotalFareAmount")
    private String totalFareAmount;
    @JsonProperty("TotalFareCurrencyCode")
    private String totalFareCurrencyCode;
    @JsonProperty("TotalFareDecimalPlaces")
    private String totalFareDecimalPlaces;

    @JsonProperty("BaseFareAmount")
    public String getBaseFareAmount() {
        return baseFareAmount;
    }

    @JsonProperty("BaseFareAmount")
    public void setBaseFareAmount(String baseFareAmount) {
        this.baseFareAmount = baseFareAmount;
    }

    @JsonProperty("BaseFareCurrencyCode")
    public String getBaseFareCurrencyCode() {
        return baseFareCurrencyCode;
    }

    @JsonProperty("BaseFareCurrencyCode")
    public void setBaseFareCurrencyCode(String baseFareCurrencyCode) {
        this.baseFareCurrencyCode = baseFareCurrencyCode;
    }

    @JsonProperty("BaseFareDecimalPlaces")
    public String getBaseFareDecimalPlaces() {
        return baseFareDecimalPlaces;
    }

    @JsonProperty("BaseFareDecimalPlaces")
    public void setBaseFareDecimalPlaces(String baseFareDecimalPlaces) {
        this.baseFareDecimalPlaces = baseFareDecimalPlaces;
    }

    @JsonProperty("FareConstructionAmount")
    public String getFareConstructionAmount() {
        return fareConstructionAmount;
    }

    @JsonProperty("FareConstructionAmount")
    public void setFareConstructionAmount(String fareConstructionAmount) {
        this.fareConstructionAmount = fareConstructionAmount;
    }

    @JsonProperty("FareConstructionCurrencyCode")
    public String getFareConstructionCurrencyCode() {
        return fareConstructionCurrencyCode;
    }

    @JsonProperty("FareConstructionCurrencyCode")
    public void setFareConstructionCurrencyCode(String fareConstructionCurrencyCode) {
        this.fareConstructionCurrencyCode = fareConstructionCurrencyCode;
    }

    @JsonProperty("FareConstructionDecimalPlaces")
    public String getFareConstructionDecimalPlaces() {
        return fareConstructionDecimalPlaces;
    }

    @JsonProperty("FareConstructionDecimalPlaces")
    public void setFareConstructionDecimalPlaces(String fareConstructionDecimalPlaces) {
        this.fareConstructionDecimalPlaces = fareConstructionDecimalPlaces;
    }

    @JsonProperty("EquivFareAmount")
    public String getEquivFareAmount() {
        return equivFareAmount;
    }

    @JsonProperty("EquivFareAmount")
    public void setEquivFareAmount(String equivFareAmount) {
        this.equivFareAmount = equivFareAmount;
    }

    @JsonProperty("EquivFareCurrencyCode")
    public String getEquivFareCurrencyCode() {
        return equivFareCurrencyCode;
    }

    @JsonProperty("EquivFareCurrencyCode")
    public void setEquivFareCurrencyCode(String equivFareCurrencyCode) {
        this.equivFareCurrencyCode = equivFareCurrencyCode;
    }

    @JsonProperty("EquivFareDecimalPlaces")
    public String getEquivFareDecimalPlaces() {
        return equivFareDecimalPlaces;
    }

    @JsonProperty("EquivFareDecimalPlaces")
    public void setEquivFareDecimalPlaces(String equivFareDecimalPlaces) {
        this.equivFareDecimalPlaces = equivFareDecimalPlaces;
    }

    @JsonProperty("TaxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("TaxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("TaxAmount")
    public String getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("TaxAmount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("TaxCurrencyCode")
    public String getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    @JsonProperty("TaxCurrencyCode")
    public void setTaxCurrencyCode(String taxCurrencyCode) {
        this.taxCurrencyCode = taxCurrencyCode;
    }

    @JsonProperty("TaxDecimalPlaces")
    public String getTaxDecimalPlaces() {
        return taxDecimalPlaces;
    }

    @JsonProperty("TaxDecimalPlaces")
    public void setTaxDecimalPlaces(String taxDecimalPlaces) {
        this.taxDecimalPlaces = taxDecimalPlaces;
    }

    @JsonProperty("TotalFareAmount")
    public String getTotalFareAmount() {
        return totalFareAmount;
    }

    @JsonProperty("TotalFareAmount")
    public void setTotalFareAmount(String totalFareAmount) {
        this.totalFareAmount = totalFareAmount;
    }

    @JsonProperty("TotalFareCurrencyCode")
    public String getTotalFareCurrencyCode() {
        return totalFareCurrencyCode;
    }

    @JsonProperty("TotalFareCurrencyCode")
    public void setTotalFareCurrencyCode(String totalFareCurrencyCode) {
        this.totalFareCurrencyCode = totalFareCurrencyCode;
    }

    @JsonProperty("TotalFareDecimalPlaces")
    public String getTotalFareDecimalPlaces() {
        return totalFareDecimalPlaces;
    }

    @JsonProperty("TotalFareDecimalPlaces")
    public void setTotalFareDecimalPlaces(String totalFareDecimalPlaces) {
        this.totalFareDecimalPlaces = totalFareDecimalPlaces;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
