import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { Message } from 'src/app/Model/Message';
import { MessageService } from 'src/app/Service/message.service';


@Component({
  selector: 'app-chat-box',
  templateUrl: './chat-box.component.html',
  styleUrls: ['./chat-box.component.css']
})
export class ChatBoxComponent implements OnInit {

  message: Message;
  response: Message[];
  history: Message[][];

  constructor(private route: ActivatedRoute,
              private router: Router,
              private messageService: MessageService) {
    this.history = [];
  }

  ngOnInit() {
    //We start the conversation automatically when entering
    let message = new Message();
    message.text = "hello";
    this.messageService.sendMessage(message).subscribe(result => {
      this.response = result;
      this.response.map(x => x.owner = "Watson");
      this.history.push(this.response);
    });

  }

  onSubmit(query: string) {

    this.message = new Message();
    this.message.response_type = 'text';
    this.message.text = query;
    this.message.owner = 'User';

    this.history.push([this.message]);

    this.messageService.sendMessage(this.message).subscribe(result => {

      this.response = result;
      this.response.map(x => x.owner = "Watson");
      this.history.push(this.response);
      console.log(this.history);
    });

  }

}
