import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewProjectorComponent } from './view-projector.component';

describe('ViewProjectorComponent', () => {
  let component: ViewProjectorComponent;
  let fixture: ComponentFixture<ViewProjectorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewProjectorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewProjectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
