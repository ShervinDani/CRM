import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetailerpaymentComponent } from './retailerpayment.component';

describe('RetailerpaymentComponent', () => {
  let component: RetailerpaymentComponent;
  let fixture: ComponentFixture<RetailerpaymentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RetailerpaymentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetailerpaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
