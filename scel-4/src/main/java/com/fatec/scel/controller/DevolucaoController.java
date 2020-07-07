package com.fatec.scel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatec.scel.model.Emprestimo;

@Controller
public class DevolucaoController {
Emprestimo emp = new Emprestimo();
@RequestMapping(value="/devolucao", method= RequestMethod.GET)

public String fim() {
return "devolucao";
}


}

