import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetialerdashboardComponent } from './retialerdashboard.component';

describe('RetialerdashboardComponent', () => {
  let component: RetialerdashboardComponent;
  let fixture: ComponentFixture<RetialerdashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RetialerdashboardComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetialerdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
