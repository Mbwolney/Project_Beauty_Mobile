import { TestBed } from '@angular/core/testing';

import { LoginsalaoService } from './loginsalao.service';

describe('LoginsalaoService', () => {
  let service: LoginsalaoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoginsalaoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
