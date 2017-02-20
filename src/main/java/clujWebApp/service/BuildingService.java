package clujWebApp.service;

import java.util.List;

import clujWebApp.model.Building;

public interface BuildingService {
	public void add(Building building);
	public void update(Building building);
	public void delete(int buildingId);
	public Building getBuilding(int buildingId);
	public List getAllBuildings();
}
