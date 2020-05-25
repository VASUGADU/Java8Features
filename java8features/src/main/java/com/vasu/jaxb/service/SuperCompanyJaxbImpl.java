package com.vasu.jaxb.service;

import com.vasu.jaxb.pojos.SuperCompany;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.GregorianCalendar;

public class SuperCompanyJaxbImpl {

    public static void main(String[] args) throws JAXBException {

        SuperCompany superCompany = new SuperCompany();
        superCompany.setId(1);
        superCompany.setName("VasuSathwika");
        superCompany.setRanking(10);
        superCompany.setProbabilityDefault(0.3);
        superCompany.setFoundedDate(new GregorianCalendar(2018, 3, 3).getTime());

        // Create the JAXBContext
        JAXBContext jaxbContext = JAXBContext.newInstance(SuperCompany.class);
        // Create the Marshaller
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Marshal the Java class into XML
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(superCompany, stringWriter);
        System.out.println(stringWriter.toString());

        // Unmarshal the XML into Java
        SuperCompany unmarshalled = (SuperCompany) jaxbContext.createUnmarshaller().unmarshal(new StringReader(stringWriter.toString()));
        System.out.println(unmarshalled);
    }
}
