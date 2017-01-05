
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Response"
})
public class SearchResponse {

    @JsonProperty("Response")
    private Response response;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchResponse() {
    }

    /**
     * 
     * @param response
     */
    public SearchResponse(Response response) {
        super();
        this.response = response;
    }

    @JsonProperty("Response")
    public Response getResponse() {
        return response;
    }

    @JsonProperty("Response")
    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
