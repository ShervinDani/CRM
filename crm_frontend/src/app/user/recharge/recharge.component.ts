import { Component, OnInit } from '@angular/core';
import { UserapicallsService } from '../../service/userapicalls.service';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-recharge',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './recharge.component.html',
  styleUrl: './recharge.component.css'
})
export class RechargeComponent implements OnInit{

  data:any;
  constructor(private http: UserapicallsService){}
  ngOnInit(): void {
    this.http.getAllPlans().subscribe({
      next: (res)=> {
        this.data = res;
      },
      error: (err) => {
        console.log(err);
      }
    })
  }

  setPlan(plan: any)
  {
    sessionStorage.setItem("plan",plan);
  }

}
