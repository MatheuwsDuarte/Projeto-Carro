package com.mycompany.projetocarro;

import com.mycompany.projetocarro.defaul.CalcularValor;

public class Usado extends Carro implements CalcularValor{
//Matheus Duarte 2417820
	private int tempoUso;
	private double valorManutencao;

	public void mostrarValor(double valor){

		double valorFinal = valor - valor * 0.3;
		System.out.println("\n VALOR FINAL - CARRO USADO - " + valorFinal);
	
	}


	public void Dados(){

		System.out.println("\n DADOS, classe-filha-Usado.");
	}


	public int getTempoUso(){

		return tempoUso;
	}

	public void setTempoUso(int tempoUso){

		this.tempoUso = tempoUso;
	}

	public double getValorManutencao(){

		return valorManutencao;
	}

	public void setValorManutencao(double valorManutencao){


		this.valorManutencao = valorManutencao;
	}


}