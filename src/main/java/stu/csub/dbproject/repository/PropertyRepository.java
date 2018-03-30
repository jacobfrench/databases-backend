package stu.csub.dbproject.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stu.csub.dbproject.model.Property;


@Repository
public interface PropertyRepository extends CrudRepository<Property, Integer>{

}
