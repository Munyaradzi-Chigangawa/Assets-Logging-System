import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditProjectorComponent } from './edit-projector.component';

describe('EditProjectorComponent', () => {
  let component: EditProjectorComponent;
  let fixture: ComponentFixture<EditProjectorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditProjectorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditProjectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
