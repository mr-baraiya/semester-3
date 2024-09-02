//4. WAP to create a simple class component in ReactJS. (A)
//in App.js

import React from "react";
class Sample extends React.Component {
  render() {
    return <h1>Hello World Using Class Component</h1>;
  }
}

class App extends React.Component {
  render() {
    return <Sample />;
  }
}

export default App;