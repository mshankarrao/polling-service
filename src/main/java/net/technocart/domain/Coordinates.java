package net.technocart.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by shankarraomata on 5/21/17.
 */
@Entity
@Table(name = "coordinates")
public class Coordinates {

    @Id
    @Column(name = "id")
    private String vehicleCode;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name="latitude")
    private Double latitude;

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "vehicleCode='" + vehicleCode + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
