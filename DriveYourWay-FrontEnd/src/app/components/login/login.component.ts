import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';
import {Router} from "@angular/router"
import { User } from 'src/app/common/user';
import { FormBuilder, FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
  username:string = localStorage.getItem('username');
  user:User = new User();
  user2:User = new User();

  users: Array<User> = new Array();
  
  username_value:string;

  loginForm!:FormGroup;
  constructor(private formBuilder:FormBuilder, private _http:HttpClient,private router: Router,private loginService: LoginService,   ) { }

  ngOnInit(): void {
    this.loginForm= this.formBuilder.group({
      username:[''],
      password:['']
    })
  }


  handleLogin() {

    this._http.get<any>("http://localhost:9090/api/v1/users").subscribe(res=>{
      const user =res.find((a:any)=>{
        return a.username === this.loginForm.value.username && a.password === this.loginForm.value.password   
      })
      if(user){
        alert ("Login Succesful!"); 
        localStorage.setItem('username', this.user.username);
 
        console.log("YES");
   
        window.location.replace('/products'); 
      }else{
        alert("Wrong Credentials!")
      }
    }
    )
    this.loginService.getUser(this.user.username).subscribe(
      data => {
       this.users = data; 
        
      }
      ,error => console.log(error));
   

  }
  onSubmit(){
    console.log(this.user);
     
    this.handleLogin();
  }


}