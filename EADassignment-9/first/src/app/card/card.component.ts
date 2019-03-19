import { Component, OnInit } from '@angular/core';
import { user_array } from '../../mock_user';
import { User } from '../user';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  array_of_user = user_array;
  selecetedUser : User;
  constructor() { }

  ngOnInit() {
  }
  onSelect(user : User):void
  {
  this.selecetedUser = user;
  }
}
