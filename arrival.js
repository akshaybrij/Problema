function arrival(){
}
arrival.prototype.sched=function(arr,dep){
  var count=0;
  for(var i=0;i<dep.length;i++){
     if(dep[i]-arr[i]>0 && arr[i+1]-dep[i]<0){
       count+=1;
     }
  }
    console.log(count);
}
var s=new arrival();
var arr = [900, 940, 950, 1100, 1500, 180];
var dep = [910, 1200, 1120, 1130, 1900, 2000];
s.sched(arr,dep);
