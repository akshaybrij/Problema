function kelements(val,k){
  for(var i=0;i<val.length;i++){
    for(var j=0;j<val.length;j++){
      if(val[j]<val[j+1]){
        var temp=val[j];
        val[j]=val[j+1];
        val[j+1]=temp;
      }
    }
  }
  var res=[];
  for(var z=0;z<k;z++){
    res[z]=val[z];
  }
  return res;
}
var m=[1, 23, 12, 9, 30, 2, 50];
var k=3
var r=kelements(m,k);
console.log(r)
