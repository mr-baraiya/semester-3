//2. Create a class component in separate ƒile and link with App.js (B)
import './App.css';
import Welcome from './Welcome';

function App() {
  return (
    <div className="App">
      <Welcome isComputer = {false}/>
      <button onClick={() => {
        console.log("btn Clicked !");
      }}>Button</button>
    </div>
  );
}

export default App;