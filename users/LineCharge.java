package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LineCharge {
    @JacksonXmlProperty(localName = "AmountFromAddnlLinePrices", isAttribute = true)
    private String amountFromAddnlLinePrices;

    @JacksonXmlProperty(localName = "ChargeAmount", isAttribute = true)
    private String chargeAmount;

    @JacksonXmlProperty(localName = "ChargeCategory", isAttribute = true)
    private String chargeCategory;

    @JacksonXmlProperty(localName = "ChargeName", isAttribute = true)
    private String chargeName;

    @JacksonXmlProperty(localName = "ChargeNameKey", isAttribute = true)
    private String chargeNameKey;

    @JacksonXmlProperty(localName = "ChargePerLine", isAttribute = true)
    private String chargePerLine;

    @JacksonXmlProperty(localName = "ChargePerUnit", isAttribute = true)
    private String chargePerUnit;

    @JacksonXmlProperty(localName = "InvoicedChargeAmount", isAttribute = true)
    private String invoicedChargeAmount;

    @JacksonXmlProperty(localName = "InvoicedChargePerLine", isAttribute = true)
    private String invoicedChargePerLine;

    @JacksonXmlProperty(localName = "InvoicedChargePerUnit", isAttribute = true)
    private String invoicedChargePerUnit;

    @JacksonXmlProperty(localName = "IsBillable", isAttribute = true)
    private String isBillable;

    @JacksonXmlProperty(localName = "IsDiscount", isAttribute = true)
    private String isDiscount;

    @JacksonXmlProperty(localName = "IsManual", isAttribute = true)
    private String isManual;

    @JacksonXmlProperty(localName = "IsShippingCharge", isAttribute = true)
    private String isShippingCharge;

    @JacksonXmlProperty(localName = "Reference", isAttribute = true)
    private String reference;

    @JacksonXmlProperty(localName = "RemainingChargeAmount", isAttribute = true)
    private String remainingChargeAmount;

    @JacksonXmlProperty(localName = "RemainingChargePerLine", isAttribute = true)
    private String remainingChargePerLine;

    public String getAmountFromAddnlLinePrices() {
        return amountFromAddnlLinePrices;
    }

    public void setAmountFromAddnlLinePrices(String amountFromAddnlLinePrices) {
        this.amountFromAddnlLinePrices = amountFromAddnlLinePrices;
    }

    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getChargeCategory() {
        return chargeCategory;
    }

    public void setChargeCategory(String chargeCategory) {
        this.chargeCategory = chargeCategory;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public String getChargeNameKey() {
        return chargeNameKey;
    }

    public void setChargeNameKey(String chargeNameKey) {
        this.chargeNameKey = chargeNameKey;
    }

    public String getChargePerLine() {
        return chargePerLine;
    }

    public void setChargePerLine(String chargePerLine) {
        this.chargePerLine = chargePerLine;
    }

    public String getChargePerUnit() {
        return chargePerUnit;
    }

    public void setChargePerUnit(String chargePerUnit) {
        this.chargePerUnit = chargePerUnit;
    }

    public String getInvoicedChargeAmount() {
        return invoicedChargeAmount;
    }

    public void setInvoicedChargeAmount(String invoicedChargeAmount) {
        this.invoicedChargeAmount = invoicedChargeAmount;
    }

    public String getInvoicedChargePerLine() {
        return invoicedChargePerLine;
    }

    public void setInvoicedChargePerLine(String invoicedChargePerLine) {
        this.invoicedChargePerLine = invoicedChargePerLine;
    }

    public String getInvoicedChargePerUnit() {
        return invoicedChargePerUnit;
    }

    public void setInvoicedChargePerUnit(String invoicedChargePerUnit) {
        this.invoicedChargePerUnit = invoicedChargePerUnit;
    }

    public String getIsBillable() {
        return isBillable;
    }

    public void setIsBillable(String isBillable) {
        this.isBillable = isBillable;
    }

    public String getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(String isDiscount) {
        this.isDiscount = isDiscount;
    }

    public String getIsManual() {
        return isManual;
    }

    public void setIsManual(String isManual) {
        this.isManual = isManual;
    }

    public String getIsShippingCharge() {
        return isShippingCharge;
    }

    public void setIsShippingCharge(String isShippingCharge) {
        this.isShippingCharge = isShippingCharge;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRemainingChargeAmount() {
        return remainingChargeAmount;
    }

    public void setRemainingChargeAmount(String remainingChargeAmount) {
        this.remainingChargeAmount = remainingChargeAmount;
    }

    public String getRemainingChargePerLine() {
        return remainingChargePerLine;
    }

    public void setRemainingChargePerLine(String remainingChargePerLine) {
        this.remainingChargePerLine = remainingChargePerLine;
    }

    public String getRemainingChargePerUnit() {
        return remainingChargePerUnit;
    }

    public void setRemainingChargePerUnit(String remainingChargePerUnit) {
        this.remainingChargePerUnit = remainingChargePerUnit;
    }

    @JacksonXmlProperty(localName = "RemainingChargePerUnit", isAttribute = true)
    private String remainingChargePerUnit;

    // Getters and setters...
}
