/* Ex5*/

// let obj = {name:'lata mangeshkar' , age:'92',country:'India',gender:'female'}
// let musician1 ={ details : obj, stream:'singer'}
// //let musician2 ={...musician1}
// let musician2={...musician1,details:{...musician1.details}}

// musician1.details.age=95

// console.log("using musician 1 print singer name ",musician1.details.age)
// console.log("using musician 2 print singer name ",musician2.details.age)


// let obj = {name:'lata mangeshar' , age:'92',country:'India',gender:'female'}
// let musician1 ={ details : obj, stream:'singer'}

// //Assign is creating a deep copy
// let musician2 = Object.assign({},musician1)

// musician2.details.name = 'asha bhosle'
// musician2.details.age = 88

//deep copy of obj is created and changed
//musician2.details ={...musician2.details,name:'asha bhosle',age:88}
// musician2.stream = "hindi film singer"

// console.log("m1",musician1)
// console.log("m2",musician2)




/*Ex4*/
// let arr1 = [ 1, 2, 3];
// //let arr2 = arr1; //SHALLOW COPY 
// let arr2 = [...arr1] //DEEP COPY
// console.log(arr1); // [1, 2, 3]
// console.log(arr2); // [1, 2, 3]
// // append an item to the array
// arr1.push(4);
// console.log("after adding to arr1..")
// console.log(arr1); // [1, 2, 3, 4]
// console.log(arr2); // [1, 2, 3, 4]





/* Ex3*/
//  const arr1 = ['one', 'two'];
// // const arr2 = [arr1, 'three', 'four', 'five'];
// // console.log("not using spread :",arr2.length , arr2, " print:",arr2[0][1])

// const arr2 = [...arr1, 'three', 'four', 'five'];
// console.log("using spread :",arr2.length , arr2, " print:",arr2[1])





/*  Ex2*/
// const arrValue = ['My', 'name', 'is', 'Jack'];

// console.log(arrValue);   // ["My", "name", "is", "Jack"]

// // the spread operator is laying out all elements in a comma separated format
// console.log(...arrValue);   //console.log(arr[0],arr[1],arr[2])


/*Ex1 */
// const obj1 ={x:1,y:2}
// const obj2 ={ z:3, p:4 , y:100}

// //let obj3 = {x:obj1.x, y:obj2.y, z:obj2.z , p:obj2.p}
// //let obj3 ={...obj1,...obj2}   // copying the objects using spread operator 
// let obj3 ={obj1,obj2}


// console.log("obj1=",obj1)
// console.log("obj2=",obj2)
// console.log("obj3=",obj3)