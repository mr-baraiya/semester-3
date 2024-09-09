//2. Create a class component in separate ƒile and link with App.js (B)
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