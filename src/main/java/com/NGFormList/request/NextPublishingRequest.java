package com.NGFormList.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class NextPublishingRequest {

    @XmlElement
    private NGFormList ngFormList;

    // Getters and setters...

    public NGFormList getNgFormList() {
        return ngFormList;
    }

    public void setNgFormList(NGFormList ngFormList) {
        this.ngFormList = ngFormList;
    }
}
