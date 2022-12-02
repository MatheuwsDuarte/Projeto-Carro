package com.mycompany.projetocarro;
//Matheus Duarte 2417820

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheuws Duarte
 */
public class GerUsado {
    
       
    private Usado u;
    private List<Usado> bdUsado = new ArrayList<Usado>(); 
    
    
    //----- Singleton 
    
    private static GerUsado gerUsadoUnico;
    
    private GerUsado(){
        
    }
    
    public static GerUsado getGerUsado(){
        
        if(gerUsadoUnico == null){
            gerUsadoUnico = new GerUsado();
        }
        return gerUsadoUnico;
    }
     
    //--- Singleton
    
        public List<Usado> getbdUsado(){
            return bdUsado;
        }
        
	public Usado cadUsado(Usado u){

		if(consUsadoCod(u)== null){
			bdUsado.add(u);
			return u;
		}
		else{
			return null;
		}

	}

	public Usado consUsadoCod(Usado u){
		for(int i = 0; i < bdUsado.size(); i++){
			if(u.getSerie() == bdUsado.get(i).getSerie()){
				return bdUsado.get(i);
			}
		}
		return null;
	}

	public Usado removeUsadoCod(Usado u){
                Usado usado = consUsadoCod(u);
            	if(usado != null){
                    bdUsado.remove(usado);
                    return null;
		}
		else{
                    return u;
		}
	}

	public Usado atualizaUsadoCod(Usado u){
		for(int i = 0; i < bdUsado.size(); i++){
			if(u.getSerie() == bdUsado.get(i).getSerie()){
                               u.setAno(bdUsado.get(i).getAno());
                                u.setMarca(  JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualização", JOptionPane.QUESTION_MESSAGE));
                    		u.setModelo(bdUsado.get(i).getModelo());
                                u.setValor(bdUsado.get(i).getValor());
                                u.setTempoUso(bdUsado.get(i).getTempoUso());
                                u.setValorManutencao(bdUsado.get(i).getValorManutencao());
				bdUsado.set(i, u);  
                                return bdUsado.get(i);
			}
		}
                return null;
	}
    
}
