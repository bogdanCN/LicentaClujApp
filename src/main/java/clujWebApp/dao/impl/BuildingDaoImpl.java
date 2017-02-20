package clujWebApp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import clujWebApp.dao.BuildingDao;
import clujWebApp.model.Building;

@Repository
public class BuildingDaoImpl implements BuildingDao{
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Building building) {
		session.getCurrentSession().save(building);
		
	}

	@Override
	public void update(Building building) {
		session.getCurrentSession().update(building);
		
	}

	@Override
	public void delete(int buildingId) {
		session.getCurrentSession().delete(getBuilding(buildingId));
		
	}

	@Override
	public Building getBuilding(int buildingId) {
		return (Building) session.getCurrentSession().get(Building.class, buildingId);
	}

	@Override
	public List getAllBuildings() {
		return session.getCurrentSession().createQuery("from Building").list();
	}
	
	
}
