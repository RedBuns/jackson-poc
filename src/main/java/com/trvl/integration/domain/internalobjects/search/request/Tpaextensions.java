
package com.trvl.integration.domain.internalobjects.search.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestType",
    "compressResponse"
})
public class Tpaextensions {

    @JsonProperty("requestType")
    private String requestType;
    @JsonProperty("compressResponse")
    private String compressResponse;

    @JsonProperty("requestType")
    public String getRequestType() {
        return requestType;
    }

    @JsonProperty("requestType")
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @JsonProperty("compressResponse")
    public String getCompressResponse() {
        return compressResponse;
    }

    @JsonProperty("compressResponse")
    public void setCompressResponse(String compressResponse) {
        this.compressResponse = compressResponse;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
