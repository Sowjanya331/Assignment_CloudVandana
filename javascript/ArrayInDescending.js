const arr = [300,64,73,21,99,8666]; 
function arrSort(arr) { 
    arr.sort((a,b)=>a-b); 
    arr.reverse(); 
    return arr; 
} 
console.log(arrSort(arr));
