package com.NGFormList.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRequestContext {
    public ServiceRequestContext(String serviceInvoker, String serviceInvokocationOriginator, String serviceProvider, String userID, String requestMessageId, String timestamp) {
        this.serviceInvoker = serviceInvoker;
        this.serviceInvokocationOriginator = serviceInvokocationOriginator;
        this.serviceProvider = serviceProvider;
        this.userID = userID;
        this.requestMessageId = requestMessageId;
        this.timestamp = timestamp;
    }

    public ServiceRequestContext() {
    }

    @XmlElement
    private String serviceInvoker;

    @XmlElement
    private String serviceInvokocationOriginator;

    @XmlElement
    private String serviceProvider;

    @XmlElement
    private String userID;

    @XmlElement
    private String requestMessageId;

    @XmlElement
    private String timestamp;

    // Getters and setters...

    public String getServiceInvoker() {
        return serviceInvoker;
    }

    public void setServiceInvoker(String serviceInvoker) {
        this.serviceInvoker = serviceInvoker;
    }

    public String getServiceInvokocationOriginator() {
        return serviceInvokocationOriginator;
    }

    public void setServiceInvokocationOriginator(String serviceInvokocationOriginator) {
        this.serviceInvokocationOriginator = serviceInvokocationOriginator;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getRequestMessageId() {
        return requestMessageId;
    }

    public void setRequestMessageId(String requestMessageId) {
        this.requestMessageId = requestMessageId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
