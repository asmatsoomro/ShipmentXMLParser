package com.appsdeveloperblog.aws.photoapp.users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Shipment")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment {
    @JacksonXmlProperty(localName = "ActualFreightCharge", isAttribute = true)
    private String actualFreightCharge;

    @JacksonXmlProperty(localName = "ActualShipmentDate", isAttribute = true)
    private String actualShipmentDate;

    @JacksonXmlProperty(localName = "CarrierAccountNo", isAttribute = true)
    private String carrierAccountNo;

    @JacksonXmlProperty(localName = "CarrierServiceCode", isAttribute = true)
    private String carrierServiceCode;

    @JacksonXmlProperty(localName = "CarrierType", isAttribute = true)
    private String carrierType;

    @JacksonXmlProperty(localName = "Code", isAttribute = true)
    private String code;

    @JacksonXmlProperty(localName = "CommercialValue", isAttribute = true)
    private String commercialValue;

    @JacksonXmlProperty(localName = "Currency", isAttribute = true)
    private String currency;

    @JacksonXmlProperty(localName = "DeliveryCode", isAttribute = true)
    private String deliveryCode;

    @JacksonXmlProperty(localName = "DeliveryTS", isAttribute = true)
    private String deliveryTS;

    @JacksonXmlProperty(localName = "DestinationZone", isAttribute = true)
    private String destinationZone;

    @JacksonXmlProperty(localName = "DocumentType", isAttribute = true)
    private String documentType;

    @JacksonXmlProperty(localName = "DownLoadCount", isAttribute = true)
    private String downLoadCount;

    @JacksonXmlProperty(localName = "EnterpriseCode", isAttribute = true)
    private String enterpriseCode;

    @JacksonXmlProperty(localName = "ExpectedDeliveryDate", isAttribute = true)
    private String expectedDeliveryDate;

    @JacksonXmlProperty(localName = "ExpectedShipmentDate", isAttribute = true)
    private String expectedShipmentDate;

    @JacksonXmlProperty(localName = "ExportTaxpayerID", isAttribute = true)
    private String exportTaxpayerID;

    @JacksonXmlProperty(localName = "FreightTerms", isAttribute = true)
    private String freightTerms;

    @JacksonXmlProperty(localName = "FromAddressKey", isAttribute = true)
    private String fromAddressKey;

    @JacksonXmlProperty(localName = "FromAppointment", isAttribute = true)
    private String fromAppointment;

    @JacksonXmlProperty(localName = "HasOtherShipments", isAttribute = true)
    private String hasOtherShipments;

    @JacksonXmlProperty(localName = "HazardousMaterialFlag", isAttribute = true)
    private String hazardousMaterialFlag;

    @JacksonXmlProperty(localName = "ITDate", isAttribute = true)
    private String itDate;

    @JacksonXmlProperty(localName = "NextAlertTs", isAttribute = true)
    private String nextAlertTs;

    @JacksonXmlProperty(localName = "NumOfCartons", isAttribute = true)
    private String numOfCartons;

    @JacksonXmlProperty(localName = "NumOfPallets", isAttribute = true)
    private String numOfPallets;

    @JacksonXmlProperty(localName = "OrderAvailableOnSystem", isAttribute = true)
    private String orderAvailableOnSystem;

    @JacksonXmlProperty(localName = "OriginZone", isAttribute = true)
    private String originZone;

    @JacksonXmlProperty(localName = "PackListType", isAttribute = true)
    private String packList;

    @JacksonXmlProperty(localName = "PipelineKey", isAttribute = true)
    private String pipelineKey;

    @JacksonXmlProperty(localName = "SCAC", isAttribute = true)
    private String scac;

    @JacksonXmlProperty(localName = "SellerOrganizationCode", isAttribute = true)
    private String sellerOrganizationCode;

    @JacksonXmlProperty(localName = "ShipDate", isAttribute = true)
    private String shipDate;

    @JacksonXmlProperty(localName = "ShipMode", isAttribute = true)
    private String shipMode;

    @JacksonXmlProperty(localName = "ShipNode", isAttribute = true)
    private String shipNode;

    @JacksonXmlProperty(localName = "ShipVia", isAttribute = true)
    private String shipVia;

    @JacksonXmlProperty(localName = "ShipmentClosedFlag", isAttribute = true)
    private String shipmentClosedFlag;

    @JacksonXmlProperty(localName = "ShipmentConfirmUpdatesDone", isAttribute = true)
    private String shipmentConfirmUpdatesDone;

    @JacksonXmlProperty(localName = "ShipmentContainerizedFlag", isAttribute = true)
    private String shipmentContainerizedFlag;

    @JacksonXmlProperty(localName = "ShipmentDeliverUpdatesDone", isAttribute = true)
    private String shipmentDeliverUpdatesDone;

    @JacksonXmlProperty(localName = "ShipmentKey", isAttribute = true)
    private String shipmentKey;

    @JacksonXmlProperty(localName = "ShipmentNo", isAttribute = true)
    private String shipmentNo;

    @JacksonXmlProperty(localName = "ShipmentPlannedFlag", isAttribute = true)
    private String shipmentPlannedFlag;

    @JacksonXmlProperty(localName = "ShipmentType", isAttribute = true)
    private String shipmentType;

    @JacksonXmlProperty(localName = "StationId", isAttribute = true)
    private String stationId;

    @JacksonXmlProperty(localName = "StationType", isAttribute = true)
    private String stationType;

    @JacksonXmlProperty(localName = "Status", isAttribute = true)
    private String status;

    @JacksonXmlProperty(localName = "StatusDate", isAttribute = true)
    private String statusDate;

    @JacksonXmlProperty(localName = "ToAddressKey", isAttribute = true)
    private String toAddressKey;

    @JacksonXmlProperty(localName = "ToAppointment", isAttribute = true)
    private String toAppointment;

    @JacksonXmlProperty(localName = "TotalActualCharge", isAttribute = true)
    private String totalActualCharge;

    @JacksonXmlProperty(localName = "TotalEstimatedCharge", isAttribute = true)
    private String totalEstimatedCharge;

    @JacksonXmlProperty(localName = "TotalVolume", isAttribute = true)
    private String totalVolume;

    @JacksonXmlProperty(localName = "TotalVolumeUOM", isAttribute = true)
    private String totalVolumeUOM;

    @JacksonXmlProperty(localName = "TotalWeight", isAttribute = true)
    private String totalWeight;

    @JacksonXmlProperty(localName = "TotalWeightUOM", isAttribute = true)
    private String totalWeightUOM;

    @JacksonXmlProperty(localName = "ToAddress")
    private ToAddress toAddress;

    @JacksonXmlProperty(localName = "FromAddress")
    private FromAddress fromAddress;

    @JacksonXmlProperty(localName = "ShipmentLines")
    private ShipmentLines shipmentLines;

    @JacksonXmlProperty(localName = "Containers")
    private Containers containers;

    public Containers getContainers() {
        return containers;
    }

    public void setContainers(Containers containers) {
        this.containers = containers;
    }

    public ShipmentCharges getShipmentCharges() {
        return shipmentCharges;
    }

    public void setShipmentCharges(ShipmentCharges shipmentCharges) {
        this.shipmentCharges = shipmentCharges;
    }

    @JacksonXmlProperty(localName = "ShipmentCharges")
    private ShipmentCharges shipmentCharges;

    // Getters and Setters

    public String getActualFreightCharge() {
        return actualFreightCharge;
    }

    public void setActualFreightCharge(String actualFreightCharge) {
        this.actualFreightCharge = actualFreightCharge;
    }

    public String getActualShipmentDate() {
        return actualShipmentDate;
    }

    public void setActualShipmentDate(String actualShipmentDate) {
        this.actualShipmentDate = actualShipmentDate;
    }

    public String getCarrierAccountNo() {
        return carrierAccountNo;
    }

    public void setCarrierAccountNo(String carrierAccountNo) {
        this.carrierAccountNo = carrierAccountNo;
    }

    public String getCarrierServiceCode() {
        return carrierServiceCode;
    }

    public void setCarrierServiceCode(String carrierServiceCode) {
        this.carrierServiceCode = carrierServiceCode;
    }

    public String getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCommercialValue() {
        return commercialValue;
    }

    public void setCommercialValue(String commercialValue) {
        this.commercialValue = commercialValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getDeliveryTS() {
        return deliveryTS;
    }

    public void setDeliveryTS(String deliveryTS) {
        this.deliveryTS = deliveryTS;
    }

    public String getDestinationZone() {
        return destinationZone;
    }

    public void setDestinationZone(String destinationZone) {
        this.destinationZone = destinationZone;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDownLoadCount() {
        return downLoadCount;
    }

    public void setDownLoadCount(String downLoadCount) {
        this.downLoadCount = downLoadCount;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getExpectedShipmentDate() {
        return expectedShipmentDate;
    }

    public void setExpectedShipmentDate(String expectedShipmentDate) {
        this.expectedShipmentDate = expectedShipmentDate;
    }

    public String getExportTaxpayerID() {
        return exportTaxpayerID;
    }

    public void setExportTaxpayerID(String exportTaxpayerID) {
        this.exportTaxpayerID = exportTaxpayerID;
    }

    public String getFreightTerms() {
        return freightTerms;
    }

    public void setFreightTerms(String freightTerms) {
        this.freightTerms = freightTerms;
    }

    public String getFromAddressKey() {
        return fromAddressKey;
    }

    public void setFromAddressKey(String fromAddressKey) {
        this.fromAddressKey = fromAddressKey;
    }

    public String getFromAppointment() {
        return fromAppointment;
    }

    public void setFromAppointment(String fromAppointment) {
        this.fromAppointment = fromAppointment;
    }

    public String getHasOtherShipments() {
        return hasOtherShipments;
    }

    public void setHasOtherShipments(String hasOtherShipments) {
        this.hasOtherShipments = hasOtherShipments;
    }

    public String getHazardousMaterialFlag() {
        return hazardousMaterialFlag;
    }

    public void setHazardousMaterialFlag(String hazardousMaterialFlag) {
        this.hazardousMaterialFlag = hazardousMaterialFlag;
    }

    public String getItDate() {
        return itDate;
    }

    public void setItDate(String itDate) {
        this.itDate = itDate;
    }

    public String getNextAlertTs() {
        return nextAlertTs;
    }

    public void setNextAlertTs(String nextAlertTs) {
        this.nextAlertTs = nextAlertTs;
    }

    public String getNumOfCartons() {
        return numOfCartons;
    }

    public void setNumOfCartons(String numOfCartons) {
        this.numOfCartons = numOfCartons;
    }

    public String getNumOfPallets() {
        return numOfPallets;
    }

    public void setNumOfPallets(String numOfPallets) {
        this.numOfPallets = numOfPallets;
    }

    public String getOrderAvailableOnSystem() {
        return orderAvailableOnSystem;
    }

    public void setOrderAvailableOnSystem(String orderAvailableOnSystem) {
        this.orderAvailableOnSystem = orderAvailableOnSystem;
    }

    public String getOriginZone() {
        return originZone;
    }

    public void setOriginZone(String originZone) {
        this.originZone = originZone;
    }

    public String getPackList() {
        return packList;
    }

    public void setPackList(String packList) {
        this.packList = packList;
    }

    public String getPipelineKey() {
        return pipelineKey;
    }

    public void setPipelineKey(String pipelineKey) {
        this.pipelineKey = pipelineKey;
    }

    public String getScac() {
        return scac;
    }

    public void setScac(String scac) {
        this.scac = scac;
    }

    public String getSellerOrganizationCode() {
        return sellerOrganizationCode;
    }

    public void setSellerOrganizationCode(String sellerOrganizationCode) {
        this.sellerOrganizationCode = sellerOrganizationCode;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getShipMode() {
        return shipMode;
    }

    public void setShipMode(String shipMode) {
        this.shipMode = shipMode;
    }

    public String getShipNode() {
        return shipNode;
    }

    public void setShipNode(String shipNode) {
        this.shipNode = shipNode;
    }

    public String getShipVia() {
        return shipVia;
    }

    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }

    public String getShipmentClosedFlag() {
        return shipmentClosedFlag;
    }

    public void setShipmentClosedFlag(String shipmentClosedFlag) {
        this.shipmentClosedFlag = shipmentClosedFlag;
    }

    public String getShipmentConfirmUpdatesDone() {
        return shipmentConfirmUpdatesDone;
    }

    public void setShipmentConfirmUpdatesDone(String shipmentConfirmUpdatesDone) {
        this.shipmentConfirmUpdatesDone = shipmentConfirmUpdatesDone;
    }

    public String getShipmentContainerizedFlag() {
        return shipmentContainerizedFlag;
    }

    public void setShipmentContainerizedFlag(String shipmentContainerizedFlag) {
        this.shipmentContainerizedFlag = shipmentContainerizedFlag;
    }

    public String getShipmentDeliverUpdatesDone() {
        return shipmentDeliverUpdatesDone;
    }

    public void setShipmentDeliverUpdatesDone(String shipmentDeliverUpdatesDone) {
        this.shipmentDeliverUpdatesDone = shipmentDeliverUpdatesDone;
    }

    public String getShipmentKey() {
        return shipmentKey;
    }

    public void setShipmentKey(String shipmentKey) {
        this.shipmentKey = shipmentKey;
    }

    public String getShipmentNo() {
        return shipmentNo;
    }

    public void setShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo;
    }

    public String getShipmentPlannedFlag() {
        return shipmentPlannedFlag;
    }

    public void setShipmentPlannedFlag(String shipmentPlannedFlag) {
        this.shipmentPlannedFlag = shipmentPlannedFlag;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getToAddressKey() {
        return toAddressKey;
    }

    public void setToAddressKey(String toAddressKey) {
        this.toAddressKey = toAddressKey;
    }

    public String getToAppointment() {
        return toAppointment;
    }

    public void setToAppointment(String toAppointment) {
        this.toAppointment = toAppointment;
    }

    public String getTotalActualCharge() {
        return totalActualCharge;
    }

    public void setTotalActualCharge(String totalActualCharge) {
        this.totalActualCharge = totalActualCharge;
    }

    public String getTotalEstimatedCharge() {
        return totalEstimatedCharge;
    }

    public void setTotalEstimatedCharge(String totalEstimatedCharge) {
        this.totalEstimatedCharge = totalEstimatedCharge;
    }

    public String getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }

    public String getTotalVolumeUOM() {
        return totalVolumeUOM;
    }

    public void setTotalVolumeUOM(String totalVolumeUOM) {
        this.totalVolumeUOM = totalVolumeUOM;
    }

    public String getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getTotalWeightUOM() {
        return totalWeightUOM;
    }

    public void setTotalWeightUOM(String totalWeightUOM) {
        this.totalWeightUOM = totalWeightUOM;
    }

    public FromAddress getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(FromAddress fromAddress) {
        this.fromAddress = fromAddress;
    }

    public ShipmentLines getShipmentLines() {
        return shipmentLines;
    }

    public void setShipmentLines(ShipmentLines shipmentLines) {
        this.shipmentLines = shipmentLines;
    }



    public ToAddress getToAddress() {
        return toAddress;
    }

    public void setToAddress(ToAddress toAddress) {
        this.toAddress = toAddress;
    }


    public static class Containers {
        // Dummy property or field
        private String dummy;

        public String getDummy() {
            return dummy;
        }

        public void setDummy(String dummy) {
            this.dummy = dummy;
        }

    }

    public static class ShipmentCharges {
        // Dummy property or field
        private String dummy;

        public String getDummy() {
            return dummy;
        }

        public void setDummy(String dummy) {
            this.dummy = dummy;
        }

    }

}
