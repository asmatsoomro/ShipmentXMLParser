package com.appsdeveloperblog.aws.photoapp.users;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ShipmentLines {
    @JacksonXmlProperty(localName = "ShipmentLine")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ShipmentLine> shipmentLines;

    public List<ShipmentLine> getShipmentLines() {
        return shipmentLines;
    }

    public void setShipmentLines(List<ShipmentLine> shipmentLines) {
        this.shipmentLines = shipmentLines;
    }
}

