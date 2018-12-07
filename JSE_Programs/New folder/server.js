var express = require('express');
var path= require('path');
var employee = require('./routes/employee');

var app = express();

app.use(express.logger('dev'));
app.use(express.json());

app.use(express.urlencoded());
app.use(express.methodOverride());

app.set('views', path.join(__dirname,'views'));
app.set('view engine', 'ejs');

app.use(express.static(path.join(__dirname,'public')));

app.get('/employee/:uname' ,employee.list);
app.get('/home', employee.login);
app.post('/home', employee.validate)
app.get('/registration',employee.registration);
app.post('/registration/user',employee.register);
app.get('/add', employee.addTasks );
app.get('/edit',employee.editTasks);
app.get('/delete/:Task',employee.delete_employee);

app.listen(4400, function(){
    console.log("server is running on port 4400")
});