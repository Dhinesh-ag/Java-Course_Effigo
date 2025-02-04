package com.in28minutes.springboot.myfirswebapp.todo.TODO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class TodoController {
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("in28minutes");
		model.addAttribute("todos", todos);
		System.out.println("todos" + todos);
		return "listeTodos";
	}

	@RequestMapping(value = "add-todos", method = RequestMethod.GET)
	public String Showtodopage(ModelMap model) 
	{
		String username = (String) model.get("name");
		Todo todo=new Todo(0, username,"",LocalDate.now().plusYears(1), false );
		model.put("todo", todo);
		return "addTodos";
	}

	@RequestMapping(value = "add-todos", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, Todo todo) {
		String username = (String) model.get("name");
		todoService.addTodo(username, todo.getDescript(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}

}
