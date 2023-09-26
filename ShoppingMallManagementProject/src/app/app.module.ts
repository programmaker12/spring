import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { Routes, RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { OrdersComponent } from './orders/orders.component';
import { EmployeeShopComponent } from './employee-shop/employee-shop.component';
import { HttpClientModule } from '@angular/common/http';
import { OrderDetailsComponent } from './order-details/order-details.component';
import { ShopComponent } from './shop/shop.component';

const appRoutes: Routes = [
  {path:'customer', component: CustomerComponent},
  {path:'employee', component: EmployeeComponent},
  {path: 'orderdetails', component: OrderDetailsComponent},
  {path: 'shop', component: ShopComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    EmployeeComponent,
    OrdersComponent,
    EmployeeShopComponent,
    OrderDetailsComponent,
    ShopComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
