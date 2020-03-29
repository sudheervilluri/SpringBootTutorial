package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService todoService;
	
	@RequestMapping("/todo")
	public String viewTodo(ModelMap map) {
		map.put("todo", todoService.getTodo());
		return "todo";
	}
}
