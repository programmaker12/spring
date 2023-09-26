import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ShoppingService {
  shop() {
    throw new Error('Method not implemented.');
  }
  registerShop(value: any) {
    throw new Error('Method not implemented.');
  }

  constructor(private http: HttpClient) { }
  API = 'http://localhost:8084'
  // From here the Customer starts
  public registerCustomer(CustomerData:any){
    return this.http.post(this.API+'/customerdetails', CustomerData);
  }

  public customer()
  {
    return this.http.get(this.API+'/customer')
  }

  // From here the Order starts
  // public registerOrder(OrderData:any){
  //   return this.http.post(this.API+'/customer/order', OrderData);
  // }

  // public order()
  // {
  //   return this.http.get(this.API+'/customer/placeorder')
  // }




  // From here the Employee starts
  public registerOrder(OrderData:any){
    return this.http.post(this.API+'/orderdetails/mentionorder', OrderData);
  }

  public order()
  {
    return this.http.get(this.API+'/orderdetails')
  }

  // From here the Employee starts
  public registerEmployee(EmployeeData:any){
    return this.http.post(this.API+'/employeedetails', EmployeeData);
  }

  public employee()
  {
    return this.http.get(this.API+'/employee')
  }

  // From here the Shop starts

  public registerShops(ShopData:any) {
    return this.http.post(this.API+'/shopdetails/mentionshop', ShopData)
  }

  public shops() {
    return this.http.get(this.API+'/shopdetails')
  }



  // From here the Shop starts
  // public registerShop(ShopData:any){
  //   return this.http.post(this.API+'/employeedetails/shopdetails', ShopData);
  // }

  // public shop()
  // {
  //   return this.http.get(this.API+'/employee/shop')
  // }
}
