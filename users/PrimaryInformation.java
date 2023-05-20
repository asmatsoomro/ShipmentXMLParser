package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimaryInformation {
    @JacksonXmlProperty(localName = "AllowGiftWrap", isAttribute = true)
    private String allowGiftWrap;

    @JacksonXmlProperty(localName = "AssumeInfiniteInventory", isAttribute = true)
    private String assumeInfiniteInventory;

    @JacksonXmlProperty(localName = "BundlePricingStrategy", isAttribute = true)
    private String bundlePricingStrategy;

    @JacksonXmlProperty(localName = "CapacityPerOrderedQty", isAttribute = true)
    private String capacityPerOrderedQty;

    @JacksonXmlProperty(localName = "CapacityQuantityStrategy", isAttribute = true)
    private String capacityQuantityStrategy;

    @JacksonXmlProperty(localName = "CapacityUOM", isAttribute = true)
    private String capacityUOM;

    @JacksonXmlProperty(localName = "ComputedUnitCost", isAttribute = true)
    private String computedUnitCost;

    @JacksonXmlProperty(localName = "CostCurrency", isAttribute = true)
    private String costCurrency;

    @JacksonXmlProperty(localName = "CountryOfOrigin", isAttribute = true)
    private String countryOfOrigin;

    @JacksonXmlProperty(localName = "CreditWOReceipt", isAttribute = true)
    private String creditWOReceipt;

    @JacksonXmlProperty(localName = "DefaultProductClass", isAttribute = true)
    private String defaultProductClass;

    @JacksonXmlProperty(localName = "Description", isAttribute = true)
    private String description;

    @JacksonXmlProperty(localName = "ExtendedDescription", isAttribute = true)
    private String extendedDescription;

    @JacksonXmlProperty(localName = "ExtendedDisplayDescription", isAttribute = true)
    private String extendedDisplayDescription;

    @JacksonXmlProperty(localName = "FixedCapacityQtyPerLine", isAttribute = true)
    private String fixedCapacityQtyPerLine;

    @JacksonXmlProperty(localName = "FixedPricingQtyPerLine", isAttribute = true)
    private String fixedPricingQtyPerLine;

    @JacksonXmlProperty(localName = "ImageID", isAttribute = true)
    private String imageID;

    @JacksonXmlProperty(localName = "ImageLocation", isAttribute = true)
    private String imageLocation;

    @JacksonXmlProperty(localName = "InvoiceBasedOnActuals", isAttribute = true)
    private String invoiceBasedOnActuals;

    @JacksonXmlProperty(localName = "InvolvesSegmentChange", isAttribute = true)
    private String involvesSegmentChange;

    @JacksonXmlProperty(localName = "IsAirShippingAllowed", isAttribute = true)
    private String isAirShippingAllowed;

    @JacksonXmlProperty(localName = "IsDeliveryAllowed", isAttribute = true)
    private String isDeliveryAllowed;

    @JacksonXmlProperty(localName = "IsEligibleForShippingDiscount", isAttribute = true)
    private String isEligibleForShippingDiscount;

    @JacksonXmlProperty(localName = "IsFreezerRequired", isAttribute = true)
    private String isFreezerRequired;

    @JacksonXmlProperty(localName = "IsHazmat", isAttribute = true)
    private String isHazmat;

    @JacksonXmlProperty(localName = "IsParcelShippingAllowed", isAttribute = true)
    private String isParcelShippingAllowed;

    @JacksonXmlProperty(localName = "IsPickupAllowed", isAttribute = true)
    private String isPickupAllowed;

    @JacksonXmlProperty(localName = "IsReturnService", isAttribute = true)
    private String isReturnService;
    @JacksonXmlProperty(localName = "IsReturnable", isAttribute = true)
    private String isReturnable;

    @JacksonXmlProperty(localName = "IsShippingAllowed", isAttribute = true)
    private String isShippingAllowed;

    @JacksonXmlProperty(localName = "IsStandaloneService", isAttribute = true)
    private String isStandaloneService;

    @JacksonXmlProperty(localName = "IsSubOnOrderAllowed", isAttribute = true)
    private String isSubOnOrderAllowed;

    @JacksonXmlProperty(localName = "ItemType", isAttribute = true)
    private String itemType;

    @JacksonXmlProperty(localName = "KitCode", isAttribute = true)
    private String kitCode;

    @JacksonXmlProperty(localName = "ManufacturerItem", isAttribute = true)
    private String manufacturerItem;

    @JacksonXmlProperty(localName = "ManufacturerItemDesc", isAttribute = true)
    private String manufacturerItemDesc;

    @JacksonXmlProperty(localName = "ManufacturerName", isAttribute = true)
    private String manufacturerName;

    @JacksonXmlProperty(localName = "MasterCatalogID", isAttribute = true)
    private String masterCatalogID;

    @JacksonXmlProperty(localName = "MaxOrderQuantity", isAttribute = true)
    private String maxOrderQuantity;

    @JacksonXmlProperty(localName = "MaxReturnWindow", isAttribute = true)
    private String maxReturnWindow;

    @JacksonXmlProperty(localName = "MinOrderQuantity", isAttribute = true)
    private String minOrderQuantity;

    @JacksonXmlProperty(localName = "MinimumCapacityQuantity", isAttribute = true)
    private String minimumCapacityQuantity;

    @JacksonXmlProperty(localName = "NumSecondarySerials", isAttribute = true)
    private String numSecondarySerials;

    @JacksonXmlProperty(localName = "OrderingQuantityStrategy", isAttribute = true)
    private String orderingQuantityStrategy;

    @JacksonXmlProperty(localName = "PricingQuantityConvFactor", isAttribute = true)
    private String pricingQuantityConvFactor;

    @JacksonXmlProperty(localName = "PricingQuantityStrategy", isAttribute = true)
    private String pricingQuantityStrategy;

    @JacksonXmlProperty(localName = "PricingUOM", isAttribute = true)
    private String pricingUOM;

    @JacksonXmlProperty(localName = "PricingUOMStrategy", isAttribute = true)
    private String pricingUOMStrategy;

    @JacksonXmlProperty(localName = "PrimaryEnterpriseCode", isAttribute = true)
    private String primaryEnterpriseCode;

    @JacksonXmlProperty(localName = "PrimarySupplier", isAttribute = true)
    private String primarySupplier;

    @JacksonXmlProperty(localName = "ProductLine", isAttribute = true)
    private String productLine;

    @JacksonXmlProperty(localName = "RequiresProdAssociation", isAttribute = true)
    private String requiresProdAssociation;

    @JacksonXmlProperty(localName = "ReturnWindow", isAttribute = true)
    private String returnWindow;

    @JacksonXmlProperty(localName = "RunQuantity", isAttribute = true)
    private String runQuantity;

    @JacksonXmlProperty(localName = "SerializedFlag", isAttribute = true)
    private String serializedFlag;

    @JacksonXmlProperty(localName = "ServiceTypeID", isAttribute = true)
    private String serviceTypeID;

    @JacksonXmlProperty(localName = "ShortDescription", isAttribute = true)
    private String shortDescription;

    @JacksonXmlProperty(localName = "Status", isAttribute = true)
    private String status;

    @JacksonXmlProperty(localName = "TaxableFlag", isAttribute = true)
    private String taxableFlag;

    @JacksonXmlProperty(localName = "UnitCost", isAttribute = true)
    private String unitCost;

    @JacksonXmlProperty(localName = "UnitHeight", isAttribute = true)
    private String unitHeight;

    @JacksonXmlProperty(localName = "UnitHeightUOM", isAttribute = true)
    private String unitHeightUOM;

    @JacksonXmlProperty(localName = "UnitLength", isAttribute = true)
    private String unitLength;

    @JacksonXmlProperty(localName = "UnitLengthUOM", isAttribute = true)
    private String unitLengthUOM;

    @JacksonXmlProperty(localName = "UnitWeight", isAttribute = true)
    private String unitWeight;

    @JacksonXmlProperty(localName = "UnitWeightUOM", isAttribute = true)
    private String unitWeightUOM;

    @JacksonXmlProperty(localName = "UnitWidth", isAttribute = true)
    private String unitWidth;

    @JacksonXmlProperty(localName = "UnitWidthUOM", isAttribute = true)
    private String unitWidthUOM;

    public String getAllowGiftWrap() {
        return allowGiftWrap;
    }

    public void setAllowGiftWrap(String allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    public String getAssumeInfiniteInventory() {
        return assumeInfiniteInventory;
    }

    public void setAssumeInfiniteInventory(String assumeInfiniteInventory) {
        this.assumeInfiniteInventory = assumeInfiniteInventory;
    }

    public String getBundlePricingStrategy() {
        return bundlePricingStrategy;
    }

    public void setBundlePricingStrategy(String bundlePricingStrategy) {
        this.bundlePricingStrategy = bundlePricingStrategy;
    }

    public String getCapacityPerOrderedQty() {
        return capacityPerOrderedQty;
    }

    public void setCapacityPerOrderedQty(String capacityPerOrderedQty) {
        this.capacityPerOrderedQty = capacityPerOrderedQty;
    }

    public String getCapacityQuantityStrategy() {
        return capacityQuantityStrategy;
    }

    public void setCapacityQuantityStrategy(String capacityQuantityStrategy) {
        this.capacityQuantityStrategy = capacityQuantityStrategy;
    }

    public String getCapacityUOM() {
        return capacityUOM;
    }

    public void setCapacityUOM(String capacityUOM) {
        this.capacityUOM = capacityUOM;
    }

    public String getComputedUnitCost() {
        return computedUnitCost;
    }

    public void setComputedUnitCost(String computedUnitCost) {
        this.computedUnitCost = computedUnitCost;
    }

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

    public String getCreditWOReceipt() {
        return creditWOReceipt;
    }

    public void setCreditWOReceipt(String creditWOReceipt) {
        this.creditWOReceipt = creditWOReceipt;
    }

    public String getDefaultProductClass() {
        return defaultProductClass;
    }

    public void setDefaultProductClass(String defaultProductClass) {
        this.defaultProductClass = defaultProductClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

    public String getExtendedDisplayDescription() {
        return extendedDisplayDescription;
    }

    public void setExtendedDisplayDescription(String extendedDisplayDescription) {
        this.extendedDisplayDescription = extendedDisplayDescription;
    }

    public String getFixedCapacityQtyPerLine() {
        return fixedCapacityQtyPerLine;
    }

    public void setFixedCapacityQtyPerLine(String fixedCapacityQtyPerLine) {
        this.fixedCapacityQtyPerLine = fixedCapacityQtyPerLine;
    }

    public String getFixedPricingQtyPerLine() {
        return fixedPricingQtyPerLine;
    }

    public void setFixedPricingQtyPerLine(String fixedPricingQtyPerLine) {
        this.fixedPricingQtyPerLine = fixedPricingQtyPerLine;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getInvoiceBasedOnActuals() {
        return invoiceBasedOnActuals;
    }

    public void setInvoiceBasedOnActuals(String invoiceBasedOnActuals) {
        this.invoiceBasedOnActuals = invoiceBasedOnActuals;
    }

    public String getInvolvesSegmentChange() {
        return involvesSegmentChange;
    }

    public void setInvolvesSegmentChange(String involvesSegmentChange) {
        this.involvesSegmentChange = involvesSegmentChange;
    }

    public String getIsAirShippingAllowed() {
        return isAirShippingAllowed;
    }

    public void setIsAirShippingAllowed(String isAirShippingAllowed) {
        this.isAirShippingAllowed = isAirShippingAllowed;
    }

    public String getIsDeliveryAllowed() {
        return isDeliveryAllowed;
    }

    public void setIsDeliveryAllowed(String isDeliveryAllowed) {
        this.isDeliveryAllowed = isDeliveryAllowed;
    }

    public String getIsEligibleForShippingDiscount() {
        return isEligibleForShippingDiscount;
    }

    public void setIsEligibleForShippingDiscount(String isEligibleForShippingDiscount) {
        this.isEligibleForShippingDiscount = isEligibleForShippingDiscount;
    }

    public String getIsFreezerRequired() {
        return isFreezerRequired;
    }

    public void setIsFreezerRequired(String isFreezerRequired) {
        this.isFreezerRequired = isFreezerRequired;
    }

    public String getIsHazmat() {
        return isHazmat;
    }

    public void setIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
    }

    public String getIsParcelShippingAllowed() {
        return isParcelShippingAllowed;
    }

    public void setIsParcelShippingAllowed(String isParcelShippingAllowed) {
        this.isParcelShippingAllowed = isParcelShippingAllowed;
    }

    public String getIsPickupAllowed() {
        return isPickupAllowed;
    }

    public void setIsPickupAllowed(String isPickupAllowed) {
        this.isPickupAllowed = isPickupAllowed;
    }

    public String getIsReturnService() {
        return isReturnService;
    }

    public void setIsReturnService(String isReturnService) {
        this.isReturnService = isReturnService;
    }

    public String getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(String isReturnable) {
        this.isReturnable = isReturnable;
    }

    public String getIsShippingAllowed() {
        return isShippingAllowed;
    }

    public void setIsShippingAllowed(String isShippingAllowed) {
        this.isShippingAllowed = isShippingAllowed;
    }

    public String getIsStandaloneService() {
        return isStandaloneService;
    }

    public void setIsStandaloneService(String isStandaloneService) {
        this.isStandaloneService = isStandaloneService;
    }

    public String getIsSubOnOrderAllowed() {
        return isSubOnOrderAllowed;
    }

    public void setIsSubOnOrderAllowed(String isSubOnOrderAllowed) {
        this.isSubOnOrderAllowed = isSubOnOrderAllowed;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getKitCode() {
        return kitCode;
    }

    public void setKitCode(String kitCode) {
        this.kitCode = kitCode;
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

    public String getMasterCatalogID() {
        return masterCatalogID;
    }

    public void setMasterCatalogID(String masterCatalogID) {
        this.masterCatalogID = masterCatalogID;
    }

    public String getMaxOrderQuantity() {
        return maxOrderQuantity;
    }

    public void setMaxOrderQuantity(String maxOrderQuantity) {
        this.maxOrderQuantity = maxOrderQuantity;
    }

    public String getMaxReturnWindow() {
        return maxReturnWindow;
    }

    public void setMaxReturnWindow(String maxReturnWindow) {
        this.maxReturnWindow = maxReturnWindow;
    }

    public String getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(String minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public String getMinimumCapacityQuantity() {
        return minimumCapacityQuantity;
    }

    public void setMinimumCapacityQuantity(String minimumCapacityQuantity) {
        this.minimumCapacityQuantity = minimumCapacityQuantity;
    }

    public String getNumSecondarySerials() {
        return numSecondarySerials;
    }

    public void setNumSecondarySerials(String numSecondarySerials) {
        this.numSecondarySerials = numSecondarySerials;
    }

    public String getOrderingQuantityStrategy() {
        return orderingQuantityStrategy;
    }

    public void setOrderingQuantityStrategy(String orderingQuantityStrategy) {
        this.orderingQuantityStrategy = orderingQuantityStrategy;
    }

    public String getPricingQuantityConvFactor() {
        return pricingQuantityConvFactor;
    }

    public void setPricingQuantityConvFactor(String pricingQuantityConvFactor) {
        this.pricingQuantityConvFactor = pricingQuantityConvFactor;
    }

    public String getPricingQuantityStrategy() {
        return pricingQuantityStrategy;
    }

    public void setPricingQuantityStrategy(String pricingQuantityStrategy) {
        this.pricingQuantityStrategy = pricingQuantityStrategy;
    }

    public String getPricingUOM() {
        return pricingUOM;
    }

    public void setPricingUOM(String pricingUOM) {
        this.pricingUOM = pricingUOM;
    }

    public String getPricingUOMStrategy() {
        return pricingUOMStrategy;
    }

    public void setPricingUOMStrategy(String pricingUOMStrategy) {
        this.pricingUOMStrategy = pricingUOMStrategy;
    }

    public String getPrimaryEnterpriseCode() {
        return primaryEnterpriseCode;
    }

    public void setPrimaryEnterpriseCode(String primaryEnterpriseCode) {
        this.primaryEnterpriseCode = primaryEnterpriseCode;
    }

    public String getPrimarySupplier() {
        return primarySupplier;
    }

    public void setPrimarySupplier(String primarySupplier) {
        this.primarySupplier = primarySupplier;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getRequiresProdAssociation() {
        return requiresProdAssociation;
    }

    public void setRequiresProdAssociation(String requiresProdAssociation) {
        this.requiresProdAssociation = requiresProdAssociation;
    }

    public String getReturnWindow() {
        return returnWindow;
    }

    public void setReturnWindow(String returnWindow) {
        this.returnWindow = returnWindow;
    }

    public String getRunQuantity() {
        return runQuantity;
    }

    public void setRunQuantity(String runQuantity) {
        this.runQuantity = runQuantity;
    }

    public String getSerializedFlag() {
        return serializedFlag;
    }

    public void setSerializedFlag(String serializedFlag) {
        this.serializedFlag = serializedFlag;
    }

    public String getServiceTypeID() {
        return serviceTypeID;
    }

    public void setServiceTypeID(String serviceTypeID) {
        this.serviceTypeID = serviceTypeID;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaxableFlag() {
        return taxableFlag;
    }

    public void setTaxableFlag(String taxableFlag) {
        this.taxableFlag = taxableFlag;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    public String getUnitHeight() {
        return unitHeight;
    }

    public void setUnitHeight(String unitHeight) {
        this.unitHeight = unitHeight;
    }

    public String getUnitHeightUOM() {
        return unitHeightUOM;
    }

    public void setUnitHeightUOM(String unitHeightUOM) {
        this.unitHeightUOM = unitHeightUOM;
    }

    public String getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(String unitLength) {
        this.unitLength = unitLength;
    }

    public String getUnitLengthUOM() {
        return unitLengthUOM;
    }

    public void setUnitLengthUOM(String unitLengthUOM) {
        this.unitLengthUOM = unitLengthUOM;
    }

    public String getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(String unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getUnitWeightUOM() {
        return unitWeightUOM;
    }

    public void setUnitWeightUOM(String unitWeightUOM) {
        this.unitWeightUOM = unitWeightUOM;
    }

    public String getUnitWidth() {
        return unitWidth;
    }

    public void setUnitWidth(String unitWidth) {
        this.unitWidth = unitWidth;
    }

    public String getUnitWidthUOM() {
        return unitWidthUOM;
    }

    public void setUnitWidthUOM(String unitWidthUOM) {
        this.unitWidthUOM = unitWidthUOM;
    }
// Getters and Setters
// ...
}




