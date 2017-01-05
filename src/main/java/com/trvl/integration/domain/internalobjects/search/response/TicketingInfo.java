
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ticketType",
    "validInterline"
})
public class TicketingInfo {

    @JsonProperty("ticketType")
    private String ticketType;
    @JsonProperty("validInterline")
    private String validInterline;

    @JsonProperty("ticketType")
    public String getTicketType() {
        return ticketType;
    }

    @JsonProperty("ticketType")
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @JsonProperty("validInterline")
    public String getValidInterline() {
        return validInterline;
    }

    @JsonProperty("validInterline")
    public void setValidInterline(String validInterline) {
        this.validInterline = validInterline;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
