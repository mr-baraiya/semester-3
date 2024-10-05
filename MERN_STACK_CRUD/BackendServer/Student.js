const mongoose = require('mongoose');
const schema = mongoose.Schema({
    id : Number,
    name : String,
    sem : Number,
    spi : Number,
    contact : Number,
    img : String,
});
module.exports = mongoose.model('Student',schema);