import { Component, OnInit } from '@angular/core';
import { TodoService, todo } from '../service/todo.service';
import { TouchSequence } from 'selenium-webdriver';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos:todo[];
  constructor(private todoService:TodoService) { 

    this.todoService.getTodos().subscribe(response=>{this.todos=response;})
  }

  ngOnInit() {
    
  }

  deleteTodo(todo){
    this.todoService.deleteTodo(todo).subscribe();
    this.todoService.getTodos().subscribe(response=>{this.todos=response;})
  }

}
