package com.trvl.integration.domain.universalair.search.response;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResponseStatus",
    "Error",
    "TraceId",
    "Origin",
    "Destination",
    "Results"
})
public class Response {

    @JsonProperty("ResponseStatus")
    private Integer responseStatus;
    @JsonProperty("Error")
    private Error error;
    @JsonProperty("TraceId")
    private String traceId;
    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Destination")
    private String destination;
    @JsonProperty("Results")
    private List<List<Result>> results = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param results
     * @param error
     * @param responseStatus
     * @param traceId
     * @param origin
     * @param destination
     */
    public Response(Integer responseStatus, Error error, String traceId, String origin, String destination, List<List<Result>> results) {
        super();
        this.responseStatus = responseStatus;
        this.error = error;
        this.traceId = traceId;
        this.origin = origin;
        this.destination = destination;
        this.results = results;
    }

    @JsonProperty("ResponseStatus")
    public Integer getResponseStatus() {
        return responseStatus;
    }

    @JsonProperty("ResponseStatus")
    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    @JsonProperty("Error")
    public Error getError() {
        return error;
    }

    @JsonProperty("Error")
    public void setError(Error error) {
        this.error = error;
    }

    @JsonProperty("TraceId")
    public String getTraceId() {
        return traceId;
    }

    @JsonProperty("TraceId")
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @JsonProperty("Origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("Destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("Destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("Results")
    public List<List<Result>> getResults() {
        return results;
    }

    @JsonProperty("Results")
    public void setResults(List<List<Result>> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
