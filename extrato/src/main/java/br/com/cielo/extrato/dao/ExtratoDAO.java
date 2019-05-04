package br.com.cielo.extrato.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import br.com.cielo.extrato.exceptions.ArquivoJSONNaoEncontradoException;
import br.com.cielo.extrato.model.legado.LancamentoLegado;

/**
 * 
 * @author Reginaldo Lauri
 *
 */
@Repository
public class ExtratoDAO {

	public static final String LANCAMENTO_CONTA_LEGADO_JSON = "src\\main\\resources\\lancamento-conta-legado.json";
	
	/**
	 * @return LancamentoLegado
	 * @throws ArquivoJSONNaoEncontradoException
	 */
	public LancamentoLegado loadLancamentoFromJSON() throws ArquivoJSONNaoEncontradoException {
		Gson gson = new Gson();
		BufferedReader bufferedReader;
		LancamentoLegado lancamentoLegado = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(LANCAMENTO_CONTA_LEGADO_JSON));
			lancamentoLegado = gson.fromJson(bufferedReader, LancamentoLegado.class);
		} catch (FileNotFoundException e) {
			throw new ArquivoJSONNaoEncontradoException("O arquivo json não foi encontrado, verifique se o mesmo se encontra com o nome correto e na pasta:" + LANCAMENTO_CONTA_LEGADO_JSON);
		}
		
		return lancamentoLegado;
	}

}
