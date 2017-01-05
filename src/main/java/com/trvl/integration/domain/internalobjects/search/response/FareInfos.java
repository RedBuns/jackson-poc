
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fareInfo"
})
public class FareInfos {

    @JsonProperty("fareInfo")
    private FareInfo fareInfo;

    @JsonProperty("fareInfo")
    public FareInfo getFareInfo() {
        return fareInfo;
    }

    @JsonProperty("fareInfo")
    public void setFareInfo(FareInfo fareInfo) {
        this.fareInfo = fareInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
