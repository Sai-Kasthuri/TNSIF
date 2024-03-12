import { Component, OnInit } from '@angular/core';
import { Placement } from './placement.model';
import { PlacementService } from './placement.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-placement',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './placement.component.html',
  styleUrl: './placement.component.css'
})
export class PlacementComponent implements OnInit{
 
  constructor(private placementService:PlacementService){}
  ngOnInit(): void {
    this.retrieveCollege();
  }

  newPlacement:Placement={name:"", address:"", accreditation:"", establishedDate:""};
  placementList:Placement[]=[];
  editingPlacement:Placement|null=null;
  updatePlacement:Placement={name:"", address:"", accreditation:"", establishedDate:""}

  createCollege()
  {
    this.placementService.createCollege(this.newPlacement).subscribe(result=>{
      this.placementList.push(result);
    });
    this.newPlacement={name:"", address:"", accreditation:"", establishedDate:""};
  }

  retrieveCollege()
  {
    this.placementService.retrieveCollege().subscribe(result=>{this.placementList=result});
    
  }

  editCollege(editPlacement:Placement)
  {
    this.editingPlacement=editPlacement;
    this.updatePlacement={...editPlacement}
  }

  updateCollege()
  {
    this.placementService.updateCollege(this.editingPlacement!.id!, this.updatePlacement).subscribe(result=>{
    const index=this.placementList.findIndex((placement)=>placement.id==this.editingPlacement!.id);
    
      if(index!==-1)
      {
        this.placementList[index]=result;
      }
  });
    this.updatePlacement={name:"", address:"", accreditation:"", establishedDate:""};
  }

  deleteCollegeById()
  {
    this.placementService.deleteCollegeById(this.editingPlacement!.id!).subscribe(()=>
    {
      this.retrieveCollege();
    }

    );
  }

}
