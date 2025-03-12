package com.NGFormList.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Endorsement {
    @XmlElement
    private String rtf;

    public String getRtf() {
        return rtf;
    }

    public void setRtf(String rtf) {
        this.rtf = rtf;
    }
// Getters and setters...
}
