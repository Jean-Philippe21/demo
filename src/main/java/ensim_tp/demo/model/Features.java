package ensim_tp.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Features {

    private String type;

    private Geometry geometry;

    private Properties properties;

    public Features(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ensim_tp.demo.model.Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(ensim_tp.demo.model.Geometry geometry) {
        this.geometry = geometry;
    }

    public ensim_tp.demo.model.Properties getProperties() {
        return properties;
    }

    public void setProperties(ensim_tp.demo.model.Properties properties) {
        this.properties = properties;
    }
}
