package com.in28minutes.springboot.myfirswebapp.todo.TODO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.function.Predicate;

@Service
class TodoService 
{
	private static List<Todo> todos=new ArrayList<>();
	private static int todosCount=0;
	
	static {
		todos.add(new Todo(++todosCount, "agd", "LearnAws", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "agd", "learnDevops", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "agd", "LearnFullStack", LocalDate.now().plusYears(3), false));
		
	}
	
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done)
	{
		Todo todo=new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	

}
