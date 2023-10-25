 const express = require('express');
 const bodyParser = require("body-parser");
const ejs = require("ejs");

const server = express();

server.set('view engine', 'ejs');
server.use(bodyParser.urlencoded({extended: true}));
server.use(express.static("public"));

server.get('/', (req, res)=>{
        res.render("form"); 
})

server.post('/', (req, res)=>{
    const query = req.body
    const formdata = {
         name : query.fname +" "+ query.lname ,
         birthdate : query.birthdate ,
         gender : query.gender ,
         country  : query.country ,
         profession : query.profession ,
         email :   query.email,
         mobile : query.mobile
    }
    res.render("formdata", {data : formdata});
    console.log(formdata);
})

server.post("/formAction", (req, res )=> {
    res.redirect("/") ;
})


const port = 3000 || PORT ;
server.listen(port, ()=> console.log( `server is listening on port ${port}`)) ;