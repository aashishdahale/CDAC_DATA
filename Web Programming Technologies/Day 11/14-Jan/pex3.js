function f1() {
    console.log('f1');
}
function f2() {
    console.log('f2');
}
function main() {
    console.log('main');
    
    setTimeout(f1, 0);
    
    var promise = new Promise((resolve, reject) =>
        resolve('all well')
        //reject("some problem")
    )   
    promise.then(resolvedVal => console.log("in then",resolvedVal))
    promise.then(rv=>{console.log("another then",rv)})
    promise.catch(reject=>{ console.log("in catch",reject)})

    f2();
}//end of main

main();






