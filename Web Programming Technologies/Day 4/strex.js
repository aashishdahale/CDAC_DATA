  
  /*
let str = 'parade' //primitive string type
console.log(typeof(str))
*/
/*
let st2 = new String('marching')
console.log(typeof(st2)) //object 
*/
/*
let str2 = 'parade'
let str3 = new String('parade')
let str4 = new String("marching")
let str5 = new String('parade')


//if(str3 == str5)   // object reference are compared
//if(str2 == str3)  //str3 is converted to string type 
if(str2 === str3) //this first checks type equality only then proceed
console.log("same")
else
console.log('different') 
*/
/*
str1="light"
str2= new String("light")
str4= new String("light")
// primitive values are checked
//if(str2.valueOf() == str4.valueOf() )
if(str1== str2)
console.log("same")
else
console.log('different') 
*/
/*
//references are checked
if(st2 == str4)
console.log("same")
else
console.log('different') 
*/
/*
var name1='prachi'
var city='pune'
var s = `hello ${name1} , Welcome to ${city}`
var s1 = "hello "+name1+" , Welcome to " + city

console.log(s,"\n",s1)
console.log(s.charAt(3))
console.log(s.length)
console.log(s.concat(' hope','you are','good'))  //s is immutable
console.log(s.toUpperCase())
console.log(s.toLowerCase())
console.log(s.slice(3,10))
console.log(s.substring(3,10))
console.log(s.split(' '))
console.log(s.split('e'))
console.log(s.endsWith('e',17))
console.log(s.endsWith('e'))

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number
let s = new String('prudent')

console.log(s.toUpperCase(),s.charAt(0),s.indexOf('u'))

let s1= 'prudent'
let s2 = new String("prudent")
if(s==s2)
console.log("same")
else
console.log('different')

if(s.valueOf()==s2.valueOf())
console.log("same")
else
console.log('different')

let me='prachi'
console.log(`the length of ${me} is ${me.length}.`)

const str1 = 'Hello';
const str2 = 'World';

console.log(str1.concat(' ', str2));
// expected output: "Hello World"

console.log(str2.concat(', ', str1));

console.log(me.substring(0,3))

const paragraph = 'The quick brown P fox jumps over the lazy dog. It barked.';
const regex = /[A-Z]/g; //the g indicates that all matching occurences should be grouped
const found = paragraph.match(regex);

console.log(found);

// expected output: Array ["T", "I"]


*/

    





