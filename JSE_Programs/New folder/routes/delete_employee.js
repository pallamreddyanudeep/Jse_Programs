exports.delete_employee = function(req,res){
    var Tasks = req.params.Tasks;
    req.getConnection(function (err, connection) {
       connection.query("DELETE FROM Tasks  WHERE Tasks = ? ",[Tasks], function(err, rows)
       {
            if(err)
                console.log("Error deleting : %s ",err );
            res.redirect('/employee');  
       });
    });
};