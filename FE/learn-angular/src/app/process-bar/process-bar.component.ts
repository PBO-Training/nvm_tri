import { Component, Input, OnChanges, OnInit, SimpleChange, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-process-bar',
  templateUrl: './process-bar.component.html',
  styleUrls: ['./process-bar.component.scss']
})
export class ProcessBarComponent implements OnInit, OnChanges {
  @Input() progress = 0;
  @Input() processColor: string;
  @Input() backgroupColor: string;
  constructor() { }
  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes)
    if ("progress" in changes) {
      if (typeof changes["progress"].currentValue !== "number") {
        const progress = Number(changes["progress"].currentValue);
        if (Number.isNaN(progress)) {
          this.progress = 0
        } else {
          this.progress = progress;
        }
      }
    }
  }

  ngOnInit(): void {
  }


}
