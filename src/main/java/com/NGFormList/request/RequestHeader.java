package com.NGFormList.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestHeader {

    @XmlElement
    private ServiceRequestContext serviceRequestContext;

    // Getters and setters...

    public ServiceRequestContext getServiceRequestContext() {
        return serviceRequestContext;
    }

    public void setServiceRequestContext(ServiceRequestContext serviceRequestContext) {
        this.serviceRequestContext = serviceRequestContext;
    }
}
