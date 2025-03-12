package com.NGFormList.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class NGFormList {
    @XmlElement
    private String formId;

    @XmlElement
    private String draftIndicator;

    // Getters and setters...

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getDraftIndicator() {
        return draftIndicator;
    }

    public void setDraftIndicator(String draftIndicator) {
        this.draftIndicator = draftIndicator;
    }
}
