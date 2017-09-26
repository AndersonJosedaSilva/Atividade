package br.edu.univas.si8.ta.atividade.rest.api;

import br.edu.univas.si8.ta.atividade.rest.api.Result;

public class Result {

	private int first;
	private int second;
	private int value;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public Result withFirst(int first) {
		this.first = first;
		return this;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Result withSecond(int second) {
		this.second = second;
		return this;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Result withValue(int value) {
		this.value = value;
		return this;
	}

}
