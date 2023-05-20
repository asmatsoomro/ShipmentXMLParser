package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ShipmentLine {

    @JacksonXmlProperty(localName = "ActualQuantity", isAttribute = true)
    private String actualQuantity;

    @JacksonXmlProperty(localName = "ChainedFromOrderHeaderKey", isAttribute = true)
    private String chainedFromOrderHeaderKey;

    @JacksonXmlProperty(localName = "ChainedFromOrderLineKey", isAttribute = true)
    private String chainedFromOrderLineKey;

    @JacksonXmlProperty(localName = "DocumentType", isAttribute = true)
    private String documentType;

    @JacksonXmlProperty(localName = "ItemDesc", isAttribute = true)
    private String itemDesc;

    @JacksonXmlProperty(localName = "ItemID", isAttribute = true)
    private String itemID;

    @JacksonXmlProperty(localName = "OrderHeaderKey", isAttribute = true)
    private String orderHeaderKey;

    @JacksonXmlProperty(localName = "OrderLineKey", isAttribute = true)
    private String orderLineKey;

    @JacksonXmlProperty(localName = "OrderNo", isAttribute = true)
    private String orderNo;

    @JacksonXmlProperty(localName = "OrderReleaseKey", isAttribute = true)
    private String orderReleaseKey;

    @JacksonXmlProperty(localName = "OverShipQuantity", isAttribute = true)
    private String overShipQuantity;

    @JacksonXmlProperty(localName = "PrimeLineNo", isAttribute = true)
    private String primeLineNo;

    @JacksonXmlProperty(localName = "ProductClass", isAttribute = true)
    private String productClass;

    @JacksonXmlProperty(localName = "Quantity", isAttribute = true)
    private String quantity;

    @JacksonXmlProperty(localName = "ReleaseNo", isAttribute = true)
    private String releaseNo;

    @JacksonXmlProperty(localName = "Segment", isAttribute = true)
    private String segment;

    @JacksonXmlProperty(localName = "SegmentType", isAttribute = true)
    private String segmentType;

    @JacksonXmlProperty(localName = "ShipmentKey", isAttribute = true)
    private String shipmentKey;

    @JacksonXmlProperty(localName = "ShipmentLineKey", isAttribute = true)
    private String shipmentLineKey;

    @JacksonXmlProperty(localName = "ShipmentLineNo", isAttribute = true)
    private String shipmentLineNo;

    @JacksonXmlProperty(localName = "SubLineNo", isAttribute = true)
    private String subLineNo;

    @JacksonXmlProperty(localName = "UnitOfMeasure", isAttribute = true)
    private String unitOfMeasure;

    public String getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(String actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public String getChainedFromOrderHeaderKey() {
        return chainedFromOrderHeaderKey;
    }

    public void setChainedFromOrderHeaderKey(String chainedFromOrderHeaderKey) {
        this.chainedFromOrderHeaderKey = chainedFromOrderHeaderKey;
    }

    public String getChainedFromOrderLineKey() {
        return chainedFromOrderLineKey;
    }

    public void setChainedFromOrderLineKey(String chainedFromOrderLineKey) {
        this.chainedFromOrderLineKey = chainedFromOrderLineKey;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderReleaseKey() {
        return orderReleaseKey;
    }

    public void setOrderReleaseKey(String orderReleaseKey) {
        this.orderReleaseKey = orderReleaseKey;
    }

    public String getOverShipQuantity() {
        return overShipQuantity;
    }

    public void setOverShipQuantity(String overShipQuantity) {
        this.overShipQuantity = overShipQuantity;
    }

    public String getPrimeLineNo() {
        return primeLineNo;
    }

    public void setPrimeLineNo(String primeLineNo) {
        this.primeLineNo = primeLineNo;
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getReleaseNo() {
        return releaseNo;
    }

    public void setReleaseNo(String releaseNo) {
        this.releaseNo = releaseNo;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public String getShipmentKey() {
        return shipmentKey;
    }

    public void setShipmentKey(String shipmentKey) {
        this.shipmentKey = shipmentKey;
    }

    public String getShipmentLineKey() {
        return shipmentLineKey;
    }

    public void setShipmentLineKey(String shipmentLineKey) {
        this.shipmentLineKey = shipmentLineKey;
    }

    public String getShipmentLineNo() {
        return shipmentLineNo;
    }

    public void setShipmentLineNo(String shipmentLineNo) {
        this.shipmentLineNo = shipmentLineNo;
    }

    public String getSubLineNo() {
        return subLineNo;
    }

    public void setSubLineNo(String subLineNo) {
        this.subLineNo = subLineNo;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getIsHistory() {
        return isHistory;
    }

    public void setIsHistory(String isHistory) {
        this.isHistory = isHistory;
    }

    @JacksonXmlProperty(localName = "isHistory", isAttribute = true)
    private String isHistory;

    // Getters and Setters

    @JacksonXmlProperty(localName = "OrderLine")
    private OrderLine orderLine;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @JacksonXmlProperty(localName = "Order")
    private Order order;

    // Getters and Setters
    // ...

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    @JacksonXmlProperty(localName = "OrderRelease")
    private OrderRelease orderRelease;

    public OrderRelease getOrderRelease() {
        return orderRelease;
    }

    public void setOrderRelease(OrderRelease orderRelease) {
        this.orderRelease = orderRelease;
    }
}
