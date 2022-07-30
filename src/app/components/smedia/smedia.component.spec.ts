import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SmediaComponent } from './smedia.component';

describe('SmediaComponent', () => {
  let component: SmediaComponent;
  let fixture: ComponentFixture<SmediaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SmediaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SmediaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
