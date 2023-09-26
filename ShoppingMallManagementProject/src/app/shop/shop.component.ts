import { Component, Inject } from '@angular/core';
import { ShoppingService } from '../shopping.service';
import { NgForm } from '@angular/forms';
@Inject(ShoppingService)
@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css']
})
export class ShopComponent {
  status = [
    {value:'1', viewvalue:'Open'},
    {value:'2', viewvalue:'Closed'},
  ]
  category1 = [
    {value:'1', viewvalue:'Wholesale'},
    {value:'2', viewvalue:'Commercial'}
  ];
  getshopDetails = null as any;
  constructor(private shoppingService: ShoppingService) {
    this.shopDetails();
 }

 shops(registerShops: NgForm) {
  this.shoppingService.registerShops(registerShops.value).subscribe(
    
      (resp) => { 
        console.log(resp);
        registerShops.reset();
        this.shopDetails();
        
      },

      (err) => {
        console.log(err);
        
      }
  );

    
}

shopDetails() {
  this.shoppingService.shops().subscribe(
    (resp) => {
      console.log(resp);
      this.getshopDetails = resp;
      
    },

    (err) => {
      console.log(err);
      
      
    }
  )
}
}
