import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-retailerheader',
  imports: [RouterOutlet],
  templateUrl: './retailerheader.component.html',
  styleUrl: './retailerheader.component.css'
})
export class RetailerheaderComponent {
  constructor(private router: Router){}
  changeComponent(component: string){
    this.router.navigate([component])
  }
}
