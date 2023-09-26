import { Component, Inject } from '@angular/core';
import { ShoppingService } from '../shopping.service';
import { NgForm } from '@angular/forms';
@Inject(ShoppingService)
@Component({
  selector: 'app-employee-shop',
  templateUrl: './employee-shop.component.html',
  styleUrls: ['./employee-shop.component.css']
})
export class EmployeeShopComponent {

  getshopDetails = null as any;
  constructor(private shoppingService: ShoppingService) {
     this.shopDetails();
  }

  register(registerShop: NgForm) {
    this.shoppingService.registerShop(registerShop.value)

      
  }

  shopDetails() {
    this.shoppingService.shop()
  }
}
