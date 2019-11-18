package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TodoRepository;
import com.example.demo.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	@Transactional
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	@Transactional
	public Todo createTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepository.save(todo);
	}

	@Override
	@Transactional
	public void deleteTodo(String id) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(id);
		
		
	}

}
