
package com.trvl.integration.domain.universalair.search.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirportCode",
    "AirportName",
    "Terminal",
    "CityCode",
    "CityName",
    "CountryCode",
    "CountryName"
})
public class Airport {

    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("AirportName")
    private String airportName;
    @JsonProperty("Terminal")
    private String terminal;
    @JsonProperty("CityCode")
    private String cityCode;
    @JsonProperty("CityName")
    private String cityName;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("CountryName")
    private String countryName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Airport() {
    }

    /**
     * 
     * @param countryName
     * @param airportName
     * @param terminal
     * @param cityName
     * @param airportCode
     * @param countryCode
     * @param cityCode
     */
    public Airport(String airportCode, String airportName, String terminal, String cityCode, String cityName, String countryCode, String countryName) {
        super();
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.terminal = terminal;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    @JsonProperty("AirportCode")
    public String getAirportCode() {
        return airportCode;
    }

    @JsonProperty("AirportCode")
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @JsonProperty("AirportName")
    public String getAirportName() {
        return airportName;
    }

    @JsonProperty("AirportName")
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @JsonProperty("Terminal")
    public String getTerminal() {
        return terminal;
    }

    @JsonProperty("Terminal")
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @JsonProperty("CityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("CityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("CityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("CityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("CountryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("CountryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
