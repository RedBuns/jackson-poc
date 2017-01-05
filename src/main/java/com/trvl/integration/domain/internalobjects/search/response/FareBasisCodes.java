
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fareBasisCode"
})
public class FareBasisCodes {

    @JsonProperty("fareBasisCode")
    private FareBasisCode fareBasisCode;

    @JsonProperty("fareBasisCode")
    public FareBasisCode getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("fareBasisCode")
    public void setFareBasisCode(FareBasisCode fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
