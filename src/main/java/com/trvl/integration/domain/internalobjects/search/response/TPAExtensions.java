
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "validatingCarrierCode",
    "eTicket"
})
public class TPAExtensions {

    @JsonProperty("validatingCarrierCode")
    private String validatingCarrierCode;
    @JsonProperty("eTicket")
    private String eTicket;

    @JsonProperty("validatingCarrierCode")
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    @JsonProperty("validatingCarrierCode")
    public void setValidatingCarrierCode(String validatingCarrierCode) {
        this.validatingCarrierCode = validatingCarrierCode;
    }

    @JsonProperty("eTicket")
    public String getETicket() {
        return eTicket;
    }

    @JsonProperty("eTicket")
    public void setETicket(String eTicket) {
        this.eTicket = eTicket;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
