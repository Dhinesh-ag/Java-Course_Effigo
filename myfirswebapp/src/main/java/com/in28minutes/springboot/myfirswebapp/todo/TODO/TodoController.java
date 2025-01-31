package com.in28minutes.springboot.myfirswebapp.todo.TODO;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController 
{
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	private TodoService todoService;
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model)
	{
		List<Todo> todos=todoService.findByUsername("in28minutes");
		model.addAttribute("todos", todos);
		System.out.println("todos"+todos);
		return "listeTodos";
	}
	@RequestMapping(value="add-todos", method=RequestMethod.GET)
	public String Showtodopage()
	{
		return "addTodos";
	}
	
	@RequestMapping(value="add-todos", method=RequestMethod.POST)
	public String addNewTodo()
	{
		return "redirect:list-todos";
	}


}
