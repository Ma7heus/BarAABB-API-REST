package com.br.projetointegrador.baraabbAPI.DTO;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.validation.constraints.NotNull;

public class ProdutoDTO extends AbstractDTO {
	
	private Long idProduto;
	
	@NotNull(message = "Categoria é obrigatória")
	private CategoriaProdutoDTO categoriaProduto;
	
	@NotNull(message = "Descricao é obrigatória")
	private String descricao;
	
	@NotNull(message = "Preco de Compra é obrigatório")
	private BigDecimal precoCompra;
	
	@NotNull(message = "Preco de vendaé obrigatório")
	private BigDecimal precoVenda;
	
	@NotNull(message = "Quanidade é obrigatória")
	private Long quantidadeEstoque;
	
	@NotNull(message = "Usuario é obrigatório")
	private UsuarioDTO usuarioCadastro;
	
	private Date dataCadastro;

	@Override
	public Long getId() {
		return idProduto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public CategoriaProdutoDTO getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProdutoDTO categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public UsuarioDTO getUsuarioCadastro() {
		return usuarioCadastro;
	}

	public void setUsuarioCadastro(UsuarioDTO usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precoCompra = precoCompra;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Long getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Long quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
