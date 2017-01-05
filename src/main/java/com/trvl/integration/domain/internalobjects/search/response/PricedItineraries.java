
package com.trvl.integration.domain.internalobjects.search.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pricedItinerary"
})
public class PricedItineraries {

    @JsonProperty("pricedItinerary")
    private List<PricedItinerary> pricedItinerary = null;

    @JsonProperty("pricedItinerary")
    public List<PricedItinerary> getPricedItinerary() {
        return pricedItinerary;
    }

    @JsonProperty("pricedItinerary")
    public void setPricedItinerary(List<PricedItinerary> pricedItinerary) {
        this.pricedItinerary = pricedItinerary;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
