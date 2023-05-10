package com.devsuperior.dslist.projections;

//essa classe se tornou necessário devido ao retorno da consulta SQL no repository
//pois o retorno de consultas do tipo SQL é uma interface
public interface GameMinProjection {
	//métodos get para cada dado que a consulta está retornando
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
