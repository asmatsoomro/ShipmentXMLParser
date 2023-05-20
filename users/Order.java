package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Order {

    @JacksonXmlProperty(localName = "ActualPricingDate")
    private String actualPricingDate;

    @JacksonXmlProperty(localName = "AdjustmentInvoicePending")
    private String adjustmentInvoicePending;

    @JacksonXmlProperty(localName = "AllAddressesVerified")
    private String allAddressesVerified;

    @JacksonXmlProperty(localName = "AuthorizationExpirationDate")
    private String authorizationExpirationDate;

    @JacksonXmlProperty(localName = "BillToID")
    private String billToID;

    @JacksonXmlProperty(localName = "BillToKey")
    private String billToKey;

    @JacksonXmlProperty(localName = "CarrierAccountNo")
    private String carrierAccountNo;

    @JacksonXmlProperty(localName = "CarrierServiceCode")
    private String carrierServiceCode;

    @JacksonXmlProperty(localName = "ChainType")
    private String chainType;

    @JacksonXmlProperty(localName = "ChargeActualFreightFlag")
    private String chargeActualFreightFlag;

    @JacksonXmlProperty(localName = "ComplimentaryGiftBoxQty")
    private int complimentaryGiftBoxQty;

    @JacksonXmlProperty(localName = "CreatedAtNode")
    private String createdAtNode;

    @JacksonXmlProperty(localName = "Createprogid")
    private String createProgId;

    @JacksonXmlProperty(localName = "Createts")
    private String createTs;

    @JacksonXmlProperty(localName = "Createuserid")
    private String createUserId;

    @JacksonXmlProperty(localName = "CustCustPONo")
    private String custCustPONo;

    @JacksonXmlProperty(localName = "CustomerAge")
    private double customerAge;

    @JacksonXmlProperty(localName = "CustomerEMailID")
    private String customerEmailId;

    @JacksonXmlProperty(localName = "CustomerFirstName")
    private String customerFirstName;

    @JacksonXmlProperty(localName = "CustomerLastName")
    private String customerLastName;

    @JacksonXmlProperty(localName = "CustomerPONo")
    private String customerPONo;

    @JacksonXmlProperty(localName = "CustomerPhoneNo")
    private String customerPhoneNo;

    @JacksonXmlProperty(localName = "CustomerZipCode")
    private String customerZipCode;

    @JacksonXmlProperty(localName = "DeliveryCode")
    private String deliveryCode;

    @JacksonXmlProperty(localName = "Division")
    private String division;

    @JacksonXmlProperty(localName = "DoNotConsolidate")
    private String doNotConsolidate;

    @JacksonXmlProperty(localName = "DocumentType")
    private String documentType;

    @JacksonXmlProperty(localName = "DraftOrderFlag")
    private String draftOrderFlag;

    @JacksonXmlProperty(localName = "EnterpriseCode")
    private String enterpriseCode;

    @JacksonXmlProperty(localName = "EntryType")
    private String entryType;

    @JacksonXmlProperty(localName = "FreightTerms")
    private String freightTerms;

    @JacksonXmlProperty(localName = "HasDerivedChild")
    private String hasDerivedChild;

    @JacksonXmlProperty(localName = "HasDerivedParent")
    private String hasDerivedParent;

    @JacksonXmlProperty(localName = "HoldFlag")
    private String holdFlag;

    @JacksonXmlProperty(localName = "HoldReasonCode")
    private String holdReasonCode;

    @JacksonXmlProperty(localName = "InternalApp")
    private String internalApp;

    @JacksonXmlProperty(localName = "InvoiceComplete")
    private String invoiceComplete;

    @JacksonXmlProperty(localName = "Lockid")
    private String lockId;

    @JacksonXmlProperty(localName = "Modifyprogid")
    private String modifyProgId;

    @JacksonXmlProperty(localName = "Modifyts")
    private String modifyTs;

    @JacksonXmlProperty(localName = "Modifyuserid")
    private String modifyUserId;

    @JacksonXmlProperty(localName = "NextAlertTs")
    private String nextAlertTs;

    @JacksonXmlProperty(localName = "NoOfAuthStrikes")
    private int noOfAuthStrikes;

    @JacksonXmlProperty(localName = "NotifyAfterShipmentFlag")
    private String notifyAfterShipmentFlag;

    @JacksonXmlProperty(localName = "OrderComplete")
    private String orderComplete;

    @JacksonXmlProperty(localName = "OrderDate")
    private String orderDate;

    @JacksonXmlProperty(localName = "OrderHeaderKey")
    private String orderHeaderKey;

    @JacksonXmlProperty(localName = "OrderName")
    private String orderName;

    @JacksonXmlProperty(localName = "OrderNo")
    private String orderNo;

    @JacksonXmlProperty(localName = "OrderType")
    private String orderType;

    @JacksonXmlProperty(localName = "OriginalTax")
    private double originalTax;

    @JacksonXmlProperty(localName = "OriginalTotalAmount")
    private double originalTotalAmount;

    @JacksonXmlProperty(localName = "OtherCharges")
    private double otherCharges;

    @JacksonXmlProperty(localName = "Override")
    private String override;

    @JacksonXmlProperty(localName = "PaymentStatus")
    private String paymentStatus;

    @JacksonXmlProperty(localName = "PendingTransferIn")
    private double pendingTransferIn;

    @JacksonXmlProperty(localName = "PersonalizeCode")
    private String personalizeCode;

    @JacksonXmlProperty(localName = "PriceOrder")
    private String priceOrder;

    @JacksonXmlProperty(localName = "PriceProgramName")
    private String priceProgramName;

    @JacksonXmlProperty(localName = "PriorityCode")
    private String priorityCode;

    @JacksonXmlProperty(localName = "PriorityNumber")
    private int priorityNumber;

    @JacksonXmlProperty(localName = "PropagateCancellations")
    private String propagateCancellations;

    @JacksonXmlProperty(localName = "Purpose")
    private String purpose;

    @JacksonXmlProperty(localName = "ReserveInventoryFlag")
    private String reserveInventoryFlag;

    @JacksonXmlProperty(localName = "ReturnByGiftRecipient")
    private String returnByGiftRecipient;

    @JacksonXmlProperty(localName = "SCAC")
    private String scac;

    @JacksonXmlProperty(localName = "SaleVoided")
    private String saleVoided;

    @JacksonXmlProperty(localName = "SearchCriteria1")
    private String searchCriteria1;

    @JacksonXmlProperty(localName = "SearchCriteria2")
    private String searchCriteria2;

    @JacksonXmlProperty(localName = "SellerOrganizationCode")
    private String sellerOrganizationCode;

    @JacksonXmlProperty(localName = "ShipToID")
    private String shipToID;

    @JacksonXmlProperty(localName = "ShipToKey")
    private String shipToKey;

    @JacksonXmlProperty(localName = "SourceIPAddress")
    private String sourceIPAddress;

    @JacksonXmlProperty(localName = "TaxExemptFlag")
    private String taxExemptFlag;

    @JacksonXmlProperty(localName = "TaxExemptionCertificate")
    private String taxExemptionCertificate;

    @JacksonXmlProperty(localName = "TaxJurisdiction")
    private String taxJurisdiction;

    @JacksonXmlProperty(localName= "TaxPayerId")
    private String taxPayerId;

    @JacksonXmlProperty(localName = "TermsCode")
    private String termsCode;

    @JacksonXmlProperty(localName = "TotalAdjustmentAmount")
    private double totalAdjustmentAmount;

    @JacksonXmlProperty(localName = "Extn")
    private Extn extn;

    @JacksonXmlProperty(localName ="PaymentMethods")
    private PaymentMethods paymentMethods;

    public Extn getExtn() {
        return extn;
    }

    public void setExtn(Extn extn) {
        this.extn = extn;
    }

    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public OrderLineRelationships getOrderLineRelationships() {
        return orderLineRelationships;
    }

    public void setOrderLineRelationships(OrderLineRelationships orderLineRelationships) {
        this.orderLineRelationships = orderLineRelationships;
    }

    @JacksonXmlProperty(localName ="OrderLineRelationships")
    private OrderLineRelationships orderLineRelationships;

    public String getActualPricingDate() {
        return actualPricingDate;
    }

    public void setActualPricingDate(String actualPricingDate) {
        this.actualPricingDate = actualPricingDate;
    }

    public String getAdjustmentInvoicePending() {
        return adjustmentInvoicePending;
    }

    public void setAdjustmentInvoicePending(String adjustmentInvoicePending) {
        this.adjustmentInvoicePending = adjustmentInvoicePending;
    }

    public String getAllAddressesVerified() {
        return allAddressesVerified;
    }

    public void setAllAddressesVerified(String allAddressesVerified) {
        this.allAddressesVerified = allAddressesVerified;
    }

    public String getAuthorizationExpirationDate() {
        return authorizationExpirationDate;
    }

    public void setAuthorizationExpirationDate(String authorizationExpirationDate) {
        this.authorizationExpirationDate = authorizationExpirationDate;
    }

    public String getBillToID() {
        return billToID;
    }

    public void setBillToID(String billToID) {
        this.billToID = billToID;
    }

    public String getBillToKey() {
        return billToKey;
    }

    public void setBillToKey(String billToKey) {
        this.billToKey = billToKey;
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

    public String getChainType() {
        return chainType;
    }

    public void setChainType(String chainType) {
        this.chainType = chainType;
    }

    public String getChargeActualFreightFlag() {
        return chargeActualFreightFlag;
    }

    public void setChargeActualFreightFlag(String chargeActualFreightFlag) {
        this.chargeActualFreightFlag = chargeActualFreightFlag;
    }

    public int getComplimentaryGiftBoxQty() {
        return complimentaryGiftBoxQty;
    }

    public void setComplimentaryGiftBoxQty(int complimentaryGiftBoxQty) {
        this.complimentaryGiftBoxQty = complimentaryGiftBoxQty;
    }

    public String getCreatedAtNode() {
        return createdAtNode;
    }

    public void setCreatedAtNode(String createdAtNode) {
        this.createdAtNode = createdAtNode;
    }

    public String getCreateProgId() {
        return createProgId;
    }

    public void setCreateProgId(String createProgId) {
        this.createProgId = createProgId;
    }

    public String getCreateTs() {
        return createTs;
    }

    public void setCreateTs(String createTs) {
        this.createTs = createTs;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCustCustPONo() {
        return custCustPONo;
    }

    public void setCustCustPONo(String custCustPONo) {
        this.custCustPONo = custCustPONo;
    }

    public double getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(double customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerPONo() {
        return customerPONo;
    }

    public void setCustomerPONo(String customerPONo) {
        this.customerPONo = customerPONo;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerZipCode() {
        return customerZipCode;
    }

    public void setCustomerZipCode(String customerZipCode) {
        this.customerZipCode = customerZipCode;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDoNotConsolidate() {
        return doNotConsolidate;
    }

    public void setDoNotConsolidate(String doNotConsolidate) {
        this.doNotConsolidate = doNotConsolidate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDraftOrderFlag() {
        return draftOrderFlag;
    }

    public void setDraftOrderFlag(String draftOrderFlag) {
        this.draftOrderFlag = draftOrderFlag;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getFreightTerms() {
        return freightTerms;
    }

    public void setFreightTerms(String freightTerms) {
        this.freightTerms = freightTerms;
    }

    public String getHasDerivedChild() {
        return hasDerivedChild;
    }

    public void setHasDerivedChild(String hasDerivedChild) {
        this.hasDerivedChild = hasDerivedChild;
    }

    public String getHasDerivedParent() {
        return hasDerivedParent;
    }

    public void setHasDerivedParent(String hasDerivedParent) {
        this.hasDerivedParent = hasDerivedParent;
    }

    public String getHoldFlag() {
        return holdFlag;
    }

    public void setHoldFlag(String holdFlag) {
        this.holdFlag = holdFlag;
    }

    public String getHoldReasonCode() {
        return holdReasonCode;
    }

    public void setHoldReasonCode(String holdReasonCode) {
        this.holdReasonCode = holdReasonCode;
    }

    public String getInternalApp() {
        return internalApp;
    }

    public void setInternalApp(String internalApp) {
        this.internalApp = internalApp;
    }

    public String getInvoiceComplete() {
        return invoiceComplete;
    }

    public void setInvoiceComplete(String invoiceComplete) {
        this.invoiceComplete = invoiceComplete;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getModifyProgId() {
        return modifyProgId;
    }

    public void setModifyProgId(String modifyProgId) {
        this.modifyProgId = modifyProgId;
    }

    public String getModifyTs() {
        return modifyTs;
    }

    public void setModifyTs(String modifyTs) {
        this.modifyTs = modifyTs;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getNextAlertTs() {
        return nextAlertTs;
    }

    public void setNextAlertTs(String nextAlertTs) {
        this.nextAlertTs = nextAlertTs;
    }

    public int getNoOfAuthStrikes() {
        return noOfAuthStrikes;
    }

    public void setNoOfAuthStrikes(int noOfAuthStrikes) {
        this.noOfAuthStrikes = noOfAuthStrikes;
    }

    public String getNotifyAfterShipmentFlag() {
        return notifyAfterShipmentFlag;
    }

    public void setNotifyAfterShipmentFlag(String notifyAfterShipmentFlag) {
        this.notifyAfterShipmentFlag = notifyAfterShipmentFlag;
    }

    public String getOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(String orderComplete) {
        this.orderComplete = orderComplete;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderHeaderKey() {
        return orderHeaderKey;
    }

    public void setOrderHeaderKey(String orderHeaderKey) {
        this.orderHeaderKey = orderHeaderKey;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public double getOriginalTax() {
        return originalTax;
    }

    public void setOriginalTax(double originalTax) {
        this.originalTax = originalTax;
    }

    public double getOriginalTotalAmount() {
        return originalTotalAmount;
    }

    public void setOriginalTotalAmount(double originalTotalAmount) {
        this.originalTotalAmount = originalTotalAmount;
    }

    public double getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public String getOverride() {
        return override;
    }

    public void setOverride(String override) {
        this.override = override;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getPendingTransferIn() {
        return pendingTransferIn;
    }

    public void setPendingTransferIn(double pendingTransferIn) {
        this.pendingTransferIn = pendingTransferIn;
    }

    public String getPersonalizeCode() {
        return personalizeCode;
    }

    public void setPersonalizeCode(String personalizeCode) {
        this.personalizeCode = personalizeCode;
    }

    public String getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(String priceOrder) {
        this.priceOrder = priceOrder;
    }

    public String getPriceProgramName() {
        return priceProgramName;
    }

    public void setPriceProgramName(String priceProgramName) {
        this.priceProgramName = priceProgramName;
    }

    public String getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public String getPropagateCancellations() {
        return propagateCancellations;
    }

    public void setPropagateCancellations(String propagateCancellations) {
        this.propagateCancellations = propagateCancellations;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getReserveInventoryFlag() {
        return reserveInventoryFlag;
    }

    public void setReserveInventoryFlag(String reserveInventoryFlag) {
        this.reserveInventoryFlag = reserveInventoryFlag;
    }

    public String getReturnByGiftRecipient() {
        return returnByGiftRecipient;
    }

    public void setReturnByGiftRecipient(String returnByGiftRecipient) {
        this.returnByGiftRecipient = returnByGiftRecipient;
    }

    public String getScac() {
        return scac;
    }

    public void setScac(String scac) {
        this.scac = scac;
    }

    public String getSaleVoided() {
        return saleVoided;
    }

    public void setSaleVoided(String saleVoided) {
        this.saleVoided = saleVoided;
    }

    public String getSearchCriteria1() {
        return searchCriteria1;
    }

    public void setSearchCriteria1(String searchCriteria1) {
        this.searchCriteria1 = searchCriteria1;
    }

    public String getSearchCriteria2() {
        return searchCriteria2;
    }

    public void setSearchCriteria2(String searchCriteria2) {
        this.searchCriteria2 = searchCriteria2;
    }

    public String getSellerOrganizationCode() {
        return sellerOrganizationCode;
    }

    public void setSellerOrganizationCode(String sellerOrganizationCode) {
        this.sellerOrganizationCode = sellerOrganizationCode;
    }

    public String getShipToID() {
        return shipToID;
    }

    public void setShipToID(String shipToID) {
        this.shipToID = shipToID;
    }

    public String getShipToKey() {
        return shipToKey;
    }

    public void setShipToKey(String shipToKey) {
        this.shipToKey = shipToKey;
    }

    public String getSourceIPAddress() {
        return sourceIPAddress;
    }

    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }

    public String getTaxExemptFlag() {
        return taxExemptFlag;
    }

    public void setTaxExemptFlag(String taxExemptFlag) {
        this.taxExemptFlag = taxExemptFlag;
    }

    public String getTaxExemptionCertificate() {
        return taxExemptionCertificate;
    }

    public void setTaxExemptionCertificate(String taxExemptionCertificate) {
        this.taxExemptionCertificate = taxExemptionCertificate;
    }

    public String getTaxJurisdiction() {
        return taxJurisdiction;
    }

    public void setTaxJurisdiction(String taxJurisdiction) {
        this.taxJurisdiction = taxJurisdiction;
    }

    public String getTaxPayerId() {
        return taxPayerId;
    }

    public void setTaxPayerId(String taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    public String getTermsCode() {
        return termsCode;
    }

    public void setTermsCode(String termsCode) {
        this.termsCode = termsCode;
    }

    public double getTotalAdjustmentAmount() {
        return totalAdjustmentAmount;
    }

    public void setTotalAdjustmentAmount(double totalAdjustmentAmount) {
        this.totalAdjustmentAmount = totalAdjustmentAmount;
    }

    public String getIsHistory() {
        return isHistory;
    }

    public void setIsHistory(String isHistory) {
        this.isHistory = isHistory;
    }

    @JacksonXmlProperty(localName = "isHistory")
    private String isHistory;

// Getters and Setters
// ...



    public PersonInfoBillTo getPersonInfoBillTo() {
        return personInfoBillTo;
    }

    public void setPersonInfoBillTo(PersonInfoBillTo personInfoBillTo) {
        this.personInfoBillTo = personInfoBillTo;
    }

    @JacksonXmlProperty(localName = "PersonInfoBillTo")
    private PersonInfoBillTo personInfoBillTo;

    public PersonInfoShipTo getPersonInfoShipTo() {
        return personInfoShipTo;
    }

    public void setPersonInfoShipTo(PersonInfoShipTo personInfoShipTo) {
        this.personInfoShipTo = personInfoShipTo;
    }

    @JacksonXmlProperty(localName = "PersonInfoShipTo")
    private PersonInfoShipTo personInfoShipTo;

    public PersonInfoMarkFor getPersonInfoMarkFor() {
        return personInfoMarkFor;
    }

    public void setPersonInfoMarkFor(PersonInfoMarkFor personInfoMarkFor) {
        this.personInfoMarkFor = personInfoMarkFor;
    }

    @JacksonXmlProperty(localName = "PersonInfoMarkFor")
    private PersonInfoMarkFor personInfoMarkFor;


    public static class Extn {

        private String dummy;

        public String getDummy() {
            return dummy;
        }

        public void setDummy(String dummy) {
            this.dummy = dummy;
        }
    }

    public static class PaymentMethods {

        // Dummy property or field
        private String dummy;

        public String getDummy() {
            return dummy;
        }

        public void setDummy(String dummy) {
            this.dummy = dummy;
        }

    }

    public static class OrderLineRelationships {
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
