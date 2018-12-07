var dbs = require('../models/dbs');
//var body=require('body-parser')

var rows =[{
    task : "task1",
    start : 1225,
    end : 1245,
    duration :20,
    description : "for testing testing testing testing"
},
{
    task : "task1",
    start : 1225,
    end : 1245,
    duration :20,
    description : "for testing testing testing testing"
},
{
    task : "task1",
    start : 1225,
    end : 1245,
    duration :20,
    description : "for testing testing testing testing"
},
{
    task : "task1",
    start : 1225,
    end : 1245,
    duration :20,
    description : "for testing testing testing testing"
}
];
exports.list = function(req, res){
    res.render('employee',{data : rows});
}

exports.login = function(req, res){
    res.render('login');
}
exports.validate = function(req, res){
    var input = JSON.parse(JSON.stringify(req.body));
    var uname = input.uname;
    var pwd = input.pass;
    dbs.select(uname,function(err,result){
        if(err) throw err;
        console.log(result);
        if(result.length>0){
            if(pwd == result[0].Password){
                var rows1 = [];
                dbs.select1(uname, function(err, result1){
                    if(err) throw err;
                  
                    
                        console.log(result1);
                        res.render('employee',{"username" : uname,data : result1});
                       
                       
                    
                    
                });
                
                   
                }
            else{
                res.write("Login Failed");
                res.end();
            }
           
        }
        else{
            res.write("Invalid username");
            res.end();
        }
       
        
    });
}
exports.registration = function(req, res){
    res.render('registration');
}

exports.addTasks=function (req,resp){
    resp.render('add_tasks');
}


exports.editTasks=function (req,resp){
    resp.render('edit_task')
}

exports.register=function(req,resp){

    var input = JSON.parse(JSON.stringify(req.body));
    //console.log(req.body.UserName);
    var data = [[
        name= input.UserName,
        empId= input.Employee_ID,
        pwd= input.Password,
        email= input.email,
        phone= input.phone
    ]];
console.log(data)
    var y=dbs.insertValues(data,function(err,result){
        if(err) throw err;
        console.log(result);
        //redirect to success and log in page
        resp.render('success_reg');
    });
}
exports.delete_employee = function(req,res){
    var Task = req.params.Task;
    var tasks = Task.split('&');
    console.log(Task)
    var x=dbs.deletion(tasks[0],function(err,result){
        if(err) throw err;
        console.log(result);
        res.redirect('employee/'+tasks[1]);
    });
}
