package paquete.app;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "id", "createdAt", "updatedAt" })
public class Province extends AbstractLocation {

    private List<Municipality> municipalities;

    public Province() {
        municipalities = new ArrayList<>();
    }

    public List<Municipality> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

}
