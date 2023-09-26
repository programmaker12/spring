import { Component, Inject } from '@angular/core';
import { ShoppingService } from '../shopping.service';
import { NgForm } from '@angular/forms';
@Inject(ShoppingService)
@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent {
  getorderDetails = null as any;
  constructor(private shoppingService: ShoppingService) {
    this.orderDetails();


 }
 
 order(orderForm:NgForm) {
  this.shoppingService.registerOrder(orderForm.value).subscribe(
    
    (resp) => { 
      console.log(resp);
      orderForm.reset();
      this.orderDetails();
      
    },

    (err) => {
      console.log(err);
      
    }
);
 }


 orderDetails() {
  this.shoppingService.order().subscribe(
    (resp) => {
      console.log(resp);
      this.getorderDetails = resp;
      
    },

    (err) => {
      console.log(err);
      
      
    }
  )
}
}
