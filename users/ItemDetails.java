package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ItemDetails {
    @JacksonXmlProperty(localName = "CanUseAsServiceTool", isAttribute = true)
    private String canUseAsServiceTool;

    @JacksonXmlProperty(localName = "Createprogid", isAttribute = true)
    private String createprogid;

    @JacksonXmlProperty(localName = "Createts", isAttribute = true)
    private String createts;

    @JacksonXmlProperty(localName = "Createuserid", isAttribute = true)
    private String createuserid;

    @JacksonXmlProperty(localName = "DisplayItemId", isAttribute = true)
    private String displayItemId;

    @JacksonXmlProperty(localName = "GlobalItemID", isAttribute = true)
    private String globalItemID;

    @JacksonXmlProperty(localName = "InheritAttributesFromClassification", isAttribute = true)
    private String inheritAttributesFromClassification;

    @JacksonXmlProperty(localName = "IsShippingCntr", isAttribute = true)
    private String isShippingCntr;

    @JacksonXmlProperty(localName = "ItemGroupCode", isAttribute = true)
    private String itemGroupCode;

    @JacksonXmlProperty(localName = "ItemID", isAttribute = true)
    private String itemID;

    @JacksonXmlProperty(localName = "ItemKey", isAttribute = true)
    private String itemKey;

    @JacksonXmlProperty(localName = "Lockid", isAttribute = true)
    private String lockid;

    @JacksonXmlProperty(localName = "MaxModifyTS", isAttribute = true)
    private String maxModifyTS;

    @JacksonXmlProperty(localName = "Modifyprogid", isAttribute = true)
    private String modifyprogid;

    @JacksonXmlProperty(localName = "Modifyts", isAttribute = true)
    private String modifyts;

    @JacksonXmlProperty(localName = "Modifyuserid", isAttribute = true)
    private String modifyuserid;

    @JacksonXmlProperty(localName = "OrganizationCode", isAttribute = true)
    private String organizationCode;

    public Extn getExtn() {
        return extn;
    }

    public void setExtn(Extn extn) {
        this.extn = extn;
    }

    @JacksonXmlProperty(localName = "Extn")
    private Extn extn;

    @JacksonXmlProperty(localName = "PrimaryInformation")
    private PrimaryInformation primaryInformation;

    public PrimaryInformation getPrimaryInformation() {
        return primaryInformation;
    }

    public void setPrimaryInformation(PrimaryInformation primaryInformation) {
        this.primaryInformation = primaryInformation;
    }




    public static class Extn {
        @JacksonXmlProperty(localName = "ExtnMFRCode", isAttribute = true)
        private String extnMFRCode;

        public String getExtnMFRCode() {
            return extnMFRCode;
        }

        public void setExtnMFRCode(String extnMFRCode) {
            this.extnMFRCode = extnMFRCode;
        }

        public String getExtnMFRPart() {
            return extnMFRPart;
        }

        public void setExtnMFRPart(String extnMFRPart) {
            this.extnMFRPart = extnMFRPart;
        }

        @JacksonXmlProperty(localName = "ExtnMFRPart", isAttribute = true)
        private String extnMFRPart;

        // Getters and Setters
        // ...
    }

    public String getCanUseAsServiceTool() {
        return canUseAsServiceTool;
    }

    public void setCanUseAsServiceTool(String canUseAsServiceTool) {
        this.canUseAsServiceTool = canUseAsServiceTool;
    }

    public String getCreateprogid() {
        return createprogid;
    }

    public void setCreateprogid(String createprogid) {
        this.createprogid = createprogid;
    }

    public String getCreatets() {
        return createts;
    }

    public void setCreatets(String createts) {
        this.createts = createts;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public String getDisplayItemId() {
        return displayItemId;
    }

    public void setDisplayItemId(String displayItemId) {
        this.displayItemId = displayItemId;
    }

    public String getGlobalItemID() {
        return globalItemID;
    }

    public void setGlobalItemID(String globalItemID) {
        this.globalItemID = globalItemID;
    }

    public String getInheritAttributesFromClassification() {
        return inheritAttributesFromClassification;
    }

    public void setInheritAttributesFromClassification(String inheritAttributesFromClassification) {
        this.inheritAttributesFromClassification = inheritAttributesFromClassification;
    }

    public String getIsShippingCntr() {
        return isShippingCntr;
    }

    public void setIsShippingCntr(String isShippingCntr) {
        this.isShippingCntr = isShippingCntr;
    }

    public String getItemGroupCode() {
        return itemGroupCode;
    }

    public void setItemGroupCode(String itemGroupCode) {
        this.itemGroupCode = itemGroupCode;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getLockid() {
        return lockid;
    }

    public void setLockid(String lockid) {
        this.lockid = lockid;
    }

    public String getMaxModifyTS() {
        return maxModifyTS;
    }

    public void setMaxModifyTS(String maxModifyTS) {
        this.maxModifyTS = maxModifyTS;
    }

    public String getModifyprogid() {
        return modifyprogid;
    }

    public void setModifyprogid(String modifyprogid) {
        this.modifyprogid = modifyprogid;
    }

    public String getModifyts() {
        return modifyts;
    }

    public void setModifyts(String modifyts) {
        this.modifyts = modifyts;
    }

    public String getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(String modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @JacksonXmlProperty(localName = "UnitOfMeasure", isAttribute = true)
    private String unitOfMeasure;

    // Getters and Setters
    // ...
}
