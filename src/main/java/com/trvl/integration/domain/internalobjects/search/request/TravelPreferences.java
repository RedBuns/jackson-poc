
package com.trvl.integration.domain.internalobjects.search.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eTicketDesired"
})
public class TravelPreferences {

    @JsonProperty("eTicketDesired")
    private String eTicketDesired;

    @JsonProperty("eTicketDesired")
    public String getETicketDesired() {
        return eTicketDesired;
    }

    @JsonProperty("eTicketDesired")
    public void setETicketDesired(String eTicketDesired) {
        this.eTicketDesired = eTicketDesired;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
