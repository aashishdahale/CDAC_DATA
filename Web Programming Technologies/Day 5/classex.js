class Person
{
    constructor(nm,age)
    {
        this.fname = nm
        this.age = age
        Person.city ="pune"
    }
    showDetails()
    {        console.log(this.fname,this.age)
    }
    static showAgain()
    {
        console.log(this.fname,this.age,Person.city)
        console.log("this is a static method")
    }
}
let obj = new Person("XYZ",30)
obj.showDetails()
Person.showAgain()
obj.lname = "PQR"
console.log(obj)