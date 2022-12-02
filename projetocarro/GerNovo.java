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
public class GerNovo {
    
    private Novo n;
    private List<Novo> bdNovo = new ArrayList<Novo>(); 
    
    
    //----- Singleton
    
    private static GerNovo gerNovoUnico;
    
    private GerNovo(){
        
    }
    
    public static GerNovo getGerNovo(){
        
        if(gerNovoUnico == null){
            gerNovoUnico = new GerNovo();
        }
        return gerNovoUnico;
    }
     
    //--- Singleton
    
        public List<Novo> getbdNovo(){
            return bdNovo;
        }
        
	public Novo cadNovo(Novo n){

		if(consNovoCod(n)== null){
			bdNovo.add(n);
			return n;
		}
		else{
			return null;
		}

	}

	public Novo consNovoCod(Novo n){
		for(int i = 0; i < bdNovo.size(); i++){
			if(n.getSerie() == bdNovo.get(i).getSerie()){
				return bdNovo.get(i);
			}
		}
		return null;
	}

	public Novo removeNovoCod(Novo n){
                Novo novo = consNovoCod(n);
            	if(novo != null){
                    bdNovo.remove(novo);
                    return null;
		}
		else{
                    return n;
		}
		
	}

	public Novo atualizaNovoCod(Novo n){
		for(int i = 0; i < bdNovo.size(); i++){
			if(n.getSerie() == bdNovo.get(i).getSerie()){
                                
                                n.setAno(bdNovo.get(i).getAno());
                                n.setMarca(  JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualização", JOptionPane.QUESTION_MESSAGE));
                    		n.setModelo(bdNovo.get(i).getModelo());
                                n.setValor(bdNovo.get(i).getValor());
                                n.setNumeroParcelas(bdNovo.get(i).getNumeroParcelas());
                                n.setValorEntrada(bdNovo.get(i).getValorEntrada());
                                bdNovo.set(i, n);  
                                return bdNovo.get(i);
			}
		}
                return null;
	}
    
}
