
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentId",
    "allowance"
})
public class BaggageInformation {

    @JsonProperty("segmentId")
    private String segmentId;
    @JsonProperty("allowance")
    private String allowance;

    @JsonProperty("segmentId")
    public String getSegmentId() {
        return segmentId;
    }

    @JsonProperty("segmentId")
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    @JsonProperty("allowance")
    public String getAllowance() {
        return allowance;
    }

    @JsonProperty("allowance")
    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
