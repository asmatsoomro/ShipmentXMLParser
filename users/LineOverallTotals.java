package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LineOverallTotals {
    @JacksonXmlProperty(localName = "AdditionalLinePriceTotal", isAttribute = true)
    private String additionalLinePriceTotal;

    @JacksonXmlProperty(localName = "Charges", isAttribute = true)
    private String charges;

    @JacksonXmlProperty(localName = "Discount", isAttribute = true)
    private String discount;

    @JacksonXmlProperty(localName = "ExtendedPrice", isAttribute = true)
    private String extendedPrice;

    @JacksonXmlProperty(localName = "LineCost", isAttribute = true)
    private String lineCost;

    @JacksonXmlProperty(localName = "LineTotal", isAttribute = true)
    private String lineTotal;

    @JacksonXmlProperty(localName = "LineTotalWithoutTax", isAttribute = true)
    private String lineTotalWithoutTax;

    @JacksonXmlProperty(localName = "ManualDiscountPercentage", isAttribute = true)
    private String manualDiscountPercentage;

    @JacksonXmlProperty(localName = "ManualOverridePercentage", isAttribute = true)
    private String manualOverridePercentage;

    @JacksonXmlProperty(localName = "OptionPrice", isAttribute = true)
    private String optionPrice;

    @JacksonXmlProperty(localName = "PercentProfitMargin", isAttribute = true)
    private String percentProfitMargin;

    @JacksonXmlProperty(localName = "PricingQty", isAttribute = true)
    private String pricingQty;

    @JacksonXmlProperty(localName = "ShippingBaseCharge", isAttribute = true)
    private String shippingBaseCharge;

    @JacksonXmlProperty(localName = "ShippingCharges", isAttribute = true)
    private String shippingCharges;

    @JacksonXmlProperty(localName = "ShippingDiscount", isAttribute = true)
    private String shippingDiscount;

    @JacksonXmlProperty(localName = "ShippingTotal", isAttribute = true)
    private String shippingTotal;

    @JacksonXmlProperty(localName = "Tax", isAttribute = true)
    private String tax;

    public String getAdditionalLinePriceTotal() {
        return additionalLinePriceTotal;
    }

    public void setAdditionalLinePriceTotal(String additionalLinePriceTotal) {
        this.additionalLinePriceTotal = additionalLinePriceTotal;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(String extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public String getLineCost() {
        return lineCost;
    }

    public void setLineCost(String lineCost) {
        this.lineCost = lineCost;
    }

    public String getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(String lineTotal) {
        this.lineTotal = lineTotal;
    }

    public String getLineTotalWithoutTax() {
        return lineTotalWithoutTax;
    }

    public void setLineTotalWithoutTax(String lineTotalWithoutTax) {
        this.lineTotalWithoutTax = lineTotalWithoutTax;
    }

    public String getManualDiscountPercentage() {
        return manualDiscountPercentage;
    }

    public void setManualDiscountPercentage(String manualDiscountPercentage) {
        this.manualDiscountPercentage = manualDiscountPercentage;
    }

    public String getManualOverridePercentage() {
        return manualOverridePercentage;
    }

    public void setManualOverridePercentage(String manualOverridePercentage) {
        this.manualOverridePercentage = manualOverridePercentage;
    }

    public String getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(String optionPrice) {
        this.optionPrice = optionPrice;
    }

    public String getPercentProfitMargin() {
        return percentProfitMargin;
    }

    public void setPercentProfitMargin(String percentProfitMargin) {
        this.percentProfitMargin = percentProfitMargin;
    }

    public String getPricingQty() {
        return pricingQty;
    }

    public void setPricingQty(String pricingQty) {
        this.pricingQty = pricingQty;
    }

    public String getShippingBaseCharge() {
        return shippingBaseCharge;
    }

    public void setShippingBaseCharge(String shippingBaseCharge) {
        this.shippingBaseCharge = shippingBaseCharge;
    }

    public String getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(String shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public String getShippingDiscount() {
        return shippingDiscount;
    }

    public void setShippingDiscount(String shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }

    public String getShippingTotal() {
        return shippingTotal;
    }

    public void setShippingTotal(String shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JacksonXmlProperty(localName = "UnitPrice", isAttribute = true)
    private String unitPrice;

    // Getters and setters...
}
