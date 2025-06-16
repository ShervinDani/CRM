import { TestBed } from '@angular/core/testing';

import { UserapicallsService } from './userapicalls.service';

describe('UserapicallsService', () => {
  let service: UserapicallsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserapicallsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
