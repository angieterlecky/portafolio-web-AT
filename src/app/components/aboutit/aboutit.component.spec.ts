import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutitComponent } from './aboutit.component';

describe('AboutitComponent', () => {
  let component: AboutitComponent;
  let fixture: ComponentFixture<AboutitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AboutitComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AboutitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
