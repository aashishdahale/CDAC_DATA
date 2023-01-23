
	// Requiring fs module in which
	// writeFile function is defined.
	const fs = require('fs')
	
	// Data which will write in a file.
	let data = "Learning how to write in a file."
	
	// Write data in 'Output.txt' .
	fs.writeFile('Output.txt', data, (err) => {
		
		// In case of a error throw err.
		if (err) throw err;
        console.log("write completed")
	})

   // fs.writeFileSync('Output.txt',"This is written by a synchronous function") 
//    console.log("writing done")   
    let data2 = fs.readFileSync("Output.txt")
     console.log("reading done")
   
     // fs.readFile('Output.txt', (err, data) => {
    //     if (err) throw err;
    //     console.log("Showing data ",data.toString());
    //   });

   console.log("file writing done" ,data2.toString())
      


    //fs.appendFileSync('Output.txt', 'data to append');

    // fs.appendFile('Output.txt', 'data to append', function (err) {
    //     if (err) throw err;
    //     console.log('Saved!');
    //   });

    //   fs.appendFileSync('Output.txt', 'data to append');
