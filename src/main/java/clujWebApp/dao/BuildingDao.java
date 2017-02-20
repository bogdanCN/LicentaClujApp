package clujWebApp.dao;

import java.util.List;

import clujWebApp.model.Building;

public interface BuildingDao {
	
	public void add(Building building);
	public void update(Building building);
	public void delete(int buildingId);
	public Building getBuilding(int buildingId);
	public List getAllBuildings();
}
