import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserapicallsService {
  private getALl: string = "http://localhost:9090/crm/user/api/getallplans"
  constructor(private http : HttpClient) { }

  getAllPlans() : Observable<any>{
    return this.http.get(this.getALl);
  }

}
