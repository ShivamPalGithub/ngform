package com.NGFormList.request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

@RestController
public class PublishingRequestController {
    @GetMapping(value = "/generate-publishing-request", produces = "application/xml")
    public String generatePublishingRequest() throws JAXBException {
        // Create and populate the PublishingRequest object
//        PublishingRequest publishingRequest = new PublishingRequest();
//        publishingRequest.setUnderwritingSystemInd("Some Value");
//        publishingRequest.setRequestType("Some Type");
        PublishingRequest publishingRequest = new PublishingRequest();

        // Populate fields with example data
        RequestHeader requestHeader = new RequestHeader();
        ServiceRequestContext serviceRequestContext = new ServiceRequestContext();
        serviceRequestContext.setServiceInvoker("ServiceInvoker");
        serviceRequestContext.setServiceInvokocationOriginator("Originator");
        serviceRequestContext.setServiceProvider("Provider");
        serviceRequestContext.setUserID("UserID");
        serviceRequestContext.setRequestMessageId("MessageId");
        serviceRequestContext.setTimestamp("Timestamp");
        requestHeader.setServiceRequestContext(serviceRequestContext);

        publishingRequest.setRequestHeader(requestHeader);
        publishingRequest.setUnderwritingSystemInd("SomeValue");
        publishingRequest.setRequestType("Type");

        // Set other fields similarly

        // Input and NextPublishingRequest setup similarly
        Endorsement endorsement = new Endorsement();
        endorsement.setRtf("RtfValue");
        Input input = new Input();
        input.setEndorsement(endorsement);
        publishingRequest.setInput(input);

        NGFormList ngFormList = new NGFormList();
        ngFormList.setFormId("FormIdValue");
        ngFormList.setDraftIndicator("Yes");
        NextPublishingRequest nextPublishingRequest = new NextPublishingRequest();
        nextPublishingRequest.setNgFormList(ngFormList);
        publishingRequest.setNextPublishingRequest(nextPublishingRequest);

        // Set other fields...

        // Marshaller for converting object to XML
        JAXBContext jaxbContext = JAXBContext.newInstance(PublishingRequest.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(publishingRequest, stringWriter);

//        return stringWriter.toString();  // Return XML as a string

        // Enable pretty-print XML output
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Convert object to XML string
        StringWriter stringWriter1 = new StringWriter();
        marshaller.marshal(publishingRequest, stringWriter1);
        String xmlContent = stringWriter1.toString();

        // Get project root directory
        String rootPath = new File("").getAbsolutePath();
        String filePath = rootPath + "/publishingRequest.xml";

        // Save XML to root directory
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(xmlContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "XML file saved successfully at: " + file.getAbsolutePath();

    }
}
