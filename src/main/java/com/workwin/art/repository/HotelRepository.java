package com.workwin.art.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workwin.art.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
