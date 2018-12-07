var mysql = require('mysql');


var con = mysql.createConnection({
    host: "localhost", // ip address of server running mysql
    user: "root", // user name to your mysql database
    password: "root", // corresponding password
    database: "Timesheet" // use this database to querying context
  });
  function conObj(){
    con.connect(function(err) {
    if (err) throw err;
    });
  }

  function select(user,callback){
    var sql1 = "select Password from users WHERE Username = ?";
    con.query(sql1,[user],function(err,result,fields){
              if(err) throw err;
              callback(null,result);
           });
  }

  function select1(user,callback){
    var sql2 = "select * from tasks WHERE Username = ?";
    con.query(sql2,[user],function(err,result,fields){
              if(err) throw err;
              callback(null,result);
           });
  }
  
  var insertValues= function(value,callback){
    console.log(value);
          var ins ="INSERT INTO users (UserName,EmpId,Password,Email,Phone) values ?";
          con.query(ins,[value],function (err,result){
          if(err) throw err;
          console.log("Inserted")
          callback(null,result);

         })
     }
  
  var deletion=function(del,callback){
    var task="DELETE FROM Tasks  WHERE Task = ? ";
    con.query(task,[del],function(err,result){
      if(err) throw err;
      console.log("deleted the task")
      callback(null,result);
    })
  }

  module.exports = {select, select1, insertValues, deletion};