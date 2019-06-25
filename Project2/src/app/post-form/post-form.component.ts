import { Component, OnInit } from '@angular/core';
import { IPost } from '../services/Post';
import { PostService } from '../services/post.service';
import { Subscription } from 'rxjs';
import { IUser } from '../services/User';
import { AuthenticationService } from '../services';

@Component({
  selector: 'app-post-form',
  templateUrl: './post-form.component.html',
  styleUrls: ['./post-form.component.css']
})
export class PostFormComponent implements OnInit {
  postText: string;
  post: IPost;
<<<<<<< HEAD
  username: string;
=======
>>>>>>> e3da58a23506e152cd158510e860d04157a2b310
  subscription: Subscription;
  currentUser: IUser;
  constructor(private postsService: PostService, private userService: AuthenticationService) {
    this.subscription = this.userService.currentUser.subscribe(user => {
      if (user) {
        this.currentUser = user;
      } else {
        this.currentUser = null;
      }
    });
  }

  ngOnInit() {
  }

  setPost() {
    this.post = {
<<<<<<< HEAD

      username: this.username,
      text: this.postText

=======
      user: this.currentUser,
      post: this.postText,
      rating: {
        likes: 0,
        dislikes: 0
      }
>>>>>>> e3da58a23506e152cd158510e860d04157a2b310
    };

    console.log(this.post);

    this.postsService.addPost(this.post);

  }
}
