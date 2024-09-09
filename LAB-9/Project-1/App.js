//1. Create a function component in separate ƒile and link with App.js (A)
import './App.css';
import Login from './Login';

function App() {
  return (
    <div className="App">
      <Login/>
    </div>
  );
}

export default App;