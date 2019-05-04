package br.com.cielo.extrato.model.legado;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Reginaldo Lauri
 *
 */
public class LancamentoLegado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ListaControleLancamento> listaControleLancamento;
	private TotalControleLancamento totalControleLancamento;
	private int indice;
	private int tamanhoPagina;
	private int totalElements;
	private String nomeTipoOperacao;
	
	/**
	 * 
	 * @param controleLancamentos
	 * @param controleLancamentoTotal
	 * @param indice
	 * @param tamanhoPagina
	 * @param totalElements
	 * @param nomeTipoOperacao
	 */
	public LancamentoLegado(List<ListaControleLancamento> controleLancamentos,
			TotalControleLancamento controleLancamentoTotal, int indice, int tamanhoPagina, int totalElements, String nomeTipoOperacao) {
		super();
		this.listaControleLancamento = controleLancamentos;
		this.totalControleLancamento = controleLancamentoTotal;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	/**
	 * @return the listaControleLancamento
	 */
	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	/**
	 * @param listaControleLancamento the listaControleLancamento to set
	 */
	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	/**
	 * @return the totalControleLancamento
	 */
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	/**
	 * @param totalControleLancamento the totalControleLancamento to set
	 */
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	/**
	 * @return the indice
	 */
	public int getIndice() {
		return indice;
	}

	/**
	 * @param indice the indice to set
	 */
	public void setIndice(int indice) {
		this.indice = indice;
	}

	/**
	 * @return the tamanhoPagina
	 */
	public int getTamanhoPagina() {
		return tamanhoPagina;
	}

	/**
	 * @param tamanhoPagina the tamanhoPagina to set
	 */
	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	/**
	 * @return the totalElements
	 */
	public int getTotalElements() {
		return totalElements;
	}

	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	/**
	 * @return the nomeTipoOperacao
	 */
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	/**
	 * @param nomeTipoOperacao the nomeTipoOperacao to set
	 */
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	@Override
	public String toString() {
		return "Lancamento [listaControleLancamento=" + listaControleLancamento + ", totalControleLancamento="
				+ totalControleLancamento + ", indice=" + indice + ", tamanhoPagina=" + tamanhoPagina
				+ ", totalElements=" + totalElements + "]";
	}
}
