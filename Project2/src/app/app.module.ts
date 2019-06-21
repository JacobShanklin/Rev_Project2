import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { CurrentUserService } from './services/current-user.service';

import { SidebarComponent } from './sidebar/sidebar.component';
import { PostFormComponent } from './post-form/post-form.component';
import { PostService } from './services/post.service';
import { UsercardComponent } from './usercard/usercard.component';

import { ResetPasswordComponent } from './reset-password/reset-password.component';

import { fakeBackendProvider } from './_helpers';
import { AuthGuard } from './_helpers';
import { JwtInterceptor, ErrorInterceptor } from './_helpers';
<<<<<<< HEAD
=======
import { EditProfileComponent } from './edit-profile/edit-profile.component';
import { ProfileComponent } from './profile/profile.component';
>>>>>>> 525d736429b02419ba962970baa0b3d26cd61364
import { PostFeedComponent } from './post-feed/post-feed.component';
import { PostCardComponent } from './post-card/post-card.component';
import { InfiniteScrollModule } from 'ngx-infinite-scroll';


@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    NavbarComponent,
    LoginComponent,
    ResetPasswordComponent,
    SidebarComponent,
    PostFormComponent,
    UsercardComponent,
<<<<<<< HEAD
=======
    EditProfileComponent,
    ProfileComponent,
>>>>>>> 525d736429b02419ba962970baa0b3d26cd61364
    PostFeedComponent,
    PostCardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    InfiniteScrollModule,
    RouterModule.forRoot([
      { path: '', component: PostFormComponent, canActivate: [AuthGuard] },
      { path: 'register', component: RegisterComponent },
      { path: 'resetpassword', component: ResetPasswordComponent},
      { path: 'login', component: LoginComponent },
<<<<<<< HEAD
      { path: 'post', component: PostFormComponent, canActivate: [AuthGuard] },
=======
      { path: 'post', component: PostFormComponent, canActivate: [AuthGuard]},
      { path: 'profile/:id', component: ProfileComponent, canActivate: [AuthGuard]},
>>>>>>> 525d736429b02419ba962970baa0b3d26cd61364
      { path: 'feed', component: PostFeedComponent }

    ])
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
    { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },
    CurrentUserService, PostService, fakeBackendProvider],
  bootstrap: [AppComponent]
})
export class AppModule { }
