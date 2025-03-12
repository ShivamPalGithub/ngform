package com.NGFormList.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PublishingRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PublishingRequest {

    @XmlElement(name = "RequestHeader")
    private RequestHeader requestHeader;

    @XmlElement(name = "UnderwritingSystemInd")
    private String underwritingSystemInd;

    @XmlElement(name = "RequestType")
    private String requestType;

    @XmlElement(name = "PdfStoreIn")
    private String pdfStoreIn;

    @XmlElement(name = "SourceSystemInd")
    private String sourceSystemInd;

    @XmlElement(name = "Src")
    private String src;

    @XmlElement(name = "App")
    private String app;

    @XmlElement(name = "Mlob")
    private String mlob;

    @XmlElement(name = "IssuingCompany")
    private String issuingCompany;

    @XmlElement(name = "FormType")
    private String formType;

    @XmlElement(name = "DocType")
    private String docType;

    @XmlElement(name = "AssetRefNo")
    private String assetRefNo;

    @XmlElement(name = "FormTitle")
    private String formTitle;

    @XmlElement(name = "RtfFilename")
    private String rtfFilename;

    @XmlElement(name = "PublishingServiceVersion")
    private String publishingServiceVersion;

    @XmlElement(name = "IbmCmVersion")
    private String ibmCmVersion;

    @XmlElement(name = "MetaDataVersion")
    private String metaDataVersion;

    @XmlElement(name = "Input")
    private Input input;

    @XmlElement(name = "NextPublishingRequest")
    private NextPublishingRequest nextPublishingRequest;

    // Getters and Setters
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public String getUnderwritingSystemInd() {
        return underwritingSystemInd;
    }

    public void setUnderwritingSystemInd(String underwritingSystemInd) {
        this.underwritingSystemInd = underwritingSystemInd;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getPdfStoreIn() {
        return pdfStoreIn;
    }

    public void setPdfStoreIn(String pdfStoreIn) {
        this.pdfStoreIn = pdfStoreIn;
    }

    public String getSourceSystemInd() {
        return sourceSystemInd;
    }

    public void setSourceSystemInd(String sourceSystemInd) {
        this.sourceSystemInd = sourceSystemInd;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getMlob() {
        return mlob;
    }

    public void setMlob(String mlob) {
        this.mlob = mlob;
    }

    public String getIssuingCompany() {
        return issuingCompany;
    }

    public void setIssuingCompany(String issuingCompany) {
        this.issuingCompany = issuingCompany;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getAssetRefNo() {
        return assetRefNo;
    }

    public void setAssetRefNo(String assetRefNo) {
        this.assetRefNo = assetRefNo;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getRtfFilename() {
        return rtfFilename;
    }

    public void setRtfFilename(String rtfFilename) {
        this.rtfFilename = rtfFilename;
    }

    public String getPublishingServiceVersion() {
        return publishingServiceVersion;
    }

    public void setPublishingServiceVersion(String publishingServiceVersion) {
        this.publishingServiceVersion = publishingServiceVersion;
    }

    public String getIbmCmVersion() {
        return ibmCmVersion;
    }

    public void setIbmCmVersion(String ibmCmVersion) {
        this.ibmCmVersion = ibmCmVersion;
    }

    public String getMetaDataVersion() {
        return metaDataVersion;
    }

    public void setMetaDataVersion(String metaDataVersion) {
        this.metaDataVersion = metaDataVersion;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public NextPublishingRequest getNextPublishingRequest() {
        return nextPublishingRequest;
    }

    public void setNextPublishingRequest(NextPublishingRequest nextPublishingRequest) {
        this.nextPublishingRequest = nextPublishingRequest;
    }
}
