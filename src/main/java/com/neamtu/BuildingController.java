package com.neamtu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by Neamtu on 1/14/17.
 */
@RestController
@RequestMapping(value = "/building")
public class BuildingController {

    private BuildingRepository buildingRepository;

    @Autowired
    public BuildingController( BuildingRepository buildingRepository){
        this.buildingRepository = buildingRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<BuildingModel> getAllBuilding() {

        return buildingRepository.findAll();
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public BuildingModel getById(@PathVariable long id){

        return buildingRepository.findOne(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<BuildingModel> create (@RequestBody BuildingModel buildModel){

        buildingRepository.save(buildModel);
        return buildingRepository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public List<BuildingModel> delete (@PathVariable long id){
        buildingRepository.delete(id);

        return buildingRepository.findAll();
    }
}
