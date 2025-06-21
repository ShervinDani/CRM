import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetailerheaderComponent } from './retailerheader.component';

describe('RetailerheaderComponent', () => {
  let component: RetailerheaderComponent;
  let fixture: ComponentFixture<RetailerheaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RetailerheaderComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetailerheaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
