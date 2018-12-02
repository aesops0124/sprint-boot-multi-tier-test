package com.oocl.web.sampleWebApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "parking_lot")
public class ParkingLot {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String parkingLotId;

    @Max(100)
    @Min(1)
    private int capacity;

    public ParkingLot() {
    }

    public ParkingLot(String parkingLotId, int capacity) {
        this.parkingLotId = parkingLotId;
        this.capacity = capacity;
    }

    public String getParkingLotId() {
        return parkingLotId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}