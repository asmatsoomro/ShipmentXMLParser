package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRelease {
    @JacksonXmlProperty(localName = "OrderReleaseKey", isAttribute = true)
    private String orderReleaseKey;

    @JacksonXmlProperty(localName = "ReleaseNo", isAttribute = true)
    private String releaseNo;

    @JacksonXmlProperty(localName = "SalesOrderNo", isAttribute = true)
    private String salesOrderNo;

    @JacksonXmlProperty(localName = "ShipNode", isAttribute = true)
    private String shipNode;

    public String getOrderReleaseKey() {
        return orderReleaseKey;
    }

    public void setOrderReleaseKey(String orderReleaseKey) {
        this.orderReleaseKey = orderReleaseKey;
    }

    public String getReleaseNo() {
        return releaseNo;
    }

    public void setReleaseNo(String releaseNo) {
        this.releaseNo = releaseNo;
    }

    public String getSalesOrderNo() {
        return salesOrderNo;
    }

    public void setSalesOrderNo(String salesOrderNo) {
        this.salesOrderNo = salesOrderNo;
    }

    public String getShipNode() {
        return shipNode;
    }

    public void setShipNode(String shipNode) {
        this.shipNode = shipNode;
    }

    @JacksonXmlProperty(localName = "Extn")
    private Extn extn;

    // Getters and Setters
    // ...

    public static class Extn {
        @JacksonXmlProperty(localName = "ExtnHostOrderNo", isAttribute = true)
        private String extnHostOrderNo;

        // Getters and Setters
        // ...

        public String getExtnHostOrderNo() {
            return extnHostOrderNo;
        }

        public void setExtnHostOrderNo(String extnHostOrderNo) {
            this.extnHostOrderNo = extnHostOrderNo;
        }
    }

    public Extn getExtn() {
        return extn;
    }

    public void setExtn(Extn extn) {
        this.extn = extn;
    }
}
