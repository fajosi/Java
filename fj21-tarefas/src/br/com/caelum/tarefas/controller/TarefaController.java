package br.com.caelum.tarefas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefaController {
	
	@RequestMapping("tarefa")
	public String Tarefa(Tarefa tarefa) {
		return "tarefas/adiciona";
	}	
	
	@RequestMapping("adicionaTarefa")
	public String adicionaTarefa(@Valid Tarefa tarefa, BindingResult result) {
		
		if (result.hasFieldErrors("descricao")) {
			return "tarefas/adiciona";
		}
		
		JdbcTarefaDao dao = new JdbcTarefaDao();	
		dao.adiciona(tarefa);
		return "tarefas/mensagem";
	}
	
	@RequestMapping("listaTarefa")
	public String listarTarefa(Model model) {
		
		
		JdbcTarefaDao dao = new JdbcTarefaDao();	
		List<Tarefa> tarefas = dao.lista();
		
		model.addAttribute("tarefas", tarefas);
		
		return "tarefas/lista";
	}
	
	@RequestMapping("removeTarefa")
	public String adicionaTarefa(Tarefa tarefa) {
		
		
		JdbcTarefaDao dao = new JdbcTarefaDao();	
		dao.remove(tarefa);
		return "redirect:listaTarefa";
	}
}
