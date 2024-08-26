package paquete.app;

public class Municipality extends AbstractLocation {

    private Province province;

    public Municipality() {
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

}
