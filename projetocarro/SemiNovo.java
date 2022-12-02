package com.mycompany.projetocarro;

import com.mycompany.projetocarro.defaul.CalcularValor;

public class SemiNovo extends Carro implements CalcularValor{
//Matheus Duarte 2417820

	private int qm;
	private String garantia;

	public void mostrarValor(double valor){

		double valorFinal = valor - valor * 0.1;
		System.out.println("\n VALOR FINAL - CARRO SEMINOVO - " + valorFinal);
	
	}

	public void Dados(){

		System.out.println("\n DADOS, classe-filha-SEMINOVO.");
	}


	public int getQm(){

		return qm;
	}

	public void setQm(int qm){

		this.qm = qm;
	}


	public String getGarantia(){

		return garantia;
	}

	public void setGarantia(String garantia){

		this.garantia = garantia;

	}

}