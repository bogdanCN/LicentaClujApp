package clujWebApp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import clujWebApp.model.Building;
import clujWebApp.service.BuildingService;

@Controller
public class BuildingController {

	@Autowired
	private BuildingService buildingService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		
		Building building = new Building();
		map.put("building", building);
		map.put("buildingList", buildingService.getAllBuildings());
		return  "building";
	}
	
	@RequestMapping(value="/building.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Building building, BindingResult result, @RequestParam String action, Map<String, Object> map) {
		
		Building buildingRes = new Building();
		switch(action.toLowerCase()) {
		case "add":	
			buildingService.add(building);
			buildingRes = building;
			break;
		case "update":
			buildingService.update(building);
			buildingRes = building;
			break;
		case "delete":
			buildingService.delete(building.getIdBuilding());
			buildingRes = new Building();
			break;
		case "search":
			Building searchedBuilding = buildingService.getBuilding(building.getIdBuilding());
			buildingRes = searchedBuilding!=null ? searchedBuilding : new Building();
			break;
		}
		map.put("building", buildingRes);
		map.put("buildingList", buildingService.getAllBuildings());
		return "building";
	}
}
