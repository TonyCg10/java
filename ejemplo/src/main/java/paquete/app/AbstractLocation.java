package paquete.app;

public abstract class AbstractLocation extends AbstracAppModel {
    protected String code;
    protected float latitude;
    protected float longitude;

    public AbstractLocation() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

}
