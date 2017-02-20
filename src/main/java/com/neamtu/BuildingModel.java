package com.neamtu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Neamtu on 1/14/17.
 */

@Entity
public class BuildingModel {

    @Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idBuilding;

    private String buildingName;
    private String buildingAddress;
    private String buildingDescription;

    public BuildingModel(){

    }

    public BuildingModel(long idBuilding, String buildingName, String buildingAddress, String buildingDescription) {
        this.idBuilding = idBuilding;
        this.buildingName = buildingName;
        this.buildingAddress = buildingAddress;
        this.buildingDescription = buildingDescription;
    }

    public long getIdBuilding() {
        return idBuilding;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public String getBuildingDescription() {
        return buildingDescription;
    }




}
