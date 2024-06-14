package com.workwin.art.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.workwin.art.model.AccountSavings;

@Repository
public interface AccountSavingsRepository extends JpaRepository<AccountSavings, Long>{
	
	/*
	 * @Query(value = "select * from accountsavings", nativeQuery = true)
	 * List<AccountSavings> getAccountSavings();
	 */
}
