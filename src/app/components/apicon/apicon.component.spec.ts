import { ComponentFixture, TestBed } from '@angular/core/testing';

import { APiconComponent } from './apicon.component';

describe('APiconComponent', () => {
  let component: APiconComponent;
  let fixture: ComponentFixture<APiconComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ APiconComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(APiconComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
