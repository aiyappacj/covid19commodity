import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from 'src/app/Service/api.service';
import { PageClient } from 'src/app/Model/PageClient';

@Component({
  selector: 'app-search',
  templateUrl: './search-item.component.html',
  styleUrls: ['./search-item.component.css']
})
export class SearchItemComponent implements OnInit {
  
  clients : any[];
  pageClient : PageClient ;
  selectedPage : number = 0;
  auth: string;
  searchText;
  
  getClient(): void {
    this.getOrderList();
  }

  getOrderList() {
    this.api.getProducts(this.auth).subscribe(res => {
      this.clients = res.oblist;
    });
  }

  getPageClient(page:number): void {
    this.api.getPageClient(page,this.auth)
        .subscribe(page => this.pageClient = page)
  
  }
  constructor(private route: Router, private api: ApiService) { 

  }
  onSelect(page: number): void {
    console.log("selected page : "+page);
    this.selectedPage=page;
    this.getPageClient(page);
    //this.route.navigate(['/admin/search']);
  }
  ngOnInit() {
     //this.getClient();
     this.auth = this.api.getToken();
     this.getPageClient(0);
  }

}