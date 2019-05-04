package br.com.cielo.extrato.model.legado;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @author Reginaldo Lauri
 *
 */
public class ListaControleLancamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LancamentoContaCorrente lancamentoContaCorrenteCliente;  
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private long numeroEvento;
	private String descricaoGrupoPagamento;
	private int codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private long numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;
	
	/**
	 * @param lancamentoContaCorrenteCliente
	 * @param dataEfetivaLancamento
	 * @param dataLancamentoContaCorrenteCliente
	 * @param numeroEvento
	 * @param descricaoGrupoPagamento
	 * @param codigoIdentificadorUnico
	 * @param nomeBanco
	 * @param quantidadeLancamentoRemessa
	 * @param numeroRaizCNPJ
	 * @param numeroSufixoCNPJ
	 * @param valorLancamentoRemessa
	 * @param dateLancamentoContaCorrenteCliente
	 * @param dateEfetivaLancamento
	 * @param nomeTipoOperacao
	 */
	public ListaControleLancamento(LancamentoContaCorrente lancamentoContaCorrenteCliente, String dataEfetivaLancamento,
			String dataLancamentoContaCorrenteCliente, long numeroEvento, String descricaoGrupoPagamento,
			int codigoIdentificadorUnico, String nomeBanco, int quantidadeLancamentoRemessa, long numeroRaizCNPJ,
			String numeroSufixoCNPJ, BigDecimal valorLancamentoRemessa, long dateLancamentoContaCorrenteCliente,
			long dateEfetivaLancamento) {
		super();
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	/**
	 * 
	 * @return LancamentoContaCorrente
	 */
	public LancamentoContaCorrente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @param lancamentoContaCorrenteCliente
	 */
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @return dataEfetivaLancamento
	 */
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	/**
	 * 
	 * @param dataEfetivaLancamento
	 */
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	/**
	 * 
	 * @return
	 */
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @param dataLancamentoContaCorrenteCliente
	 */
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @return numeroEvento
	 */
	public long getNumeroEvento() {
		return numeroEvento;
	}

	/**
	 * 
	 * @param numeroEvento
	 */
	public void setNumeroEvento(long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	/**
	 * 
	 * @param descricaoGrupoPagamento
	 */
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	/**
	 * 
	 * @return codigoIdentificadorUnico
	 */
	public int getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	/**
	 * 
	 * @param codigoIdentificadorUnico
	 */
	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	/**
	 * 
	 * @return nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	/**
	 * 
	 * @return quantidadeLancamentoRemessa
	 */
	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	/**
	 * 
	 * @param quantidadeLancamentoRemessa
	 */
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	/**
	 * 
	 * @return numeroRaizCNPJ
	 */
	public long getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	/**
	 * 
	 * @param numeroRaizCNPJ
	 */
	public void setNumeroRaizCNPJ(long numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	/**
	 * 
	 * @return numeroSufixoCNPJ
	 */
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	/**
	 * 
	 * @param numeroSufixoCNPJ
	 */
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	/**
	 * 
	 * @return valorLancamentoRemessa
	 */
	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	/**
	 * 
	 * @param valorLancamentoRemessa
	 */
	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	/**
	 * 
	 * @return dateLancamentoContaCorrenteCliente
	 */
	public long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @param dateLancamentoContaCorrenteCliente
	 */
	public void setDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	/**
	 * 
	 * @return dateEfetivaLancamento
	 */
	public long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	/**
	 * 
	 * @param dateEfetivaLancamento
	 */
	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

}
