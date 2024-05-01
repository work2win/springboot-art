package com.workwin.art.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workwin.art.model.ArtType;

@Repository
public interface ArtTypeRepository extends JpaRepository<ArtType, Integer>{

}
