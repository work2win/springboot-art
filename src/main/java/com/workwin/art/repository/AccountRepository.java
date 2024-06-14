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
	
	
	@Transactional
	@Modifying
	@Query(value = "update account set balance = balance + :balance where accountnum = :accountnum", nativeQuery = true)
	int deposits(int accountnum, float balance);
	
	@Transactional
	@Modifying
	@Query(value = "update account set balance = balance - :balance where accountnum = :accountnum", nativeQuery = true)
	int withdraws(int accountnum, float balance);
	
	@Transactional
	@Modifying
	@Query(value = "update accountsavings set balance = balance + :balance where accountnum = :accountnum", nativeQuery = true)
	int depositAccountSaving(int accountnum, float balance);
	
	@Transactional
	@Modifying
	@Query(value = "update accountsavings set balance = balance - :balance where accountnum = :accountnum", nativeQuery = true)
	int withdrawAccountSaving(int accountnum, float balance);
	
	
	@Transactional
	@Modifying
	@Query(value = "insert into transactions (accountnum, refOrcheckNo, debit, credit) values (:accountnum, :refOrcheckNo, :debit, :credit)", nativeQuery = true)
	int transactionCredit(int accountnum, String refOrcheckNo, float debit, float credit);
	
	@Transactional
	@Modifying
	@Query(value = "insert into transactions (accountnum, refOrcheckNo, debit, credit) values (:accountnum, :refOrcheckNo, :debit, :credit)", nativeQuery = true)
	int transactionDebit(int accountnum, String refOrcheckNo, float debit, float credit);
	
	
}
