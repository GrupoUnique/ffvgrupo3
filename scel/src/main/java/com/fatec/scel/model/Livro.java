package com.fatec.scel.model;
import javax.persistence.*; 
@Entity 
public class Livro {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 

	private String isbn; 
	private String titulo; 
	public Livro() { 
	} 
	public Livro(String isbn, String titulo) 
	{ 
	this.isbn = isbn; 
	this.titulo = titulo; 
	}  
	public String getIsbn() { 
	return isbn; 
	} 
	public void setIsbn(String isbn) { 
	this.isbn = isbn; 
	} 
	public String getTitulo() { 
	return titulo; 
	} 
	public void setTitulo(String titulo) { 
	this.titulo = titulo; 
	} 
}
