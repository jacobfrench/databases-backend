package stu.csub.dbproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stu.csub.dbproject.model.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Integer> {

}
