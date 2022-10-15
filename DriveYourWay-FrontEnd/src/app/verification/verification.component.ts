import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';
import {Router} from "@angular/router"
import { User } from 'src/app/common/user';
import { FormBuilder, FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-verification',
  templateUrl: './verification.component.html',
  styleUrls: ['./verification.component.css']
})
export class VerificationComponent implements OnInit {
  username:string = localStorage.getItem('username');

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

        return a.username === this.username && a.password === this.loginForm.value.password   
      })
      if(user){
        alert ("Verification Succesful!"); 
 
        console.log("YES");
   
        window.location.replace('/update-product/{{ tempProduct.id }}'); 
      }else{
        alert("Wrong Credentials!")
      }
    }
    )
    
  }

}