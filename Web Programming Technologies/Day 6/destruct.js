arr = ["pune", "mumbai", "chennai"]

var [a, , c] = arr
console.log(a.toUpperCase(), c.toUpperCase())

let obj = {
    id: 1, name: "usb hard disk", cost: 500, desc: "100TB",
    showInfo: function () {
        console.log("showing the info")
        console.log(this.name, this.cost)
    }
}

let {id,showInfo ,desc} = obj 
console.log(id,desc)
showInfo()

let {id:id1,showInfo:show ,desc:d1} = obj 
console.log(id1,show,d1)

