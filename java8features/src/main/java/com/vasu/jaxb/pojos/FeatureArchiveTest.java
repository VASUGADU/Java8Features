package com.vasu.jaxb.pojos;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@XmlRootElement(name = FeatureArchiveTest.ROOT_NODE, namespace = FeatureArchiveTest.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
public class FeatureArchiveTest implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String NAMESPACE = "http://www.baesystems.com/netreveal/sna/featureArchiveOutcomeFields";
    public static final String ROOT_NODE = "fields";

    @XmlElement(name="field", namespace = NAMESPACE)
    private Set<String> fields = new LinkedHashSet<>();

    public FeatureArchiveTest() {
    }

    public FeatureArchiveTest(Set<String> fields) {
        this.fields = fields != null ? fields : null;
    }

    /**
     * Returns the feature archive outcome field names.
     * The field names are unique and are in the same order as they appear in the XML config.
     */
    public List<String> getFields() {
        return new ArrayList<>(fields);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String field : fields){
            sb.append(field + "\n");
        }
        return sb.toString();
    }
}

