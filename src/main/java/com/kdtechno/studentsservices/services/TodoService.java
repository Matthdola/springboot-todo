package com.kdtechno.studentsservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.kdtechno.studentsservices.models.Todo;

@Service
public class TodoService {
	public static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static {
		todos.add( new Todo(1, "matthias", "Learn Java JEE", new Date(), false) );
		todos.add(new Todo(2, "matthias", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(3, "matthias", "Learn Spring Boot", new Date(), false));
	}
	
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equalsIgnoreCase(user)) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
		
	}
	
	public Todo retrieveTodo(int id) {
		for(Todo todo: todos) {
			if (todo.getId() == id) 
				return todo;
		}
		return null;
	}

	public void updateTodo(@Valid Todo todo) {
		todos.remove(todo);
		todos.add(todo);
		
	}
	
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}
}
