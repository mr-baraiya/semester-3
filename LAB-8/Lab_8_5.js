//5. WAP to create a simple function component in ReactJS. (A)
//in index.js

import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
function PrintSomething() {
    return (<h1>Hello World using Function</h1>);
}
root.render(PrintSomething());