package com.appsdeveloperblog.aws.photoapp.users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    @JacksonXmlProperty(localName = "CostCurrency", isAttribute = true)
    private String costCurrency;

    @JacksonXmlProperty(localName = "CountryOfOrigin", isAttribute = true)
    private String countryOfOrigin;

    @JacksonXmlProperty(localName = "CustomerItem", isAttribute = true)
    private String customerItem;

    @JacksonXmlProperty(localName = "CustomerItemDesc", isAttribute = true)
    private String customerItemDesc;

    @JacksonXmlProperty(localName = "ECCNNo", isAttribute = true)
    private String eccnNo;

    @JacksonXmlProperty(localName = "HarmonizedCode", isAttribute = true)
    private String harmonizedCode;

    @JacksonXmlProperty(localName = "ISBN", isAttribute = true)
    private String isbn;

    @JacksonXmlProperty(localName = "ItemDesc", isAttribute = true)
    private String itemDesc;

    @JacksonXmlProperty(localName = "ItemID", isAttribute = true)
    private String itemID;

    @JacksonXmlProperty(localName = "ItemShortDesc", isAttribute = true)
    private String itemShortDesc;

    @JacksonXmlProperty(localName = "ItemWeight", isAttribute = true)
    private String itemWeight;

    @JacksonXmlProperty(localName = "ItemWeightUOM", isAttribute = true)
    private String itemWeightUOM;

    @JacksonXmlProperty(localName = "ManufacturerItem", isAttribute = true)
    private String manufacturerItem;

    @JacksonXmlProperty(localName = "ManufacturerItemDesc", isAttribute = true)
    private String manufacturerItemDesc;

    @JacksonXmlProperty(localName = "ManufacturerName", isAttribute = true)
    private String manufacturerName;

    @JacksonXmlProperty(localName = "NMFCClass", isAttribute = true)
    private String nmfcClass;

    @JacksonXmlProperty(localName = "NMFCCode", isAttribute = true)
    private String nmfcCode;

    @JacksonXmlProperty(localName = "NMFCDescription", isAttribute = true)
    private String nmfcDescription;

    @JacksonXmlProperty(localName = "ProductClass", isAttribute = true)
    private String productClass;

    @JacksonXmlProperty(localName = "ProductLine", isAttribute = true)
    private String productLine;

    @JacksonXmlProperty(localName = "ScheduleBCode", isAttribute = true)
    private String scheduleBCode;

    @JacksonXmlProperty(localName = "SupplierItem", isAttribute = true)
    private String supplierItem;

    @JacksonXmlProperty(localName = "SupplierItemDesc", isAttribute = true)
    private String supplierItemDesc;

    @JacksonXmlProperty(localName = "TaxProductCode", isAttribute = true)
    private String taxProductCode;

    @JacksonXmlProperty(localName = "UPCCode", isAttribute = true)
    private String upcCode;

    @JacksonXmlProperty(localName = "UnitCost", isAttribute = true)
    private String unitCost;

    public String getCostCurrency() {
        return costCurrency;
    }

    public void setCostCurrency(String costCurrency) {
        this.costCurrency = costCurrency;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCustomerItem() {
        return customerItem;
    }

    public void setCustomerItem(String customerItem) {
        this.customerItem = customerItem;
    }

    public String getCustomerItemDesc() {
        return customerItemDesc;
    }

    public void setCustomerItemDesc(String customerItemDesc) {
        this.customerItemDesc = customerItemDesc;
    }

    public String getEccnNo() {
        return eccnNo;
    }

    public void setEccnNo(String eccnNo) {
        this.eccnNo = eccnNo;
    }

    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    public void setHarmonizedCode(String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public String getItemShortDesc() {
        return itemShortDesc;
    }

    public void setItemShortDesc(String itemShortDesc) {
        this.itemShortDesc = itemShortDesc;
    }

    public String getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemWeightUOM() {
        return itemWeightUOM;
    }

    public void setItemWeightUOM(String itemWeightUOM) {
        this.itemWeightUOM = itemWeightUOM;
    }

    public String getManufacturerItem() {
        return manufacturerItem;
    }

    public void setManufacturerItem(String manufacturerItem) {
        this.manufacturerItem = manufacturerItem;
    }

    public String getManufacturerItemDesc() {
        return manufacturerItemDesc;
    }

    public void setManufacturerItemDesc(String manufacturerItemDesc) {
        this.manufacturerItemDesc = manufacturerItemDesc;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getNmfcClass() {
        return nmfcClass;
    }

    public void setNmfcClass(String nmfcClass) {
        this.nmfcClass = nmfcClass;
    }

    public String getNmfcCode() {
        return nmfcCode;
    }

    public void setNmfcCode(String nmfcCode) {
        this.nmfcCode = nmfcCode;
    }

    public String getNmfcDescription() {
        return nmfcDescription;
    }

    public void setNmfcDescription(String nmfcDescription) {
        this.nmfcDescription = nmfcDescription;
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getScheduleBCode() {
        return scheduleBCode;
    }

    public void setScheduleBCode(String scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }

    public String getSupplierItem() {
        return supplierItem;
    }

    public void setSupplierItem(String supplierItem) {
        this.supplierItem = supplierItem;
    }

    public String getSupplierItemDesc() {
        return supplierItemDesc;
    }

    public void setSupplierItemDesc(String supplierItemDesc) {
        this.supplierItemDesc = supplierItemDesc;
    }

    public String getTaxProductCode() {
        return taxProductCode;
    }

    public void setTaxProductCode(String taxProductCode) {
        this.taxProductCode = taxProductCode;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
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
