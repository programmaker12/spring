import { Component, Inject } from '@angular/core';
import { ShoppingService } from '../shopping.service';
import { NgForm } from '@angular/forms';
@Inject(ShoppingService)
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  getemployeeDetails = null as any;
  constructor(private shoppingService: ShoppingService) {
    this.employeeDetails();
 }

 register(registerForm: NgForm) {
  this.shoppingService.registerEmployee(registerForm.value).subscribe(
    
      (resp) => { 
        console.log(resp);
        registerForm.reset();
        this.employeeDetails();
        
      },

      (err) => {
        console.log(err);
        
      }
  );

    
}

employeeDetails() {
  this.shoppingService.employee().subscribe(
    (resp) => {
      console.log(resp);
      this.getemployeeDetails = resp;
      
    },

    (err) => {
      console.log(err);
      
      
    }
  )
}
}
