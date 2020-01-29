import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  storedArray = [];
  onData(rows) {
    this.storedArray.push(rows);
  }
}
