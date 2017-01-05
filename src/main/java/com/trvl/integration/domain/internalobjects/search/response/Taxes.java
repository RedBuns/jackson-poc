
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tax"
})
public class Taxes {

    @JsonProperty("tax")
    private Tax tax;

    @JsonProperty("tax")
    public Tax getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
