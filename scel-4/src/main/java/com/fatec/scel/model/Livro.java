package com.fatec.scel.model;

import javax.persistence.*;

@Entity(name = "Livro")
public class Livro {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String isbn;
 private String titulo;
 private String autor;

 public Livro() {
 }
 public Livro( String i, String t, String a) {
 this.isbn = i;
 this.titulo = t;
 this.autor = a;
 }
 public void setId(Long id) {
 this.id = id;
 }
 public Long getId() {
 return id;
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
 public String getAutor() {
 return autor;
 }
 public void setAutor(String autor) {
 this.autor = autor;
 }
} 

