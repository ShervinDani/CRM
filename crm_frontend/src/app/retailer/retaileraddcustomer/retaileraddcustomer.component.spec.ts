import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetaileraddcustomerComponent } from './retaileraddcustomer.component';

describe('RetaileraddcustomerComponent', () => {
  let component: RetaileraddcustomerComponent;
  let fixture: ComponentFixture<RetaileraddcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RetaileraddcustomerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetaileraddcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
