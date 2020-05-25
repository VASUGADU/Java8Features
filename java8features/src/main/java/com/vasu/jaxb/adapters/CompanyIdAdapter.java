package com.vasu.jaxb.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class CompanyIdAdapter extends XmlAdapter<String, CompanyId> {

    protected CompanyIdAdapter() {
        super();
    }

    @Override
    public CompanyId unmarshal(String v) throws Exception {
        return new CompanyId(v);
    }

    @Override
    public String marshal(CompanyId v) throws Exception {
        return v.getCompanyId();
    }
}
