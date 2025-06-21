import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetailerrechargeComponent } from './retailerrecharge.component';

describe('RetailerrechargeComponent', () => {
  let component: RetailerrechargeComponent;
  let fixture: ComponentFixture<RetailerrechargeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RetailerrechargeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetailerrechargeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
