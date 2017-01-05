
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taxCode",
    "amount",
    "currencyCode",
    "decimalPlaces"
})
public class Tax {

    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("decimalPlaces")
    private String decimalPlaces;

    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("decimalPlaces")
    public String getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("decimalPlaces")
    public void setDecimalPlaces(String decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
