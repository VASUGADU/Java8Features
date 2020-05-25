package com.vasu.jaxb.pojos;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Company {

    @XmlAttribute
    private int id;
    private String name;
    private int ranking;
    private double probabilityDefault;
    @XmlElement
    private Date foundedDate;

//    private List<Employee> employees;
    @XmlElementWrapper(name = "employees")
    @XmlElement(name = "employee")
    private List<Employee> employees;

    private Map<String, Employee> employeeMap;

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getProbabilityDefault() {
        return probabilityDefault;
    }

    public void setProbabilityDefault(double probabilityDefault) {
        this.probabilityDefault = probabilityDefault;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id &&
                ranking == company.ranking &&
                Double.compare(company.probabilityDefault, probabilityDefault) == 0 &&
                Objects.equals(name, company.name) &&
                Objects.equals(foundedDate, company.foundedDate) &&
                Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ranking, probabilityDefault, foundedDate, employees);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ranking=" + ranking +
                ", probabilityDefault=" + probabilityDefault +
                ", foundedDate=" + foundedDate +
                ", employees=" + employees +
                ", employeeMap=" + employeeMap +
                '}';
    }
}
