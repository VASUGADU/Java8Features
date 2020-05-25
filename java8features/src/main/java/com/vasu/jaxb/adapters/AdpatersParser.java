package com.vasu.jaxb.adapters;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class AdpatersParser {
    private final JAXBContext jaxbContext;
    private final boolean formattedOutput;

    public AdpatersParser(boolean formattedOutput) throws JAXBException {
        this.jaxbContext = JAXBContext.newInstance(Company.class);
        this.formattedOutput = formattedOutput;
    }

    public String toXml(Company company) throws JAXBException {
        StringWriter stringWriter = new StringWriter();
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, formattedOutput);
        marshaller.marshal(company, stringWriter);
        return stringWriter.toString();
    }

    public Company fromXml(String xml) throws JAXBException {
        return (Company) jaxbContext.createUnmarshaller().unmarshal(new StringReader(xml));
    }
}
