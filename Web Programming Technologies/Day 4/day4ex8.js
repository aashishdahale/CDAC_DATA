function welcome(country,name)
{
    function indianwelcome()
    {
        console.log("namaste",name)
    }

    function USwelcome()
    {
        console.log("Howd",name)
    }

    function japanesewelcome()
    {
        console.log("konnichiwa",name)
    }

    if(country == "IND")
        return indianwelcome
    if(country == "US")
        return USwelcome
    if(country == "JAP")
        return japanesewelcome

}

let rv = welcome("IND","prachi")
rv()
