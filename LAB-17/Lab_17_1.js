// Demonstrate the use of Node Package Manage (NPM).
const path = require('path');
console.log(path);
const path1 = 'C:\\Users\\student\\Desktop\\Vi.685';
console.log(path.dirname(path1));
console.log(path.isAbsolute(path1));
console.log(path.normalize('a/b/../c/../d'));
var http = require('http');
console.log(path.join('C:\\Users\\student\\Desktop\\Vi.685\\LAB-2','\\Snake_Game'));
console.log(path.parse('C:\\Users\\student\\Desktop\\Game.pdf'));