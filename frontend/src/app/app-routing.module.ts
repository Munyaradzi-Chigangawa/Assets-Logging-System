import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageNotFoundComponent } from './reusable/page-not-found/page-not-found.component';

const routes: Routes = [
  {
    path: '', 
    redirectTo: 'admin', 
    pathMatch: 'full'
 },
  { path : 'admin', loadChildren: ()=> 
import('../app/admin/admin.module').then(mod => mod.AdminModule)
},
{ path : '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
