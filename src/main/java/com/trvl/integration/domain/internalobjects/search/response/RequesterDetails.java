
package com.trvl.integration.domain.internalobjects.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestId",
    "sessionID",
    "appID",
    "userName",
    "requesterType",
    "pseudoCityCode",
    "companyName"
})
public class RequesterDetails {

    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("sessionID")
    private String sessionID;
    @JsonProperty("appID")
    private String appID;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("requesterType")
    private String requesterType;
    @JsonProperty("pseudoCityCode")
    private String pseudoCityCode;
    @JsonProperty("companyName")
    private String companyName;

    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("sessionID")
    public String getSessionID() {
        return sessionID;
    }

    @JsonProperty("sessionID")
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    @JsonProperty("appID")
    public String getAppID() {
        return appID;
    }

    @JsonProperty("appID")
    public void setAppID(String appID) {
        this.appID = appID;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("requesterType")
    public String getRequesterType() {
        return requesterType;
    }

    @JsonProperty("requesterType")
    public void setRequesterType(String requesterType) {
        this.requesterType = requesterType;
    }

    @JsonProperty("pseudoCityCode")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    @JsonProperty("pseudoCityCode")
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
