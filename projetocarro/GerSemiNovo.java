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
public class GerSemiNovo {
    
       
    private SemiNovo s;
    private List<SemiNovo> bdSemiNovo = new ArrayList<SemiNovo>(); 
    
    
    //----- Singleton
    
    private static GerSemiNovo gerSemiNovoUnico;
    
    private GerSemiNovo(){
        
    }
    
    public static GerSemiNovo getGerSemiNovo(){
        
        if(gerSemiNovoUnico == null){
            gerSemiNovoUnico = new GerSemiNovo();
        }
        return gerSemiNovoUnico;
    }
     
    //--- Singleton
    
        public List<SemiNovo> getbdSemiNovo(){
            return bdSemiNovo;
        }
        
	public SemiNovo cadSemiNovo(SemiNovo s){

		if(consSemiNovoCod(s)== null){
			bdSemiNovo.add(s);
			return s;
		}
		else{
			return null;
		}

	}

	public SemiNovo consSemiNovoCod(SemiNovo s){
		for(int i = 0; i < bdSemiNovo.size(); i++){
			if(s.getSerie() == bdSemiNovo.get(i).getSerie()){
				return bdSemiNovo.get(i);
			}
		}
		return null;
	}

	public SemiNovo removeSemiNovoCod(SemiNovo s){
                SemiNovo seminovo = consSemiNovoCod(s);
            	if(seminovo != null){
                    bdSemiNovo.remove(seminovo);
                    return null;
		}
		else{
                    return s;
		}
		
	}

	public SemiNovo atualizaSemiNovoCod(SemiNovo s){
		for(int i = 0; i < bdSemiNovo.size(); i++){
			if(s.getSerie() == bdSemiNovo.get(i).getSerie()){
                                s.setAno(bdSemiNovo.get(i).getAno());
                                s.setMarca(  JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualização", JOptionPane.QUESTION_MESSAGE));
                    		s.setModelo(bdSemiNovo.get(i).getModelo());
                                s.setValor(bdSemiNovo.get(i).getValor());
                                s.setQm(bdSemiNovo.get(i).getQm());
                                s.setGarantia(bdSemiNovo.get(i).getGarantia());
				bdSemiNovo.set(i, s);  
                                return bdSemiNovo.get(i);
			}
		}
                return null;
	}
    
}
