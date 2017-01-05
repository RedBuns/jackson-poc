
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ptc_FareBreakdown"
})
public class PTCFareBreakdowns {

    @JsonProperty("ptc_FareBreakdown")
    private List<PtcFareBreakdown> ptcFareBreakdown;

    @JsonProperty("ptc_FareBreakdown")
    public List<PtcFareBreakdown> getPtcFareBreakdown() {
        return ptcFareBreakdown;
    }

    @JsonProperty("ptc_FareBreakdown")
    public void setPtcFareBreakdown(List<PtcFareBreakdown> ptcFareBreakdown) {
        this.ptcFareBreakdown = ptcFareBreakdown;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
