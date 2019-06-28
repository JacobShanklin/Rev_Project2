import { Component, OnInit, Input } from '@angular/core';
import { faThumbsUp } from '@fortawesome/free-solid-svg-icons';
import { IPost } from '../services/Post';

@Component({
  selector: 'app-post-card',
  templateUrl: './post-card.component.html',
  styleUrls: ['./post-card.component.css']
})
export class PostCardComponent implements OnInit {
  @Input() post: IPost;
  faThumbsUp = faThumbsUp;
  constructor() {

  }

  ngOnInit() {
  }

}
