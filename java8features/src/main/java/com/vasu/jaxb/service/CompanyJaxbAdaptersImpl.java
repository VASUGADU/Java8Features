package com.vasu.jaxb.service;

import com.vasu.jaxb.adapters.AdpatersParser;
import com.vasu.jaxb.adapters.Company;
import com.vasu.jaxb.adapters.CompanyId;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.xml.bind.JAXBException;

public class CompanyJaxbAdaptersImpl {

    public static void main(String[] args) throws JAXBException {
        AdpatersParser adpatersParser = new AdpatersParser(true);
        Company company = new Company();
        company.setCompanyId(new CompanyId("101"));
        company.setName("VasuSthwika");
        company.setFoundedDate(new LocalDate());
        company.setCreatedAt(new DateTime());
        String xmlString = adpatersParser.toXml(company);
        System.out.println(xmlString);
        Company unmarshalledOutput = adpatersParser.fromXml(xmlString);
        System.out.println(unmarshalledOutput);
    }
}
