
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ErrorCode",
    "ErrorMessage"
})
public class Error {

    @JsonProperty("ErrorCode")
    private Integer errorCode;
    @JsonProperty("ErrorMessage")
    private String errorMessage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Error() {
    }

    /**
     * 
     * @param errorMessage
     * @param errorCode
     */
    public Error(Integer errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @JsonProperty("ErrorCode")
    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("ErrorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("ErrorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
