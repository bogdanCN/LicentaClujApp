package clujWebApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import clujWebApp.dao.BuildingDao;
import clujWebApp.model.Building;
import clujWebApp.service.BuildingService;

@Service
public class BuildingImpl implements BuildingService {
	@Autowired
	private BuildingDao buildingDao;
	
	@Transactional
	public void add(Building building) {
		buildingDao.add(building);

	}

	@Transactional
	public void update(Building building) {
		buildingDao.update(building);

	}

	@Transactional
	public void delete(int buildingId) {
		buildingDao.delete(buildingId);

	}

	@Transactional
	public Building getBuilding(int buildingId) {
		return buildingDao.getBuilding(buildingId);
	}

	@Transactional
	public List getAllBuildings() {
		return buildingDao.getAllBuildings();
	}

}
