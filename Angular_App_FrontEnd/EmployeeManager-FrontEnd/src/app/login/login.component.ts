import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../classes/user';
import { RegistrationService } from '../services/registration.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user =new User();
  msg='';

  constructor( private _service:RegistrationService, private _router:Router) { }

  ngOnInit(): void {
  }

  loginUser(){
    this._service.loginUserFromRemote(this.user).subscribe(
      data =>{
        console.log("response received");
        this._router.navigate (['/employee'])
    },
      error=>{
        console.log("exception occurred");
        this.msg="Bad credentials, please enter valid emailid and password..";
    }
    )

  }

  gotoRegistration(){
    console.log("Navigating to registration..");
    this._router.navigate (['/registration'])
  }

}
