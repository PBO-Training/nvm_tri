package com.travel.application.travelservice.info.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.InfoEntity;
@Repository
public interface IRepoInfo  extends JpaRepository<InfoEntity, Long>{

}
