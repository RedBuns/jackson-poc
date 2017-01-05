
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "value"
})
public class TaxBreakup {

    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private Integer value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxBreakup() {
    }

    /**
     * 
     * @param value
     * @param key
     */
    public TaxBreakup(String key, Integer value) {
        super();
        this.key = key;
        this.value = value;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
