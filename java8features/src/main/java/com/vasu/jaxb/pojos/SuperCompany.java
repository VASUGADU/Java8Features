package com.vasu.jaxb.pojos;


import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.Objects;

@XmlRootElement(name = "super-company")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superCompanyType", propOrder = {"name", "foundedDate", "probabilityDefault", "ranking"})
public class SuperCompany {

    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "company-name")
    private String name;
    @XmlElement(name = "rank")
    private int ranking;
    @XmlElement(name = "default-prob")
    private double probabilityDefault;
    @XmlElement(name = "founded")
    private Date foundedDate;

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
        SuperCompany that = (SuperCompany) o;
        return id == that.id &&
                ranking == that.ranking &&
                Double.compare(that.probabilityDefault, probabilityDefault) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(foundedDate, that.foundedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ranking, probabilityDefault, foundedDate);
    }

    @Override
    public String toString() {
        return "SuperCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ranking=" + ranking +
                ", probabilityDefault=" + probabilityDefault +
                ", foundedDate=" + foundedDate +
                '}';
    }
}
