package br.com.cielo.extrato.exceptions;

import java.io.FileNotFoundException;

/**
 * 
 * @author Reginaldo Lauri
 *
 */
public class ArquivoJSONNaoEncontradoException extends FileNotFoundException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param msgError
	 */
	public ArquivoJSONNaoEncontradoException(String msgError) {
		super(msgError);
	}
}
