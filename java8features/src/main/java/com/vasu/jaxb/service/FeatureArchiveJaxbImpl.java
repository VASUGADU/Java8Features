package com.vasu.jaxb.service;

import com.vasu.jaxb.pojos.Company;
import com.vasu.jaxb.pojos.Employee;
import com.vasu.jaxb.pojos.FeatureArchiveOutcomeFields;
import com.vasu.jaxb.pojos.FeatureArchiveTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.*;

public class FeatureArchiveJaxbImpl {

    public static void main(String[] args) throws JAXBException {




        //Add collection Java to Xml
        Set<String> fields = new HashSet<>();
        fields.add("FEATURE-2.1");
        fields.add("FEATURE-2.2");
        fields.add("FEATURE-2.3");
//        FeatureArchiveOutcomeFields company = new FeatureArchiveOutcomeFields(fields);
        FeatureArchiveTest company = new FeatureArchiveTest(fields);

        // Create the JAXBContext
//        JAXBContext jaxbContext = JAXBContext.newInstance(FeatureArchiveOutcomeFields.class);
        JAXBContext jaxbContext = JAXBContext.newInstance(FeatureArchiveTest.class);
        // Create the Marshaller
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Marshal the Java class into XML
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(company, stringWriter);
        System.out.println(stringWriter.toString());

        // Unmarshal the XML into Java
        FeatureArchiveTest unmarshalled = (FeatureArchiveTest) jaxbContext.createUnmarshaller().unmarshal(new StringReader(stringWriter.toString()));
        System.out.println(unmarshalled);
    }
}
