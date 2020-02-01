import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators } from '@angular/forms';
import {FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-validation',
  templateUrl: './validation.component.html',
  styleUrls: ['./validation.component.css']
})
export class AssignComponent implements OnInit {

  assignform : FormGroup;
  submitted = false;
  invalid = false;
  constructor(private formBuilder: FormBuilder) { }

  onsubmit(){
    this.submitted = true;
   if(this.assignform.invalid){
     return;
   }else{
    this.invalid = true;
  }
 }

  ngOnInit() {
    this.assignform = this.formBuilder.group({
      name: ['',Validators.required],
      mobile : ['',Validators.maxLength(10)],
      email:['',Validators.email],
      password: ['',[ Validators.required,  Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')]]
    });
  }

}
