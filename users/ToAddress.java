package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ToAddress {
    @JacksonXmlProperty(localName = "AddressLine1", isAttribute = true)
    private String addressLine1;

    @JacksonXmlProperty(localName = "AddressLine2", isAttribute = true)
    private String addressLine2;

    @JacksonXmlProperty(localName = "AddressLine3", isAttribute = true)
    private String addressLine3;

    @JacksonXmlProperty(localName = "AddressLine4", isAttribute = true)
    private String addressLine4;

    @JacksonXmlProperty(localName = "AddressLine5", isAttribute = true)
    private String addressLine5;

    @JacksonXmlProperty(localName = "AddressLine6", isAttribute = true)
    private String addressLine6;

    @JacksonXmlProperty(localName = "AlternateEmailID", isAttribute = true)
    private String alternateEmailID;

    @JacksonXmlProperty(localName = "Beeper", isAttribute = true)
    private String beeper;

    @JacksonXmlProperty(localName = "City", isAttribute = true)
    private String city;

    @JacksonXmlProperty(localName = "Company", isAttribute = true)
    private String company;

    @JacksonXmlProperty(localName = "Country", isAttribute = true)
    private String country;

    @JacksonXmlProperty(localName = "DayFaxNo", isAttribute = true)
    private String dayFaxNo;

    @JacksonXmlProperty(localName = "DayPhone", isAttribute = true)
    private String dayPhone;

    @JacksonXmlProperty(localName = "Department", isAttribute = true)
    private String department;

    @JacksonXmlProperty(localName = "EMailID", isAttribute = true)
    private String emailID;

    @JacksonXmlProperty(localName = "ErrorTxt", isAttribute = true)
    private String errorTxt;

    @JacksonXmlProperty(localName = "EveningFaxNo", isAttribute = true)
    private String eveningFaxNo;

    @JacksonXmlProperty(localName = "EveningPhone", isAttribute = true)
    private String eveningPhone;

    @JacksonXmlProperty(localName = "FirstName", isAttribute = true)
    private String firstName;

    @JacksonXmlProperty(localName = "HttpUrl", isAttribute = true)
    private String httpUrl;

    @JacksonXmlProperty(localName = "JobTitle", isAttribute = true)
    private String jobTitle;

    @JacksonXmlProperty(localName = "LastName", isAttribute = true)
    private String lastName;

    @JacksonXmlProperty(localName = "MiddleName", isAttribute = true)
    private String middleName;

    @JacksonXmlProperty(localName = "MobilePhone", isAttribute = true)
    private String mobilePhone;

    @JacksonXmlProperty(localName = "OtherPhone", isAttribute = true)
    private String otherPhone;

    @JacksonXmlProperty(localName = "PersonID", isAttribute = true)
    private String personID;

    @JacksonXmlProperty(localName = "PersonInfoKey", isAttribute = true)
    private String personInfoKey;

    @JacksonXmlProperty(localName = "PreferredShipAddress", isAttribute = true)
    private String preferredShipAddress;

    @JacksonXmlProperty(localName = "State", isAttribute = true)
    private String state;

    @JacksonXmlProperty(localName = "Suffix", isAttribute = true)
    private String suffix;

    @JacksonXmlProperty(localName = "Title", isAttribute = true)
    private String title;

    @JacksonXmlProperty(localName = "UseCount", isAttribute = true)
    private String useCount;

    @JacksonXmlProperty(localName = "VerificationStatus", isAttribute = true)
    private String verificationStatus;

    @JacksonXmlProperty(localName = "ZipCode", isAttribute = true)
    private String zipCode;

// Getters and Setters
// ...

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine5() {
        return addressLine5;
    }

    public void setAddressLine5(String addressLine5) {
        this.addressLine5 = addressLine5;
    }

    public String getAddressLine6() {
        return addressLine6;
    }

    public void setAddressLine6(String addressLine6) {
        this.addressLine6 = addressLine6;
    }

    public String getAlternateEmailID() {
        return alternateEmailID;
    }

    public void setAlternateEmailID(String alternateEmailID) {
        this.alternateEmailID = alternateEmailID;
    }

    public String getBeeper() {
        return beeper;
    }

    public void setBeeper(String beeper) {
        this.beeper = beeper;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDayFaxNo() {
        return dayFaxNo;
    }

    public void setDayFaxNo(String dayFaxNo) {
        this.dayFaxNo = dayFaxNo;
    }

    public String getDayPhone() {
        return dayPhone;
    }

    public void setDayPhone(String dayPhone) {
        this.dayPhone = dayPhone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getErrorTxt() {
        return errorTxt;
    }

    public void setErrorTxt(String errorTxt) {
        this.errorTxt = errorTxt;
    }

    public String getEveningFaxNo() {
        return eveningFaxNo;
    }

    public void setEveningFaxNo(String eveningFaxNo) {
        this.eveningFaxNo = eveningFaxNo;
    }

    public String getEveningPhone() {
        return eveningPhone;
    }

    public void setEveningPhone(String eveningPhone) {
        this.eveningPhone = eveningPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonInfoKey() {
        return personInfoKey;
    }

    public void setPersonInfoKey(String personInfoKey) {
        this.personInfoKey = personInfoKey;
    }

    public String getPreferredShipAddress() {
        return preferredShipAddress;
    }

    public void setPreferredShipAddress(String preferredShipAddress) {
        this.preferredShipAddress = preferredShipAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUseCount() {
        return useCount;
    }

    public void setUseCount(String useCount) {
        this.useCount = useCount;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


}