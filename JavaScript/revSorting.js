function sortDesc() {
    var arr = [12, 25, 10,40,50]; 
      let temp = 0;
       for (let i = 0; i < arr.length; i++){
         for (let j = i+1; j < arr.length; j++) {
            if (arr[i]<arr[j]) {
                temp= arr[i];
                arr[i] = arr[j];
                arr[j]= temp ;
            } 
         }   
       }
       console.log(arr); // [50, 40,25,12,10]
   }
 
   sortDesc();