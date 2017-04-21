package com.dadoun.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dadoun.entity.Evenement;


public interface IEvenementRepository  extends JpaRepository<Evenement, Long>{

}
