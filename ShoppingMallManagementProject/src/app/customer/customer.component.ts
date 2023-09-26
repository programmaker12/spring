import { Component, Inject } from '@angular/core';
import { ShoppingService } from '../shopping.service';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
@Inject(ShoppingService)
export class CustomerComponent {
    getcustomerDetails = null as any;
  constructor(private shoppingService: ShoppingService) {
     this.customerDetails();
  }

  register(registerForm: NgForm) {
    this.shoppingService.registerCustomer(registerForm.value).subscribe(
      
        (resp) => { 
          console.log(resp);
          registerForm.reset();
          this.customerDetails();
          
        },
  
        (err) => {
          console.log(err);
          
        }
    );

      
  }

  customerDetails() {
    this.shoppingService.customer().subscribe(
      (resp) => {
        console.log(resp);
        this.getcustomerDetails = resp;
        
      },

      (err) => {
        console.log(err);
        
        
      }
    )
  }
}


// function customerDetails() {
//   throw new Error('Function not implemented.');
// }

