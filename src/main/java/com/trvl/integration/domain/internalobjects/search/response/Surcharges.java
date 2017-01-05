
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "surcharges",
    "surchargesInd",
    "surchargesType"
})
public class Surcharges {

    @JsonProperty("surcharges")
    private String surcharges;
    @JsonProperty("surchargesInd")
    private String surchargesInd;
    @JsonProperty("surchargesType")
    private String surchargesType;

    @JsonProperty("surcharges")
    public String getSurcharges() {
        return surcharges;
    }

    @JsonProperty("surcharges")
    public void setSurcharges(String surcharges) {
        this.surcharges = surcharges;
    }

    @JsonProperty("surchargesInd")
    public String getSurchargesInd() {
        return surchargesInd;
    }

    @JsonProperty("surchargesInd")
    public void setSurchargesInd(String surchargesInd) {
        this.surchargesInd = surchargesInd;
    }

    @JsonProperty("surchargesType")
    public String getSurchargesType() {
        return surchargesType;
    }

    @JsonProperty("surchargesType")
    public void setSurchargesType(String surchargesType) {
        this.surchargesType = surchargesType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
