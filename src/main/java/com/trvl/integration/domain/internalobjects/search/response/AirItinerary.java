
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "directionInd",
    "originDestinationOption"
})
public class AirItinerary {

    @JsonProperty("directionInd")
    private String directionInd;
    @JsonProperty("originDestinationOption")
    private OriginDestinationOption originDestinationOption;

    @JsonProperty("directionInd")
    public String getDirectionInd() {
        return directionInd;
    }

    @JsonProperty("directionInd")
    public void setDirectionInd(String directionInd) {
        this.directionInd = directionInd;
    }

    @JsonProperty("originDestinationOption")
    public OriginDestinationOption getOriginDestinationOption() {
        return originDestinationOption;
    }

    @JsonProperty("originDestinationOption")
    public void setOriginDestinationOption(OriginDestinationOption originDestinationOption) {
        this.originDestinationOption = originDestinationOption;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
