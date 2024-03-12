import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Placement } from './placement.model';

@Injectable({
  providedIn: 'root'
})
export class PlacementService {

  constructor(private httpClient:HttpClient) { }

  apiURL="http://localhost:8080/placement"

  createCollege(placement:Placement):Observable<Placement>
  {
    return this.httpClient.post<Placement>(this.apiURL,placement);
  }

  retrieveCollege():Observable<Placement[]>
  {
    return this.httpClient.get<Placement[]>(this.apiURL);
  }



  updateCollege(id:number, placement:Placement):Observable<Placement>
  {
    return this.httpClient.put<Placement>(this.apiURL+'/'+id, placement);
  }

  deleteCollegeById(id:number)
  {
    return this.httpClient.delete(this.apiURL+'/'+id);
  }

}
