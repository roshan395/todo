package com.roshan.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList();
	private static int todoCount = 0;
	static {
		todos.add(new Todo(++todoCount,"roshan", "learn spring", 
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount,"ronak", "learn azure", 
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount,"roshan", "learn angular", 
				LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodod(String username, String description, 
			LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todoCount, username, description, targetDate, done);
		todos.add(todo);
	}

}
