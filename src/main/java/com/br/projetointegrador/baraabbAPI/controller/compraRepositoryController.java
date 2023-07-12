package com.br.projetointegrador.baraabbAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projetointegrador.baraabbAPI.DTO.ListaCompraDTO;
import com.br.projetointegrador.baraabbAPI.model.ListaCompra;
import com.br.projetointegrador.baraabbAPI.service.GenericService;
import com.br.projetointegrador.baraabbAPI.service.ListaCompraService;

@RestController
@RequestMapping("listacompra")
public class compraRepositoryController extends AbstractController<ListaCompra, ListaCompraDTO> {

	private ListaCompraService compraService;
	
	@Override
	public Class<ListaCompra> getModelClass() {
		return ListaCompra.class;
	}

	@Override
	public Class<ListaCompraDTO> getDTOClass() {
		return ListaCompraDTO.class;
	}

	@Override
	public GenericService<ListaCompra> getService() {
		return compraService;
	}

}
