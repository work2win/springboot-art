package com.workwin.art.repository;


import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import com.workwin.art.model.Account;

@Repository
public interface AccountRepository extends JpaRepositoryImplementation<Account, Integer>{

		
	@Query(value = "select * from account", nativeQuery = true)
	List<Account> getAcounts();
		
	@Transactional
	@Modifying
	@Query(value = "update account set balance = balance + :balance where accountnum = :accountnum", nativeQuery = true)
	int deposit(Long accountnum, Long balance);
	
	@Transactional
	@Modifying
	@Query(value = "update account set balance = balance - :balance where accountnum = :accountnum", nativeQuery = true)
	int withdraw(Long accountnum, Long balance);	
	
}
