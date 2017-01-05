
package com.trvl.integration.domain.universalair.search.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Currency",
    "BaseFare",
    "Tax",
    "TaxBreakup",
    "YQTax",
    "AdditionalTxnFeeOfrd",
    "AdditionalTxnFeePub",
    "OtherCharges",
    "ChargeBU",
    "Discount",
    "PublishedFare",
    "CommissionEarned",
    "PLBEarned",
    "IncentiveEarned",
    "OfferedFare",
    "TdsOnCommission",
    "TdsOnPLB",
    "TdsOnIncentive",
    "ServiceFee",
    "TotalBaggageCharges",
    "TotalMealCharges",
    "TotalSeatCharges"
})
public class Fare {

    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("BaseFare")
    private Integer baseFare;
    @JsonProperty("Tax")
    private Integer tax;
    @JsonProperty("TaxBreakup")
    private List<TaxBreakup> taxBreakup = null;
    @JsonProperty("YQTax")
    private Integer yQTax;
    @JsonProperty("AdditionalTxnFeeOfrd")
    private Integer additionalTxnFeeOfrd;
    @JsonProperty("AdditionalTxnFeePub")
    private Integer additionalTxnFeePub;
    @JsonProperty("OtherCharges")
    private Integer otherCharges;
    @JsonProperty("ChargeBU")
    private List<ChargeBU> chargeBU = null;
    @JsonProperty("Discount")
    private Integer discount;
    @JsonProperty("PublishedFare")
    private Integer publishedFare;
    @JsonProperty("CommissionEarned")
    private Integer commissionEarned;
    @JsonProperty("PLBEarned")
    private Integer pLBEarned;
    @JsonProperty("IncentiveEarned")
    private Integer incentiveEarned;
    @JsonProperty("OfferedFare")
    private Integer offeredFare;
    @JsonProperty("TdsOnCommission")
    private Integer tdsOnCommission;
    @JsonProperty("TdsOnPLB")
    private Integer tdsOnPLB;
    @JsonProperty("TdsOnIncentive")
    private Integer tdsOnIncentive;
    @JsonProperty("ServiceFee")
    private Integer serviceFee;
    @JsonProperty("TotalBaggageCharges")
    private Integer totalBaggageCharges;
    @JsonProperty("TotalMealCharges")
    private Integer totalMealCharges;
    @JsonProperty("TotalSeatCharges")
    private Integer totalSeatCharges;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fare() {
    }

    /**
     * 
     * @param incentiveEarned
     * @param serviceFee
     * @param baseFare
     * @param commissionEarned
     * @param chargeBU
     * @param taxBreakup
     * @param otherCharges
     * @param tdsOnPLB
     * @param totalBaggageCharges
     * @param yQTax
     * @param offeredFare
     * @param currency
     * @param discount
     * @param publishedFare
     * @param additionalTxnFeeOfrd
     * @param tax
     * @param totalSeatCharges
     * @param tdsOnIncentive
     * @param tdsOnCommission
     * @param additionalTxnFeePub
     * @param totalMealCharges
     * @param pLBEarned
     */
    public Fare(String currency, Integer baseFare, Integer tax, List<TaxBreakup> taxBreakup, Integer yQTax, Integer additionalTxnFeeOfrd, Integer additionalTxnFeePub, Integer otherCharges, List<ChargeBU> chargeBU, Integer discount, Integer publishedFare, Integer commissionEarned, Integer pLBEarned, Integer incentiveEarned, Integer offeredFare, Integer tdsOnCommission, Integer tdsOnPLB, Integer tdsOnIncentive, Integer serviceFee, Integer totalBaggageCharges, Integer totalMealCharges, Integer totalSeatCharges) {
        super();
        this.currency = currency;
        this.baseFare = baseFare;
        this.tax = tax;
        this.taxBreakup = taxBreakup;
        this.yQTax = yQTax;
        this.additionalTxnFeeOfrd = additionalTxnFeeOfrd;
        this.additionalTxnFeePub = additionalTxnFeePub;
        this.otherCharges = otherCharges;
        this.chargeBU = chargeBU;
        this.discount = discount;
        this.publishedFare = publishedFare;
        this.commissionEarned = commissionEarned;
        this.pLBEarned = pLBEarned;
        this.incentiveEarned = incentiveEarned;
        this.offeredFare = offeredFare;
        this.tdsOnCommission = tdsOnCommission;
        this.tdsOnPLB = tdsOnPLB;
        this.tdsOnIncentive = tdsOnIncentive;
        this.serviceFee = serviceFee;
        this.totalBaggageCharges = totalBaggageCharges;
        this.totalMealCharges = totalMealCharges;
        this.totalSeatCharges = totalSeatCharges;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("BaseFare")
    public Integer getBaseFare() {
        return baseFare;
    }

    @JsonProperty("BaseFare")
    public void setBaseFare(Integer baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("Tax")
    public Integer getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    @JsonProperty("TaxBreakup")
    public List<TaxBreakup> getTaxBreakup() {
        return taxBreakup;
    }

    @JsonProperty("TaxBreakup")
    public void setTaxBreakup(List<TaxBreakup> taxBreakup) {
        this.taxBreakup = taxBreakup;
    }

    @JsonProperty("YQTax")
    public Integer getYQTax() {
        return yQTax;
    }

    @JsonProperty("YQTax")
    public void setYQTax(Integer yQTax) {
        this.yQTax = yQTax;
    }

    @JsonProperty("AdditionalTxnFeeOfrd")
    public Integer getAdditionalTxnFeeOfrd() {
        return additionalTxnFeeOfrd;
    }

    @JsonProperty("AdditionalTxnFeeOfrd")
    public void setAdditionalTxnFeeOfrd(Integer additionalTxnFeeOfrd) {
        this.additionalTxnFeeOfrd = additionalTxnFeeOfrd;
    }

    @JsonProperty("AdditionalTxnFeePub")
    public Integer getAdditionalTxnFeePub() {
        return additionalTxnFeePub;
    }

    @JsonProperty("AdditionalTxnFeePub")
    public void setAdditionalTxnFeePub(Integer additionalTxnFeePub) {
        this.additionalTxnFeePub = additionalTxnFeePub;
    }

    @JsonProperty("OtherCharges")
    public Integer getOtherCharges() {
        return otherCharges;
    }

    @JsonProperty("OtherCharges")
    public void setOtherCharges(Integer otherCharges) {
        this.otherCharges = otherCharges;
    }

    @JsonProperty("ChargeBU")
    public List<ChargeBU> getChargeBU() {
        return chargeBU;
    }

    @JsonProperty("ChargeBU")
    public void setChargeBU(List<ChargeBU> chargeBU) {
        this.chargeBU = chargeBU;
    }

    @JsonProperty("Discount")
    public Integer getDiscount() {
        return discount;
    }

    @JsonProperty("Discount")
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @JsonProperty("PublishedFare")
    public Integer getPublishedFare() {
        return publishedFare;
    }

    @JsonProperty("PublishedFare")
    public void setPublishedFare(Integer publishedFare) {
        this.publishedFare = publishedFare;
    }

    @JsonProperty("CommissionEarned")
    public Integer getCommissionEarned() {
        return commissionEarned;
    }

    @JsonProperty("CommissionEarned")
    public void setCommissionEarned(Integer commissionEarned) {
        this.commissionEarned = commissionEarned;
    }

    @JsonProperty("PLBEarned")
    public Integer getPLBEarned() {
        return pLBEarned;
    }

    @JsonProperty("PLBEarned")
    public void setPLBEarned(Integer pLBEarned) {
        this.pLBEarned = pLBEarned;
    }

    @JsonProperty("IncentiveEarned")
    public Integer getIncentiveEarned() {
        return incentiveEarned;
    }

    @JsonProperty("IncentiveEarned")
    public void setIncentiveEarned(Integer incentiveEarned) {
        this.incentiveEarned = incentiveEarned;
    }

    @JsonProperty("OfferedFare")
    public Integer getOfferedFare() {
        return offeredFare;
    }

    @JsonProperty("OfferedFare")
    public void setOfferedFare(Integer offeredFare) {
        this.offeredFare = offeredFare;
    }

    @JsonProperty("TdsOnCommission")
    public Integer getTdsOnCommission() {
        return tdsOnCommission;
    }

    @JsonProperty("TdsOnCommission")
    public void setTdsOnCommission(Integer tdsOnCommission) {
        this.tdsOnCommission = tdsOnCommission;
    }

    @JsonProperty("TdsOnPLB")
    public Integer getTdsOnPLB() {
        return tdsOnPLB;
    }

    @JsonProperty("TdsOnPLB")
    public void setTdsOnPLB(Integer tdsOnPLB) {
        this.tdsOnPLB = tdsOnPLB;
    }

    @JsonProperty("TdsOnIncentive")
    public Integer getTdsOnIncentive() {
        return tdsOnIncentive;
    }

    @JsonProperty("TdsOnIncentive")
    public void setTdsOnIncentive(Integer tdsOnIncentive) {
        this.tdsOnIncentive = tdsOnIncentive;
    }

    @JsonProperty("ServiceFee")
    public Integer getServiceFee() {
        return serviceFee;
    }

    @JsonProperty("ServiceFee")
    public void setServiceFee(Integer serviceFee) {
        this.serviceFee = serviceFee;
    }

    @JsonProperty("TotalBaggageCharges")
    public Integer getTotalBaggageCharges() {
        return totalBaggageCharges;
    }

    @JsonProperty("TotalBaggageCharges")
    public void setTotalBaggageCharges(Integer totalBaggageCharges) {
        this.totalBaggageCharges = totalBaggageCharges;
    }

    @JsonProperty("TotalMealCharges")
    public Integer getTotalMealCharges() {
        return totalMealCharges;
    }

    @JsonProperty("TotalMealCharges")
    public void setTotalMealCharges(Integer totalMealCharges) {
        this.totalMealCharges = totalMealCharges;
    }

    @JsonProperty("TotalSeatCharges")
    public Integer getTotalSeatCharges() {
        return totalSeatCharges;
    }

    @JsonProperty("TotalSeatCharges")
    public void setTotalSeatCharges(Integer totalSeatCharges) {
        this.totalSeatCharges = totalSeatCharges;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
