package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LineTax {
    @JacksonXmlProperty(localName = "ChargeCategory", isAttribute = true)
    private String chargeCategory;

    @JacksonXmlProperty(localName = "ChargeName", isAttribute = true)
    private String chargeName;

    @JacksonXmlProperty(localName = "ChargeNameKey", isAttribute = true)
    private String chargeNameKey;

    @JacksonXmlProperty(localName = "InvoicedTax", isAttribute = true)
    private String invoicedTax;

    @JacksonXmlProperty(localName = "Reference_1", isAttribute = true)
    private String reference1;

    @JacksonXmlProperty(localName = "Reference_2", isAttribute = true)
    private String reference2;

    @JacksonXmlProperty(localName = "Reference_3", isAttribute = true)
    private String reference3;

    @JacksonXmlProperty(localName = "RemainingTax", isAttribute = true)
    private String remainingTax;

    @JacksonXmlProperty(localName = "Tax", isAttribute = true)
    private String tax;

    @JacksonXmlProperty(localName = "TaxName", isAttribute = true)
    private String taxName;

    @JacksonXmlProperty(localName = "TaxPercentage", isAttribute = true)
    private String taxPercentage;



    @JacksonXmlProperty(localName = "Extn")
    private Extn extn;


    // Getters and Setters
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

    public String getInvoicedTax() {
        return invoicedTax;
    }

    public void setInvoicedTax(String invoicedTax) {
        this.invoicedTax = invoicedTax;
    }

    public String getReference1() {
        return reference1;
    }

    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    public String getReference2() {
        return reference2;
    }

    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    public String getReference3() {
        return reference3;
    }

    public void setReference3(String reference3) {
        this.reference3 = reference3;
    }

    public String getRemainingTax() {
        return remainingTax;
    }

    public void setRemainingTax(String remainingTax) {
        this.remainingTax = remainingTax;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Extn getExtn() {
        return extn;
    }

    public void setExtn(Extn extn) {
        this.extn = extn;
    }


    public static class Extn {
        @JacksonXmlProperty(localName = "ExtnTaxAmount1", isAttribute = true)
        private String extnTaxAmount1;

        @JacksonXmlProperty(localName = "ExtnTaxAmount2", isAttribute = true)
        private String extnTaxAmount2;

        @JacksonXmlProperty(localName = "ExtnTaxAmount3", isAttribute = true)
        private String extnTaxAmount3;

        @JacksonXmlProperty(localName = "ExtnTaxAmount4", isAttribute = true)
        private String extnTaxAmount4;

        @JacksonXmlProperty(localName = "ExtnTaxAmount5", isAttribute = true)
        private String extnTaxAmount5;

        @JacksonXmlProperty(localName = "ExtnTaxAmount6", isAttribute = true)
        private String extnTaxAmount6;

        @JacksonXmlProperty(localName = "ExtnTaxAmount7", isAttribute = true)
        private String extnTaxAmount7;

        @JacksonXmlProperty(localName = "ExtnTaxAmount8", isAttribute = true)
        private String extnTaxAmount8;

        // Getters and Setters
        public String getExtnTaxAmount1() {
            return extnTaxAmount1;
        }

        public void setExtnTaxAmount1(String extnTaxAmount1) {
            this.extnTaxAmount1 = extnTaxAmount1;
        }

        public String getExtnTaxAmount2() {
            return extnTaxAmount2;
        }

        public void setExtnTaxAmount2(String extnTaxAmount2) {
            this.extnTaxAmount2 = extnTaxAmount2;
        }

        public String getExtnTaxAmount3() {
            return extnTaxAmount3;
        }

        public void setExtnTaxAmount3(String extnTaxAmount3) {
            this.extnTaxAmount3 = extnTaxAmount3;
        }

        public String getExtnTaxAmount4() {
            return extnTaxAmount4;
        }

        public void setExtnTaxAmount4(String extnTaxAmount4) {
            this.extnTaxAmount4 = extnTaxAmount4;
        }

        public String getExtnTaxAmount5() {
            return extnTaxAmount5;
        }

        public void setExtnTaxAmount5(String extnTaxAmount5) {
            this.extnTaxAmount5 = extnTaxAmount5;
        }

        public String getExtnTaxAmount6() {
            return extnTaxAmount6;
        }

        public void setExtnTaxAmount6(String extnTaxAmount6) {
            this.extnTaxAmount6 = extnTaxAmount6;
        }

        public String getExtnTaxAmount7() {
            return extnTaxAmount7;
        }

        public void setExtnTaxAmount7(String extnTaxAmount7) {
            this.extnTaxAmount7 = extnTaxAmount7;
        }

        public String getExtnTaxAmount8() {
            return extnTaxAmount8;
        }

        public void setExtnTaxAmount8(String extnTaxAmount8) {
            this.extnTaxAmount8 = extnTaxAmount8;
        }
    }

}
