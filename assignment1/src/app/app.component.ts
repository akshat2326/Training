import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  data: object;

  // tslint:disable-next-line: use-lifecycle-interface
  ngOnInit() {
    this.data =  [
    {
      employeeId: 1,
      employeeName: 'Disha',
      employeeSalary: 10000000000,
      employeeDepartment: 'Operations'
    },
    {
      employeeId: 2,
      employeeName: 'Akshat',
      employeeSalary: 10000000000,
      employeeDepartment: 'Software Development'
    },
    {
      employeeId: 3,
      employeeName: 'Ronu',
      employeeSalary: 10000000000,
      employeeDepartment: 'Operations'
    }
  ];
 }

}

