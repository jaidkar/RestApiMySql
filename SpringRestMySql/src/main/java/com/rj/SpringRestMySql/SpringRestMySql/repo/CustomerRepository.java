package com.rj.SpringRestMySql.SpringRestMySql.repo;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
 
import com.rj.SpringRestMySql.SpringRestMySql.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}