package com.br.projetointegrador.baraabbAPI.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projetointegrador.baraabbAPI.model.CategoriaProduto;
import com.br.projetointegrador.baraabbAPI.repository.CategoriaProdutoRepository;
import com.br.projetointegrador.baraabbAPI.service.CategoriaProdutoService;

public class CategoriaProdutoServiceImpl extends GenericServiceImpl<CategoriaProduto> implements CategoriaProdutoService {

	private CategoriaProdutoRepository categoriaProdutoRepository;
	
	@Override
	public JpaRepository<CategoriaProduto, Long> getRepository() {
		return categoriaProdutoRepository;
	}

}
