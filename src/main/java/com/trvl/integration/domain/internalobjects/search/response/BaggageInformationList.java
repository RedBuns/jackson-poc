
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baggageInformation"
})
public class BaggageInformationList {

    @JsonProperty("baggageInformation")
    private BaggageInformation baggageInformation;

    @JsonProperty("baggageInformation")
    public BaggageInformation getBaggageInformation() {
        return baggageInformation;
    }

    @JsonProperty("baggageInformation")
    public void setBaggageInformation(BaggageInformation baggageInformation) {
        this.baggageInformation = baggageInformation;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
