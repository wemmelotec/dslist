package com.devsuperior.dslist.dto;

//essa é a classe que vai receber o meu Json que vem da requisição externa
//pois para trabalhar com essa requisição na minha aplicação eu preciso de um objeto
public class ReplacmentDTO {
	//os campos precisam ser exatamentes iguais aos da requisição
	private Integer sourceIndex;
	private Integer destinationIndex;
	
	public Integer getSourceIndex() {
		return sourceIndex;
	}
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	public Integer getDestinationIndex() {
		return destinationIndex;
	}
	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
	
	
}
