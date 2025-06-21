import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserapicallsService {
  private getAll: string = "http://localhost:9090/crm/user/api/getallplans";
  private getCustomer: string = "http://localhost:9090/crm/user/api/getcustomer";
  private getCustomerCurrentPlan: string = "http://localhost:9090/crm/user/api/getcustomercurrentplan"
  constructor(private http : HttpClient) { }

  getAllPlans() : Observable<any>{
    return this.http.get(this.getAll);
  }

  getCustomerById(customerId: number) : Observable<any>{
    const url = `${this.getCustomer}?customerId=${customerId}`;
    return this.http.get(url);
  }
  
  getCustomerCurrentPlanById(customerId: number) : Observable<any>{
    const url = `${this.getCustomerCurrentPlan}?customerId=${customerId}`;
    return this.http.get(url);
  }

}
