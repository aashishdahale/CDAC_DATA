new Promise(function(resolve, reject) {

    setTimeout(() => resolve(1), 1000); // (*)
  
  }).then(function(result) { // (**)
  
    console.log(result); // 1
    return result * 2;  // this value represents a new resolve value of a new Promise
  
  }).then(function(result) { // (***)
  
    console.log(result); // 2
    return result * 2;
  
  }).then(function(result) {
  
    console.log(result); // 4
    return result * 2;
  
  });