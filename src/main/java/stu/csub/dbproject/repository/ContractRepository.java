package stu.csub.dbproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import stu.csub.dbproject.model.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Integer> {
	
	@Query("FROM Contract WHERE completed = :completed")
	public List<Contract> getOpenContracts(@Param("completed") boolean completed);
	
}