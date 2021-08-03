import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

import { Room } from '../room';
import { RoomService } from './../room.service';

@Component({
  selector: 'app-create-room',
  templateUrl: './create-room.component.html',
  styleUrls: ['./create-room.component.css']
})
export class CreateRoomComponent implements OnInit {

  room: Room = new Room();
  submitted = false;

  constructor(private roomService: RoomService,
              private router: Router) {

               }

  ngOnInit(): void {
  }

  newRoom(): void{
    this.submitted = false;
    this.room = new Room();
  }

  save(){
    this.roomService.createRoom(this.room)
    .subscribe(data => console.log(data),
    error => console.log(error));
    this.room = new Room();
    this.goToList();
  }

  onSubmit(){
    this.submitted = true;
    this.save();
  }

  goToList(){
    this.router.navigate(['/rooms']);
  }
}
