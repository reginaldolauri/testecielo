package br.com.cielo.extrato.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.cielo.extrato.dto.DadosBancariosDTO;
import br.com.cielo.extrato.dto.ExtratoDTO;
import br.com.cielo.extrato.model.legado.LancamentoLegado;
import br.com.cielo.extrato.model.legado.ListaControleLancamento;

/**
 * 
 * @author Reginaldo Lauri
 *
 */
@Component
public class ExtratoBuilder {

	/**
	 * @param lancamentoLegado
	 * @return List<ExtratoDTO>
	 */
	public List<ExtratoDTO> builder(LancamentoLegado lancamentoLegado) {
		List<ExtratoDTO> extratos = new ArrayList<ExtratoDTO>();
		
		for (ListaControleLancamento controleLancamento : lancamentoLegado.getListaControleLancamento()) {
			DadosBancariosDTO dadosBancarios = new DadosBancariosDTO();
			dadosBancarios.setAgencia(controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia());
			dadosBancarios.setNomeBanco(controleLancamento.getNomeBanco());
			dadosBancarios.setContaCorrente(controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
			
			ExtratoDTO extrato = new ExtratoDTO();
			
			extrato.setDataLancamento(controleLancamento.getDataLancamentoContaCorrenteCliente());
			extrato.setDescricao(controleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
			extrato.setNumero(controleLancamento.getNumeroEvento());
			extrato.setSituacao(controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			extrato.setDataConfirmacao(controleLancamento.getDataEfetivaLancamento());
			extrato.setDadosBancarios(dadosBancarios);
			extrato.setValorFinal(controleLancamento.getValorLancamentoRemessa());
			
			extratos.add(extrato);
		}
		
		return extratos;
	}
}
