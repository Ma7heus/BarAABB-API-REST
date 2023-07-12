package com.br.projetointegrador.baraabbAPI.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projetointegrador.baraabbAPI.model.ListaCompraProduto;
import com.br.projetointegrador.baraabbAPI.repository.ListaCompraProdutoRepository;
import com.br.projetointegrador.baraabbAPI.service.ListaCompraProdutoService;

public class ListaCompraProdutoServiceImpl extends GenericServiceImpl<ListaCompraProduto> implements ListaCompraProdutoService {

	private ListaCompraProdutoRepository compraProdutoRepository;
	
	@Override
	public JpaRepository<ListaCompraProduto, Long> getRepository() {
		return compraProdutoRepository;
	}


}
