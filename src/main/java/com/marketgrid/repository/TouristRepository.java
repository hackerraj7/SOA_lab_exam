package com.marketgrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketgrid.model.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Integer>{

}
