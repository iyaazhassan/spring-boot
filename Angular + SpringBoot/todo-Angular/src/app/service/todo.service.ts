import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class todo{
  constructor(
    public _id:string,
    public description:string,
    public completed:string
  ){}
}
export class todo1{
  constructor(
    public description:string,
    public completed:string
  ){}
}
@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private httpClient:HttpClient) { }

  getTodos(){
    return this.httpClient.get<todo[]>("http://localhost:8050/todo-service/api/todos")
  }

  createTodo(todo){
    return this.httpClient.post<todo>("http://localhost:8050/todo-service/api/todos",todo)
  }

  deleteTodo(todo){
    return this.httpClient.delete("http://localhost:8050/todo-service/api/todos/"+todo._id)
  }
  
}
