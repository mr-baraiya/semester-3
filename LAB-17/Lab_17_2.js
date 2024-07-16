// Demonstrate “path” core module in NodeJS.
const path = require('path');
console.log(path);


console.log("Normlize Method : ",path.normalize('a/b/../c/../d'));
console.log("Join Method : ",path.join('C:\\Users\\student\\Desktop\\Vi.685\\LAB-2','\\Snake_Game'));
console.log("Resolve Method : ",path.resolve('C:\\Users\\student\\Desktop\\Vi.685\\LAB-2','\\Snake_Game'));
console.log("Relative Method : ",path.relative('C:\\Users\\student\\Desktop\\Vi.685\\LAB-2','\\Snake_Game'));
console.log("Parse Method : ",path.parse('C:\\Users\\student\\Desktop\\Game.pdf'));

const path1 = 'C:\\Users\\student\\Desktop\\Vi.685';
console.log("Dirname Method : ",path.dirname(path1));
console.log("Basename Method : ",path.basename(path1));
console.log("extname Method : ",path.extname(path1))
console.log("isAbsolute Method : ",path.isAbsolute(path1));