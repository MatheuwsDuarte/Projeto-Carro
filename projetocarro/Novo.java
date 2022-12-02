package com.mycompany.projetocarro;

public class Novo extends Carro{
//Matheus Duarte 2417820

	private int numeroParcelas;
	private double valorEntrada;
	

	public void Dados(){

		System.out.println("\n DADOS, classe-filha-NOVO."); //sobreescrita
	}
	

	public int getNumeroParcelas(){

		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas){

		this.numeroParcelas = numeroParcelas;
	}


	public double getValorEntrada(){

		return valorEntrada;
	}

	public void setValorEntrada(double valorEntrada){

		this.valorEntrada = valorEntrada;
	}

	
}