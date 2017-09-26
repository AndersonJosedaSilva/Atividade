package br.edu.univas.si8.ta.atividade.rest.impl;

import br.edu.univas.si8.ta.atividade.rest.api.AtividadeService;
import br.edu.univas.si8.ta.atividade.rest.api.Result;

public class AtividadeServiceImpl implements AtividadeService {

	@Override
	public Result sum(int first, int second) {
		int result = first + second;
		return new Result().withFirst(first).withSecond(second).withValue(result);
	}

	@Override
	public Result subtract(int first, int second) {
		int result = first - second;
		return new Result().withFirst(first).withSecond(second).withValue(result);
	}
	
	

}
