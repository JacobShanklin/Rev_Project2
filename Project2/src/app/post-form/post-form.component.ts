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
<<<<<<< HEAD
  username: string;
=======
>>>>>>> e3da58a23506e152cd158510e860d04157a2b310
=======

  username: string;

>>>>>>> c1f1a74a0ebf0f99ab0d01f2d083e8fe73906d0b
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
<<<<<<< HEAD
=======
>>>>>>> c1f1a74a0ebf0f99ab0d01f2d083e8fe73906d0b

      username: this.username,
      text: this.postText

<<<<<<< HEAD
=======
=======
>>>>>>> c1f1a74a0ebf0f99ab0d01f2d083e8fe73906d0b
      user: this.currentUser,
      post: this.postText,
      rating: {
        likes: 0,
        dislikes: 0
      }
<<<<<<< HEAD
>>>>>>> e3da58a23506e152cd158510e860d04157a2b310
=======

>>>>>>> c1f1a74a0ebf0f99ab0d01f2d083e8fe73906d0b
    };

    console.log(this.post);

    this.postsService.addPost(this.post);

  }
}
