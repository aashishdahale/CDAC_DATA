function Person(nm,age)
{
    this.fname =nm;
    this.age = age

    this.showDetails = ()=>{
        console.log(this.fname,this.age)
    }
}

let obj = new Person("PQR",30)

obj.showDetails()