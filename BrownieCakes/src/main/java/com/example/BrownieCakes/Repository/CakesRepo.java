package com.example.BrownieCakes.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.BrownieCakes.Model.CakesModel;

import jakarta.transaction.Transactional;
public interface CakesRepo extends JpaRepository<CakesModel,Integer> {
	

	

	@Query(value="Select * from Treat",nativeQuery=true)
	public List<CakesModel>getAllData();
	
	

	@Query(value="Select * from Treat where id=:id",nativeQuery=true)
	public List<CakesModel> byname(@Param("id")int id);


    @Query(value="Select * from Treat where id between ?1 and ?2",nativeQuery=true)
	public List<CakesModel> startEnd(@Param(" start") int start,@Param("end")int  end);


     @Modifying
     @Transactional
     @Query(value="delete from Treat where id =?1 and name=?2",nativeQuery=true)
	  Integer deleteId(@Param("id")int id,@Param("name")String name);


     @Modifying
     @Transactional
     
     @Query(value="update Treat set id=:id where name=:name",nativeQuery=true)
	public void updateByQuery(@Param("id")int  id,  @Param("name")String name);


     // jpql query for getting the details by name
     @Query("Select c from CakesModel c where name=?1")
	public List<CakesModel> getjpqlname(String name);


     //jpql query for deleting the details by id
     @Modifying
     @Transactional
     @Query("delete from CakesModel where id=?1")
	public void deletejpqlid(int id);


     //jpql query for updating the ddetails by name
     @Modifying
     @Transactional
     @Query("update CakesModel set kgs=?1 where id=?2")
	public void updatejpql(String a, int b);


     //jpql query for getting the details using btw
     @Query("Select c from CakesModel c where id between ?1 and ?2")
	public List<CakesModel> getbtw(int start, int end);
     
     
      }
	
	
	
	

