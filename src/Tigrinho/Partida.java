package Tigrinho;

import java.util.Random;
import Tigrinho.Jogador;


public class Partida {
	
	private String tabuleiro[][];
	private int tabuleiroEspelho[][];
	private int rodadas;
	private Jogador jogador;
	
	public Partida(String nomeJogador) {
		tabuleiroEspelho = new int[5][5];
		tabuleiro = new String[5][5];
		this.rodadas = 10;
		this.jogador = new Jogador(nomeJogador);
	}
	
	public void randomizaTabuleiroEspelho() {
		Random aleatorio = new Random();
		
		for (int linha = 0; linha < this.tabuleiroEspelho.length; linha++) {
		    for (int coluna = 0; coluna < this.tabuleiroEspelho[linha].length; coluna++) {
		        int valorAleatorio = aleatorio.nextInt(6);
		        this.tabuleiroEspelho[linha][coluna] = valorAleatorio;
		    }
		}
	}
	
	public void zeraTabuleiro() {
		for (int linha = 0; linha < this.tabuleiro.length; linha++) {
		    for (int coluna = 0; coluna < this.tabuleiro[linha].length; coluna++) {
		        this.tabuleiro[linha][coluna] = "O";
		    }
		}
	}
	
	public void mostraTabuleiro() {
		System.out.println("    1   2   3   4   5");
	    for (int linha = 0; linha < this.tabuleiro.length; linha++) {
	    	System.out.print(linha+1);
	        for (int coluna = 0; coluna < this.tabuleiro[linha].length; coluna++) {
	            System.out.print(" | " + this.tabuleiro[linha][coluna]);
	        }
	        System.out.println();
	    }

	}
	
	public void mostraTabuleiroEspelho() {
		System.out.println("    1   2   3   4   5");
	    for (int linha = 0; linha < this.tabuleiroEspelho.length; linha++) {
	    	System.out.print(linha+1);
	        for (int coluna = 0; coluna < this.tabuleiroEspelho[linha].length; coluna++) {
	            System.out.print(" | " + this.tabuleiroEspelho[linha][coluna]);
	        }
	        System.out.println();
	    }

	}
	
	public void fazerJogada() {
		
	}
	
	
		 	
	
	
}
