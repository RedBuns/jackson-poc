
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "messageType",
    "AirlineCode",
    "failCode",
    "info"
})
public class Message {

    @JsonProperty("message")
    private String message;
    @JsonProperty("messageType")
    private String messageType;
    @JsonProperty("AirlineCode")
    private String airlineCode;
    @JsonProperty("failCode")
    private String failCode;
    @JsonProperty("info")
    private String info;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("messageType")
    public String getMessageType() {
        return messageType;
    }

    @JsonProperty("messageType")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @JsonProperty("AirlineCode")
    public String getAirlineCode() {
        return airlineCode;
    }

    @JsonProperty("AirlineCode")
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @JsonProperty("failCode")
    public String getFailCode() {
        return failCode;
    }

    @JsonProperty("failCode")
    public void setFailCode(String failCode) {
        this.failCode = failCode;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
