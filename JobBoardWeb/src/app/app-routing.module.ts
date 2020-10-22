import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { JobsComponent } from './job/jobs/jobs.component';
import { ViewProfileComponent } from './profile/view-profile/view-profile.component';

const routes: Routes = [
  { path:'', component:JobsComponent },
  { path:'profile', component: ViewProfileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
