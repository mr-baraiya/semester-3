const mongoose = require('mongoose');
const schema = mongoose.Schema({
    id : Number,
    name : String,
    email : String,
    sub : String
});
module.exports = mongoose.model('Faculty',schema);