package com.br.projetointegrador.baraabbAPI.DTO;

import java.math.BigDecimal;
import java.util.Date;

import com.br.projetointegrador.baraabbAPI.model.Usuario;

import jakarta.validation.constraints.NotNull;

public class VendaDiariaDTO extends AbstractDTO {
	
	private Long idVendaDiaria;
	
	@NotNull(message = "Usuario é obrigatório")
	private Usuario usuario;
	
	@NotNull(message = "Valor Total Bruto é obrigatório")
	private BigDecimal valorTotalBruto;
	
	@NotNull(message = "Valor total liquido é obrigatório")
	private BigDecimal valorTotalLiquido;
		
	private Date dataCadastro;

	@Override
	public Long getId() {
		return idVendaDiaria;
	}

	public Long getIdVendaDiaria() {
		return idVendaDiaria;
	}

	public void setIdVendaDiaria(Long idVendaDiaria) {
		this.idVendaDiaria = idVendaDiaria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValorTotalBruto() {
		return valorTotalBruto;
	}

	public void setValorTotalBruto(BigDecimal valorTotalBruto) {
		this.valorTotalBruto = valorTotalBruto;
	}

	public BigDecimal getValorTotalLiquido() {
		return valorTotalLiquido;
	}

	public void setValorTotalLiquido(BigDecimal valorTotalLiquido) {
		this.valorTotalLiquido = valorTotalLiquido;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}
