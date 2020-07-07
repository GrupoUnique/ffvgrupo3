package com.fatec.scel.model;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity(name = "Usuario")
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 @NotNull
 @Size(min = 4, max = 4, message="RA deve ter 4 caracteres")
 private String ra;
 @NotNull
 @Size(min = 1, max = 50, message="Nome deve ter entre 1 e 50 caracteres")
 private String nome;
 @NotNull
 @Size(min = 1, max = 50, message="E-mail deve ter entre 1 e 50 caracteres")
 private String email;
 @NotNull
 @Size(min = 1, max = 50, message="Titulo deve ter entre 1 e 50 caracteres")
 public Usuario(String ra, String nome,String email) {
 this.ra = ra;
 this.nome = nome;
 this.email = email;
 
 }
 public Usuario() { }
 public Long getId() {
 return id;
 }
 public void setId(Long id) {
 this.id = id;
 }
 public String getRa() {
 return ra;
 }
 public void setRa(String ra) {
 this.ra = ra;
 }
 public String getNome() {
 return nome;
 }
 public void setNome(String nome) {
 this.nome = nome;
 }
 public String getEmail() {
 return email;
 }
 public void setEmail(String email) {
 this.email = email;
 }
}
