package com.appsdeveloperblog.aws.photoapp.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonInfoShipTo {
    @JacksonXmlProperty(localName = "AddressLine1", isAttribute = true)
    private String addressLine1;

    @JacksonXmlProperty(localName = "AddressLine2", isAttribute = true)
    private String addressLine2;

    @JacksonXmlProperty(localName = "City", isAttribute = true)
    private String city;

    @JacksonXmlProperty(localName = "Company", isAttribute = true)
    private String company;

    @JacksonXmlProperty(localName = "Country", isAttribute = true)
    private String country;

    @JacksonXmlProperty(localName = "DayPhone", isAttribute = true)
    private String dayPhone;

    @JacksonXmlProperty(localName = "EMailID", isAttribute = true)
    private String emailID;

    @JacksonXmlProperty(localName = "FirstName", isAttribute = true)
    private String firstName;

    @JacksonXmlProperty(localName = "LastName", isAttribute = true)
    private String lastName;

    @JacksonXmlProperty(localName = "State", isAttribute = true)
    private String state;

    @JacksonXmlProperty(localName = "ZipCode", isAttribute = true)
    private String zipCode;

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

    public String getDayPhone() {
        return dayPhone;
    }

    public void setDayPhone(String dayPhone) {
        this.dayPhone = dayPhone;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
// Getters and Setters
    // ...
}

