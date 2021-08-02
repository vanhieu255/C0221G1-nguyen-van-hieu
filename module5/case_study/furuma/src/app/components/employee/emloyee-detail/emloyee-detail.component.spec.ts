import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmloyeeDetailComponent } from './emloyee-detail.component';

describe('EmloyeeDetailComponent', () => {
  let component: EmloyeeDetailComponent;
  let fixture: ComponentFixture<EmloyeeDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmloyeeDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmloyeeDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
