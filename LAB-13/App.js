//1. Demonstrate useState hook in ReactJS. (A)
//2. Demonstrate useEffect hook in ReactJS (A)

import { useEffect, useState } from 'react';
import './App.css';

function App() {

// useState hook
  const [count, setCount] = useState(0);

  const incrementByOne = () => {
    setCount(count + 1);
  }
  const decrementByOne = () => {
    setCount(count - 1);
  }

//useEffect hook
  useEffect(()=>{
    console.log("In UseEffect Count = "+count);
  },[]);
  console.log("Out UseEffect Count = "+count);
  return (
    <div className="App justify-content-center border border-2 border-dark rounded-2 m-5">
      <div className="container m-5 ">
        <h1>Counter</h1>
        <h2 className='mt-2 mb-4'>Counter Value : <span className="border border-2 border-dark rounded-2 p-2">{count}</span></h2>
        <button onClick={incrementByOne} className="btn btn-primary m-2">Increment</button>
        <button onClick={decrementByOne} className="btn btn-danger m-2">Decrement</button>
      </div>
    </div>
    
  );
}

export default App;
