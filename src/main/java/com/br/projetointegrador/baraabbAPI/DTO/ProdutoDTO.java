package com.br.projetointegrador.baraabbAPI.DTO;

import java.math.BigDecimal;
import java.util.Date;

import com.br.projetointegrador.baraabbAPI.model.CategoriaProduto;
import com.br.projetointegrador.baraabbAPI.model.Usuario;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class ProdutoDTO extends AbstractDTO {
	
	private Long idProduto;
	
	private CategoriaProduto categoriaProduto;
	
	private String descricao;
	
	private BigDecimal precoCompra;
	
	private BigDecimal precoVenda;
	
	private Long quantidadeEstoque;
	
	private Usuario usuarioCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Override
	public Long getId() {
		return idProduto;
	}

}
