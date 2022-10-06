package com.deepu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deepu.api.model.BajajFinance;

@Repository
public interface BajajRepository extends JpaRepository<BajajFinance, Integer>{

	


 	
	//JPQL(Java persistence query language)
    @Query(value = "select * from bajaj c where c.first_name = :firstName", nativeQuery = true )
    BajajFinance findByFirstName(@Param("firstName") String firstName) ;


}
 