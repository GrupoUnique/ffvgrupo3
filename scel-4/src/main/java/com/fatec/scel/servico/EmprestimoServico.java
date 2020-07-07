package com.fatec.scel.servico;
import org.joda.time.DateTime;

import com.fatec.scel.model.Emprestimo;
public interface EmprestimoServico {
 public Iterable<Emprestimo> findAll();
 public String registraEmprestimo (Emprestimo emprestimo);
 public String registraDevolucao ( String isbn); //supoe que isbn refere-se ao tombo
 public void deleteById(Long id);
 public void entregue();
}
