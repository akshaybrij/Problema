function Solve(){
}
  var o=0;
function swap(val,k){
  var temp=val[o];
  val[o]=val[k];
  val[k]=temp;
  o+=1;
}
Solve.prototype.substr=function(val){
  var maxstr="";
  for(var i=0;i<str.length;i++){
    if(val[i]+val[i+1]==val[i+2]+val[i+3]){
    }
  }
}
Solve.prototype.evenodd=function(val){
  var j=0;
  var cnt=0;
  var min;
  while(j<val.length){
    if(val[j]%2==0){
      cnt+=1;
    }
    j+=1;
  }
  for(var k=0;k<val.length;k++){
    if(val[k]%2==0){
       swap(val,k)
    }
  }
      for(var z=0;z<cnt-1;z++){
        if(val[z]>val[z+1]){
          var temp=val[z];
          val[z]=val[z+1];
          val[z+1]=temp;
        }
      }
       for(var k=cnt;k<val.length;k++){
         for(var z=cnt;z<val.length;z++){
           if(val[z]>val[z+1]){
             temp=val[z];
             val[z]=val[z+1];
             val[z+1]=temp;
           }
         }
         }
       return val;
}
Solve.prototype.toBinary=function(val){
  var stack=[];
  var i=0;
  while(val>0){
    stack[i]=val;
    val=Math.floor(val/2);
    i+=1;
  }
  console.log(stack);
  i=0;
  while(i<stack.length){
    stack[i]=stack[i]%2;
    i+=1;
  }
  console.log(stack);
  var str="";
  for(var i=stack.length-1;i>=0;i--){
    str=str.concat(stack[i]);
  }
  return str;
}
var s=new Solve();
var str="1538023";
var f=[1, 4, 3, 5, 2, 7, 10];
var result=s.evenodd(f);
console.log(result);
var b=23;
var bin=s.toBinary(b)
console.log("Binary representation"+" "+bin);
