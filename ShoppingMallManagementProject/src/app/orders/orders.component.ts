import { Component, Inject } from '@angular/core';
import { ShoppingService } from '../shopping.service';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
@Inject(ShoppingService)
export class OrdersComponent {
  getorderDetails = null as any;
  constructor(private shoppingService: ShoppingService) {
     this.orderDetails();
  }

  register(registerForm: NgForm) {
    this.shoppingService.registerOrder(registerForm.value).subscribe(
      
        (resp) => { 
          console.log(resp);
          registerForm.reset();
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
