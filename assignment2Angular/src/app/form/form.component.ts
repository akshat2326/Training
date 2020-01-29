import { Component, OnInit, Output, EventEmitter  } from '@angular/core';


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  @Output() data = new EventEmitter();
  id = '';
  name = '';
  salary = '';
  dept  = '';

  constructor() { }
  onAdd() {
   const rows = {
      id : this.id,
      name : this.name,
      salary : this.salary,
      dept : this.dept
      };


      // console.log(">>>>",rows);
   this.data.emit(rows);
  }

  ngOnInit() {
  }


}
