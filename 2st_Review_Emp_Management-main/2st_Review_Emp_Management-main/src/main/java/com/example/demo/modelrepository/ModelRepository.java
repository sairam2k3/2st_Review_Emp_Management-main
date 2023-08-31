package com.example.demo.modelrepository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.modelproject.ModelSeat;

import jakarta.transaction.Transactional;

public interface ModelRepository extends JpaRepository<ModelSeat, Integer> {
	//select
	@Query(value="select * from employeedetails where empid=:a",nativeQuery =true)
	public List<ModelSeat>getstudentinfor(@Param("a")int empid);
	
	//delete
	@Modifying
	@Transactional
	@Query(value = "delete from employeedetails  where empid=:f",nativeQuery = true)
	public Integer deleteBookById(@Param("f") int empid);
	
	//update
	@Modifying
	@Transactional
	@Query(value = "update employeedetails  set empid=?1 where empid=?2",nativeQuery = true)
	public int updateBookById(int newid,int oldid);
}
