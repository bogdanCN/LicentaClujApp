package com.neamtu.Repositories;

import com.neamtu.Models.BuildingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Neamtu on 1/14/17.
 */

@Repository
public interface BuildingRepository extends JpaRepository<BuildingModel, Long> {



}
