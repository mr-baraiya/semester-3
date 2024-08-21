const mongoose = require('mongoose');
const schema = mongoose.Schema({
    rNo : Number,
    name : String,
    email : String,
    sem : Number
});
module.exports = mongoose.model('Student',schema);