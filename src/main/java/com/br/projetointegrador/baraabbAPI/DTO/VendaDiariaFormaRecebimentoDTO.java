package com.br.projetointegrador.baraabbAPI.DTO;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public class VendaDiariaFormaRecebimentoDTO extends AbstractDTO {

	private Long idVendaDiariaFormaRecebimento;
	
	@NotNull(message = "Forma de pagamento é obrigatório")
	private String formaPagamento;
	
	@NotNull(message = "Valor recebido é obrigatório")
	private BigDecimal valorRecebido;
	
	@NotNull(message = "Venda diaria é obrigatório")
	private VendaDiariaDTO vendaDiaria;
	
	@Override
	public Long getId() {
		return idVendaDiariaFormaRecebimento;
	}

	public Long getIdVendaDiariaFormaRecebimento() {
		return idVendaDiariaFormaRecebimento;
	}

	public void setIdVendaDiariaFormaRecebimento(Long idVendaDiariaFormaRecebimento) {
		this.idVendaDiariaFormaRecebimento = idVendaDiariaFormaRecebimento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public BigDecimal getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(BigDecimal valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public VendaDiariaDTO getVendaDiaria() {
		return vendaDiaria;
	}

	public void setVendaDiaria(VendaDiariaDTO vendaDiaria) {
		this.vendaDiaria = vendaDiaria;
	}
	
}
