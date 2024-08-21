const mongoose = require('mongoose');
const schema = mongoose.Schema({
    id : Number,
    name : String,
    price : Number,
    company : String
});
module.exports = mongoose.model('Product',schema);