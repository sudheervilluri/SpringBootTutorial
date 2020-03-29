package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.TODO;


@Service
public class TodoService {

	private static List<TODO> list = new ArrayList();
	static {
		list.add(new TODO(1, "Sudheer", "test", new Date()));
		list.add(new TODO(2, "sunil", "test", new Date(2019, 2, 5)));
		list.add(new TODO(3, "Ser", "test", new Date()));
	}

	public void addTodo(int id, String name, String desc, Date targetDate) {
		list.add(new TODO(id, name, desc, targetDate));
	}

	public void remove(int id) {
		list.stream().filter(e -> e.getId() == id).forEach(e -> list.remove(e.getId()));
	}
	
	public List<TODO> getTodo(){
		return list;
	}
}
