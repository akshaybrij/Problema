function toSubString(val){
  var ac=0;
  var bc=0;
  var cc=0;
  for(var i=0;i<val.length;i++){
    if(val[i]=='a'){
      ac=(1+2*ac);
    }
    else if(val[i]=='b'){
      bc=(ac+2*bc)
    }
    else if(val[i]=='b'){
      cc=(bc+2*cc)
    }
  }
return cc;
}
var c=toSubString("abbc");
console.log(c);
