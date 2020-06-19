var mysql = require('mysql');
var connection = mysql.createConnection({
    host: 'localhost',
    user: 'covid',
    password: 'admin',
    port: '3306',
    database: 'covidhouse'
});

// connection.connect();

// var sql = 'select * from test';
// connection.query(sql, function(err, result) {
//     if (err) {
//         console.log('[SELECT ERROR] - ', err.message);
//         return;
//     }

//     console.log('--------------------------SELECT----------------------------');
//     console.log(result);
//     console.log('------------------------------------------------------------\n\n');
// });
// connection.end();

connection.connect();

connection.query('SELECT 1 + 1 AS solution', function(error, results, fields) {
    if (error) throw error;
    console.log('The solution is: ', results[0].solution);
});