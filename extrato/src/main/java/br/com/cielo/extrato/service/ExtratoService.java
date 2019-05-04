package br.com.cielo.extrato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.extrato.builder.ExtratoBuilder;
import br.com.cielo.extrato.dao.ExtratoDAO;
import br.com.cielo.extrato.dto.ExtratoDTO;
import br.com.cielo.extrato.exceptions.ArquivoJSONNaoEncontradoException;
import br.com.cielo.extrato.model.legado.LancamentoLegado;

/**
 * 
 * @author Reginaldo Lauri
 *
 */
@Service
public class ExtratoService {

	@Autowired
	private ExtratoDAO dao;
	
	@Autowired
	private ExtratoBuilder builder;
	
	/**
	 * Retorna uma lista com o extrato do Cliente.
	 * @return List<ExtratoDTO>
	 * @throws ArquivoJSONNaoEncontradoException
	 */
	public List<ExtratoDTO> getListaExtrato() throws ArquivoJSONNaoEncontradoException {
		LancamentoLegado lancamentoLegado = this.dao.loadLancamentoFromJSON();
		return this.builder.builder(lancamentoLegado);
	}
	
}
