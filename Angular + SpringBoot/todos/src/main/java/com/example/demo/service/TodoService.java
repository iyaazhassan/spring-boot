package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Todo;

public interface TodoService {
	
	public List<Todo> getAllTodo();
		
	public Todo createTodo(Todo todo);
	
	public void deleteTodo(String id);

}
