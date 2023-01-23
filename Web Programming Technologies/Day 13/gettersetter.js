class Book
{
    constructor(n,c)
    {
        this._bookName =n
        this._bookCost =c 
    }

  set bookName (bn)  {
        console.log("setter is called")
        this._bookName = bn
    }
  get bookName () { 
    console.log("getter is called")
    return this._bookName}

}


let b1 = new Book("Learning JS",700)

b1.bookName = "Some Book"
console.log(b1.bookName)




