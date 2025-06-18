import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-payment',
  imports: [],
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css'
})
export class PaymentComponent implements OnInit{

  plan: any;

  ngOnInit(): void {
    this.plan = JSON.parse(sessionStorage.getItem("plan") || '{}');
    console.log(this.plan)
  }

}
