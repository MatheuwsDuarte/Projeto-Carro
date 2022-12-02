package com.mycompany.projetocarro;

public abstract class Carro{
//Matheus Duarte 2417820
	protected int ano;
	protected int serie;
	protected double valor;
	protected String modelo;
	protected String marca;

	public int getAno(){
            
            return ano;
	
	}

	public void setAno(int ano){
            
            this.ano = ano;
	
	}

	public void setSerie(int serie){
            
            this.serie = serie;
			
	}

	public int getSerie(){
		return serie;

	}

	public double getValor(){
		return valor;
	}

	public void setValor(double valor){
		this.valor = valor;
	
	}

	public String getModelo(){
	
		return modelo;
	}

	public void setModelo(String modelo){

		this.modelo = modelo;
	}

	public String getMarca(){
	
		return marca;
	}

	public void setMarca(String marca){

		this.marca = marca;
	}

}