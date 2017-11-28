package Aula03_DevOps_ASDof7.NumberToText;

import java.util.HashMap;
import java.util.Map;



public class NumberToText {
	private static Map<Integer, String> base;

	
	public NumberToText(){
		PreencheMap();
	}
	
	public String Convert(double valor) {
		String resp = "";
		if (valor > 999.99 || valor < -999.99) {
			resp = "Valor inválido";
		}
		else if (valor == (int)valor && valor >= 0 ){
			resp = Convert(valor, false);
		}
		else if (valor == (int)valor && valor < 0 ) {
			resp = Convert(valor*-1, false) + " negativo";
		}
		else if (valor != (int)valor && valor > 0 ){
			int vInt = (int)valor;
			resp = Convert(vInt, false) + " e ";
			if (resp.equals(" e ")) {
				resp = "";
			}
			int vFrac = (int)((valor -(int)valor) * 100);
			resp += Convert(vFrac, true);
		}
		else if (valor != (int)valor && valor < 0 ){
			int vInt = (int)valor * -1;
			resp = Convert(vInt, false) + " e ";
			if (resp.equals(" e ")) {
				resp = "";
			}
			int vFrac = (int)((valor -(int)valor) * 100)*-1;
			resp += Convert(vFrac, true) + " negativo";
		}
		resp = resp.equals("") ? "" :resp.substring(0,1).toUpperCase().concat(resp.substring(1));
		return resp;
	}
	public String Convert(double valor, boolean cent) {
		String resp = "";
		
		while (valor != 0) {
			resp += "e ";
			if (resp.equals("e ")) {
				resp = "";
			}
			if (valor >= 900){
				valor -=900;
				resp += base.get(900) + " ";
			}
			else if (valor >= 800){
				valor -=800;
				resp += base.get(800) + " ";
				
			}
			else if (valor >= 700){
				valor -=700;
				resp += base.get(700) + " ";
			}
			else if (valor >= 600){
				valor -=600;
				resp += base.get(600) + " ";
			}
			else if (valor >= 500){
				valor -=500;
				resp += base.get(500) + " ";
			}
			else if (valor >= 400){
				valor -=400;
				resp += base.get(400) + " ";
			}
			else if (valor >= 300){
				valor -=300;
				resp += base.get(300) + " ";
			}
			else if (valor >= 200){
				valor -=200;
				resp += base.get(200) + " ";
			}
			else if (valor > 100){
				valor -=100;
				resp += base.get(101) + " ";
			}
			else if (valor == 100){
				valor -=100;
				resp += base.get(100) + " ";
			}
			else if (valor >= 90){
				valor -=90;
				resp += base.get(90) + " ";
			}
			else if (valor >= 80){
				valor -=80;
				resp += base.get(80) + " ";
				
			}
			else if (valor >= 70){
				valor -=70;
				resp += base.get(70) + " ";
			}
			else if (valor >= 60){
				valor -=60;
				resp += base.get(60) + " ";
			}
			else if (valor >= 50){
				valor -=50;
				resp += base.get(50) + " ";
			}
			else if (valor >= 40){
				valor -=40;
				resp += base.get(40) + " ";
			}
			else if (valor >= 30){
				valor -=30;
				resp += base.get(30) + " ";
			}
			else if (valor >= 20){
				valor -=20;
				resp += base.get(20) + " ";
			}
			else if (valor == 19){
				valor -=19;
				resp += base.get(19) + " ";
			}
			else  if (valor == 18){
				valor -=18;
				resp += base.get(18) + " ";
			}
			else  if (valor == 17){
				valor -=17;
				resp += base.get(17) + " ";
			}
			else  if (valor == 16){
				valor -=16;
				resp += base.get(16) + " ";
			}
			else  if (valor == 15){
				valor -=15;
				resp += base.get(15) + " ";
			}
			else  if (valor == 14){
				valor -=14;
				resp += base.get(14) + " ";
			}
			else if (valor == 13){
				valor -=13;
				resp += base.get(13) + " ";
			}
			else if (valor == 12){
				valor -=12;
				resp += base.get(12) + " ";
			}
			else  if (valor == 11){
				valor -=11;
				resp += base.get(11) + " ";
			}
			else  if (valor == 10){
				valor -=10;
				resp += base.get(10) + " ";
			}
			else if (valor == 9){
				valor -=9;
				resp += base.get(9) + " ";
			}
			else if (valor == 8){
				valor -=8;
				resp += base.get(8) + " ";
				
			}
			else if (valor == 7){
				valor -=7;
				resp += base.get(7) + " ";
			}
			else if (valor == 6){
				valor -=6;
				resp += base.get(6) + " ";
			}
			else if (valor == 5){
				valor -=5;
				resp += base.get(5) + " ";
			}
			else if (valor == 4){
				valor -=4;
				resp += base.get(4) + " ";
			}
			else if (valor == 3){
				valor -=3;
				resp += base.get(3) + " ";
			}
			else if (valor == 2){
				valor -=2;
				resp += base.get(2) + " ";
			}
			else if (valor == 1){
				valor -=1;
				resp += base.get(1) + " ";
			}
				
		}
		if (cent) {
			if (resp.equals("um ")) {
				resp += "centavo";
			}
			else if (!resp.equals("")) {
				resp += "centavos";
			}
		}
		else if (resp.equals("um ")) {
				resp += "real";
		}
		else if (!resp.equals("")) {
				resp += "reais";
		}
		
	
	
		return resp;
	}
	
	
	
	
	
	private void PreencheMap() {
		base = new HashMap<Integer, String>();
		base.put(1, "um");
		base.put(2, "dois");
		base.put(3, "três");
		base.put(4, "quatro");
		base.put(5, "cinco");
		base.put(6, "seis");
		base.put(7, "sete");
		base.put(8, "oito");
		base.put(9, "nove");
		base.put(10, "dez");
		base.put(11, "onze");
		base.put(12, "doze");
		base.put(13, "treze");
		base.put(14, "catorze");
		base.put(15, "quinze");
		base.put(16, "dezesseis");
		base.put(17, "dezessete");
		base.put(18, "dezoito");
		base.put(19, "dezenove");
		base.put(20, "vinte");
		base.put(30, "trinta");
		base.put(40, "quarenta");
		base.put(50, "cinquenta");
		base.put(60, "sessenta");
		base.put(70, "setenta");
		base.put(80, "oitenta");
		base.put(90, "noventa");
		base.put(100, "cem");
		base.put(101, "cento");
		base.put(200, "duzentos");
		base.put(300, "trezentos");
		base.put(400, "quatrocentos");
		base.put(500, "quinhentos");
		base.put(600, "seiscentos");
		base.put(700, "setecentos");
		base.put(800, "oitocentos");
		base.put(900, "novecentos");

		
	}
}
