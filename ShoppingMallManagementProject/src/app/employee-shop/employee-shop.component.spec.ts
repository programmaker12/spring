import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeShopComponent } from './employee-shop.component';

describe('EmployeeShopComponent', () => {
  let component: EmployeeShopComponent;
  let fixture: ComponentFixture<EmployeeShopComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EmployeeShopComponent]
    });
    fixture = TestBed.createComponent(EmployeeShopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
