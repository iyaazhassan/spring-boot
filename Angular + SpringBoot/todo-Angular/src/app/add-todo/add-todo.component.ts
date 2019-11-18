import { Component, OnInit } from '@angular/core';
import { todo, TodoService, todo1 } from '../service/todo.service';

@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {

  constructor(private todoService:TodoService) { }

  todo:todo1= new todo1("","")
  ngOnInit() {
  }

  createTodo(){
    this.todoService.createTodo(this.todo).subscribe(response=>{
      alert("Todo Created Successfully")
    })

  }

}
