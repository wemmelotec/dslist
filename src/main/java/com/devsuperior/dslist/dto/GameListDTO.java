package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	//como o objeto a ser convertido é pequeno não utilizei o beanutils
	//como não utilizei o beanutils preciso apenas dos gets
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
