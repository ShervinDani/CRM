import { Component, OnInit } from '@angular/core';
import { UserapicallsService } from '../../service/userapicalls.service';

@Component({
  selector: 'app-userdetails',
  imports: [],
  templateUrl: './userdetails.component.html',
  styleUrl: './userdetails.component.css'
})
export class UserdetailsComponent implements OnInit {

  constructor(private service: UserapicallsService){}
  ngOnInit(): void {

    this.service.getCustomerCurrentPlanById(1).subscribe({
      next: (res) => {
        console.log(res);
      },
      error: (err) => {
        console.log(err);
      }
    })

  }


  


}
