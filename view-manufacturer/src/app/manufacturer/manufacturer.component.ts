import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-manufacturer',
  templateUrl: './manufacturer.component.html',
  styleUrls: ['./manufacturer.component.css']
})
export class ManufacturerComponent implements OnInit {

  mfr: string;
  mfrInfo: any;
  mfrCol = ['Mfr-ID', 'Mfr-Name', 'City', 'State', 'Country' ];
  mfrString = ['Mfr_ID', 'Mfr-Name', 'City', 'State', 'Country' ];

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getManufacturerInfo() {
    this.http.get('https://vpic.nhtsa.dot.gov/api/vehicles/GetManufacturerDetails/' + this.mfr + '?format=json')
      .subscribe((response: any) => {
        this.mfrInfo = response.Results;
        console.log(this.mfrInfo);
    });
  }
}
