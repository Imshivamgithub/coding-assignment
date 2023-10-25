
let inputString = prompt("Please ! Write your sentence here ");

function revString(str) {
let revStr = " " ;
let strArr  = str.split(" ");
    console.log(strArr);
let revArr  =  strArr.map(revWord) ;
    console.log(revArr);

  revStr = revArr.join(" ");
   console.log(revStr) ; 
    alert("Reversed sentence : "+revStr);
}

function revWord(arr) {
    let newStr = " " ;
     for (let index = arr.length-1; index >= 0 ; index--) {
         newStr += arr[index] ;
     } 
   return  newStr ;
} 
  revString(inputString);
