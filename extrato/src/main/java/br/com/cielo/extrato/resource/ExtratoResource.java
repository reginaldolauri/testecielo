package br.com.cielo.extrato.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.extrato.dto.ExtratoDTO;
import br.com.cielo.extrato.exceptions.ArquivoJSONNaoEncontradoException;
import br.com.cielo.extrato.service.ExtratoService;

/**
 * 
 * @author Reginaldo Lauri
 *
 */
@RestController
@RequestMapping("/extratos")
public class ExtratoResource {

	@Autowired
	private ExtratoService service;
	
	/**
	 * Retorna objeto para exposicao no controller web.
	 * @return ResponseEntity<List<ExtratoDTO>>
	 */
	@SuppressWarnings({"unchecked","rawtypes"})
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ExtratoDTO>> listar() {
		List<ExtratoDTO> extratos;
		
		try {
			extratos = this.service.getListaExtrato();
			return ResponseEntity.status(HttpStatus.OK).body(extratos);
		} catch (ArquivoJSONNaoEncontradoException e) {
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
