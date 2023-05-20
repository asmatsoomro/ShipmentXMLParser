package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "PersonInfoBillTo")
public class PersonInfoBillTo {
    @JacksonXmlProperty(localName = "AddressLine1")
    private String addressLine1;

    @JacksonXmlProperty(localName = "AddressLine2")
    private String addressLine2;

    @JacksonXmlProperty(localName = "AddressLine3")
    private String addressLine3;

    @JacksonXmlProperty(localName = "AddressLine4")
    private String addressLine4;

    @JacksonXmlProperty(localName = "AddressLine5")
    private String addressLine5;

    @JacksonXmlProperty(localName = "AddressLine6")
    private String addressLine6;

    @JacksonXmlProperty(localName = "AlternateEmailID")
    private String alternateEmailID;

    @JacksonXmlProperty(localName = "Beeper")
    private String beeper;

    @JacksonXmlProperty(localName = "City")
    private String city;

    @JacksonXmlProperty(localName = "Company")
    private String company;

    @JacksonXmlProperty(localName = "Country")
    private String country;

    @JacksonXmlProperty(localName = "DayFaxNo")
    private String dayFaxNo;

    @JacksonXmlProperty(localName = "DayPhone")
    private String dayPhone;

    @JacksonXmlProperty(localName = "Department")
    private String department;

    @JacksonXmlProperty(localName = "EMailID")
    private String emailID;

    @JacksonXmlProperty(localName = "EveningFaxNo")
    private String eveningFaxNo;

    @JacksonXmlProperty(localName = "EveningPhone")
    private String eveningPhone;

    @JacksonXmlProperty(localName = "FirstName")
    private String firstName;

    @JacksonXmlProperty(localName = "JobTitle")
    private String jobTitle;

    @JacksonXmlProperty(localName = "LastName")
    private String lastName;

    @JacksonXmlProperty(localName = "MiddleName")
    private String middleName;

    @JacksonXmlProperty(localName = "MobilePhone")
    private String mobilePhone;

    @JacksonXmlProperty(localName = "OtherPhone")
    private String otherPhone;

    @JacksonXmlProperty(localName = "PersonID")
    private String personID;

    @JacksonXmlProperty(localName = "PersonInfoKey")
    private String personInfoKey;

    @JacksonXmlProperty(localName = "State")
    private String state;

    @JacksonXmlProperty(localName = "Suffix")
    private String suffix;

    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JacksonXmlProperty(localName = "ZipCode")
    private String zipCode;

    // Getters and Setters for all fields

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

