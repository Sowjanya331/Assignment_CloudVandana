function reverseStr(str) {
    let newString = "";
    for (let i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    return newString;                             
}
console.log(`Reversed string is : ${reverseStr('javascript is a language')}`)
