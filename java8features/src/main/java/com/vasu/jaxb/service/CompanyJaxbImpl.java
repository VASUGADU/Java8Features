package com.vasu.jaxb.service;

import com.vasu.jaxb.pojos.Company;
import com.vasu.jaxb.pojos.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.*;

public class CompanyJaxbImpl {

    public static void main(String[] args) throws JAXBException {

        Company company = new Company();
        company.setId(1);
        company.setName("VasuSathwika");
        company.setRanking(10);
        company.setProbabilityDefault(0.3);
        company.setFoundedDate(new GregorianCalendar(2018, 3, 3).getTime());

        //Add collection Java to Xml
        Employee employee1 = new Employee("Vasu", 30);
        Employee employee2 = new Employee("Sathwika", 27);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        company.setEmployees(employees);

        //Add Map collection Java to Xml
        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put(employee1.getName(), employee1);
        employeeMap.put(employee2.getName(), employee2);
        company.setEmployeeMap(employeeMap);

        // Create the JAXBContext
        JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);

        // Create the Marshaller
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Marshal the Java class into XML
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(company, stringWriter);
        System.out.println(stringWriter.toString());

        // Unmarshal the XML into Java
        Company unmarshalled = (Company) jaxbContext.createUnmarshaller().unmarshal(new StringReader(stringWriter.toString()));
        System.out.println(unmarshalled);
    }
}
