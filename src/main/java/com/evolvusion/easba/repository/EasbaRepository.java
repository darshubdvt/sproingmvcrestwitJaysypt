package com.evolvusion.easba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evolvusion.easba.bean.Employee;
@Repository
public interface EasbaRepository extends JpaRepository<Employee, Long>{

}
