package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class OrderLine {
    @JacksonXmlProperty(localName = "ConditionVariable1", isAttribute = true)
    private String conditionVariable1;

    @JacksonXmlProperty(localName = "DeliveryMethod", isAttribute = true)
    private String deliveryMethod;

    @JacksonXmlProperty(localName = "LineType", isAttribute = true)
    private String lineType;

    @JacksonXmlProperty(localName = "OrderHeaderKey", isAttribute = true)
    private String orderHeaderKey;

    @JacksonXmlProperty(localName = "OrderLineKey", isAttribute = true)
    private String orderLineKey;

    @JacksonXmlProperty(localName = "OrderedQty", isAttribute = true)
    private String orderedQty;

    @JacksonXmlProperty(localName = "PrimeLineNo", isAttribute = true)
    private String primeLineNo;

    @JacksonXmlProperty(localName = "Purpose", isAttribute = true)
    private String purpose;

    @JacksonXmlProperty(localName = "SCAC", isAttribute = true)
    private String scac;

    @JacksonXmlProperty(localName = "ScacAndService", isAttribute = true)
    private String scacAndService;

    @JacksonXmlProperty(localName = "ShipNode", isAttribute = true)
    private String shipNode;

    @JacksonXmlProperty(localName = "SubLineNo", isAttribute = true)
    private String subLineNo;

    @JacksonXmlProperty(localName = "Item")
    private Item item;


    @JacksonXmlProperty(localName = "ItemDetails")
    private ItemDetails itemDetails;

    public LineCharge[] getLineCharges() {
        return lineCharges;
    }

    public void setLineCharges(LineCharge[] lineCharges) {
        this.lineCharges = lineCharges;
    }

    @JacksonXmlElementWrapper(localName = "LineCharges")
    @JacksonXmlProperty(localName = "LineCharge")
    private LineCharge[] lineCharges;

    public LineTax[] getLineTaxes() {
        return lineTaxes;
    }

    public void setLineTaxes(LineTax[] lineTaxes) {
        this.lineTaxes = lineTaxes;
    }

    @JacksonXmlElementWrapper(localName = "LineTaxes")
    @JacksonXmlProperty(localName = "LineTax")
    private LineTax[] lineTaxes;

    public LineOverallTotals getLineOverallTotals() {
        return lineOverallTotals;
    }

    public void setLineOverallTotals(LineOverallTotals lineOverallTotals) {
        this.lineOverallTotals = lineOverallTotals;
    }

    @JacksonXmlProperty(localName = "LineOverallTotals")
    private LineOverallTotals lineOverallTotals;


    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    public String getConditionVariable1() {
        return conditionVariable1;
    }

    public void setConditionVariable1(String conditionVariable1) {
        this.conditionVariable1 = conditionVariable1;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getOrderHeaderKey() {
        return orderHeaderKey;
    }

    public void setOrderHeaderKey(String orderHeaderKey) {
        this.orderHeaderKey = orderHeaderKey;
    }

    public String getOrderLineKey() {
        return orderLineKey;
    }

    public void setOrderLineKey(String orderLineKey) {
        this.orderLineKey = orderLineKey;
    }

    public String getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(String orderedQty) {
        this.orderedQty = orderedQty;
    }

    public String getPrimeLineNo() {
        return primeLineNo;
    }

    public void setPrimeLineNo(String primeLineNo) {
        this.primeLineNo = primeLineNo;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getScac() {
        return scac;
    }

    public void setScac(String scac) {
        this.scac = scac;
    }

    public String getScacAndService() {
        return scacAndService;
    }

    public void setScacAndService(String scacAndService) {
        this.scacAndService = scacAndService;
    }

    public String getShipNode() {
        return shipNode;
    }

    public void setShipNode(String shipNode) {
        this.shipNode = shipNode;
    }

    public String getSubLineNo() {
        return subLineNo;
    }

    public void setSubLineNo(String subLineNo) {
        this.subLineNo = subLineNo;
    }

    public Extn getExtn() {
        return extn;
    }

    public void setExtn(Extn extn) {
        this.extn = extn;
    }

    @JacksonXmlProperty(localName = "Extn")
    private Extn extn;

    // Getters and Setters
    // ...

    public static class Extn {
        @JacksonXmlProperty(localName = "ExtnIsCoreSKU", isAttribute = true)
        private String extnIsCoreSKU;

        @JacksonXmlProperty(localName = "ExtnRollupNo", isAttribute = true)
        private String extnRollupNo;

        @JacksonXmlProperty(localName = "ExtnShipModeId", isAttribute = true)
        private String extnShipModeId;

        @JacksonXmlProperty(localName = "ExtnWarrantyDays", isAttribute = true)
        private String extnWarrantyDays;

        public String getExtnIsCoreSKU() {
            return extnIsCoreSKU;
        }

        public void setExtnIsCoreSKU(String extnIsCoreSKU) {
            this.extnIsCoreSKU = extnIsCoreSKU;
        }

        public String getExtnRollupNo() {
            return extnRollupNo;
        }

        public void setExtnRollupNo(String extnRollupNo) {
            this.extnRollupNo = extnRollupNo;
        }

        public String getExtnShipModeId() {
            return extnShipModeId;
        }

        public void setExtnShipModeId(String extnShipModeId) {
            this.extnShipModeId = extnShipModeId;
        }

        public String getExtnWarrantyDays() {
            return extnWarrantyDays;
        }

        public void setExtnWarrantyDays(String extnWarrantyDays) {
            this.extnWarrantyDays = extnWarrantyDays;
        }

        public String getExtnWarrantyDescription() {
            return extnWarrantyDescription;
        }

        public void setExtnWarrantyDescription(String extnWarrantyDescription) {
            this.extnWarrantyDescription = extnWarrantyDescription;
        }

        @JacksonXmlProperty(localName = "ExtnWarrantyDescription", isAttribute = true)
        private String extnWarrantyDescription;

        // Getters and Setters
        // ...
    }
}
