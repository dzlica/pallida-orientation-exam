package com.greenfox.dzlica.orientationexam.repositories;

import com.greenfox.dzlica.orientationexam.model.Plate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlateRepo extends CrudRepository<Plate, Long> {
    List<Plate> findAllByPlateIsLike(String plate);
    List<Plate> findAllByCarBrand(String brand);

}
