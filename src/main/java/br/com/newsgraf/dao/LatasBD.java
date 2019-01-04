package br.com.newsgraf.dao;

import java.io.FileWriter;

import com.google.gson.Gson;

import br.com.newsgraf.Latas;

public class LatasBD {
	
	
	public void gravarLata(){
		
		Gson gson = new Gson();
		String obj = "teste";
		Latas latas = new Latas();
		latas.setAltura(5);
		latas.setCircunferencia(3);
		latas.setPeso(20);
		try{
		// 1. Java object to JSON, and save into a file
		gson.toJson(latas, new FileWriter("C:\\temp\\file.json"));
		
		System.out.println("salvou");
		// 2. Java object to JSON, and assign to a String
		String jsonInString = gson.toJson(latas);
		}catch(Exception eS){
			System.out.println("erro"+eS.getMessage());
		}
		
	}
	
}
