package paquete.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entity extends AbstracAppModel {

    private String reeup;
    private EntityType entityType;
    private Municipality municipality;

    public Entity() {
    }

    @Override
    @JsonProperty("nombre")
    public void setName(String name) {
        super.setName(name);
    }

    public String getReeup() {
        return reeup;
    }

    public void setReeup(String reeup) {
        this.reeup = reeup;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public String getDpa() {
        return municipality.getProvince().getCode() + "." + municipality.getCode();
    }

    @Override
    public String toString() {
        return name + "\n"
                + "reeup: " + reeup + "\n"
                + "type: " + entityType.getName() + "\n"
                + "dpa: " + getDpa() + "\n"
                + "province: " + municipality.getProvince().getName() + "\n"
                + "municipality: " + municipality.getName();
    }

}
