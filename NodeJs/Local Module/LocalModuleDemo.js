let circle = require('./Circle.js');

console.log(circle.area(10));
console.log(circle.parimiti(10));

module.exports = function defaultExportedFunction() {
    console.log('default exported function called.');
};
