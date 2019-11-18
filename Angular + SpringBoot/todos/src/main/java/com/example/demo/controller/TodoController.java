package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos(){
		return todoService.getAllTodo();
		
	}
	
	@PostMapping("/todos")
	public Todo createTodo(@RequestBody Todo todo) {
		System.out.println(todo);
		return todoService.createTodo(todo);
	}
	
	@DeleteMapping("/todos/{id}")
	public void deleteTodo(@PathVariable("id") String id) {
		todoService.deleteTodo(id);
	}

}
