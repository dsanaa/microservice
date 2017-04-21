package com.dadoun.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.dadoun.dao.IEvenementRepository;
import com.dadoun.entity.Evenement;


@Path("/")
public class EvenementController {
	
	@Autowired
	private IEvenementRepository evenementRepository;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/test")
	public String test(){
		return "test";
} 
	
@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/afficher")
public String toString() {
	System.out.println("date d’exécution modifiée, début traitement …");
	evenementRepository.toString();
	     return "OK …";
	 }


@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/save")
public Evenement saveEvenement(){
	
	
	
	Date dATEEXEC=new Date();
	
	Evenement e=new Evenement();
	
	e.setDATEEXEC(dATEEXEC);
	
	evenementRepository.save(e);
	
	return e;}

/*@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/scruter")
public */






}


