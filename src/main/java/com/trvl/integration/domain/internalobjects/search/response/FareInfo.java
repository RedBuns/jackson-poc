
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fareReference",
    "seatsRemaining",
    "belowMin",
    "mealcode"
})
public class FareInfo {

    @JsonProperty("fareReference")
    private String fareReference;
    @JsonProperty("seatsRemaining")
    private String seatsRemaining;
    @JsonProperty("belowMin")
    private String belowMin;
    @JsonProperty("mealcode")
    private String mealcode;

    @JsonProperty("fareReference")
    public String getFareReference() {
        return fareReference;
    }

    @JsonProperty("fareReference")
    public void setFareReference(String fareReference) {
        this.fareReference = fareReference;
    }

    @JsonProperty("seatsRemaining")
    public String getSeatsRemaining() {
        return seatsRemaining;
    }

    @JsonProperty("seatsRemaining")
    public void setSeatsRemaining(String seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }

    @JsonProperty("belowMin")
    public String getBelowMin() {
        return belowMin;
    }

    @JsonProperty("belowMin")
    public void setBelowMin(String belowMin) {
        this.belowMin = belowMin;
    }

    @JsonProperty("mealcode")
    public String getMealcode() {
        return mealcode;
    }

    @JsonProperty("mealcode")
    public void setMealcode(String mealcode) {
        this.mealcode = mealcode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
