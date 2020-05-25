package com.vasu.jaxb.adapters;

public class CompanyId {
    private final String companyId;

    public CompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyId)) return false;

        CompanyId companyId1 = (CompanyId) o;

        return getCompanyId() != null ? getCompanyId().equals(companyId1.getCompanyId()) : companyId1.getCompanyId() == null;
    }

    @Override
    public int hashCode() {
        return getCompanyId() != null ? getCompanyId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CompanyId{" +
                "companyId='" + companyId + '\'' +
                '}';
    }
}
