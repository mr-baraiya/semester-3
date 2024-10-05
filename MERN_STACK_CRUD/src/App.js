import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Layout from './pages/Layout';
import Home from './pages/Home';
import About from './pages/About';
import Contact from './pages/Contact';
import StudentDetails from './pages/StudentDetails';
import AddEdit from './pages/AddEdit';

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Layout />}>
            <Route index element={<Home />} />
            <Route path='/about' element={<About />} />
            <Route path='/contact' element={<Contact />} />
            <Route path='/studentdetails/:id' element={<StudentDetails />} />
            <Route path='/addeditstudent' element={<AddEdit />} />
            <Route path='/addeditstudent/:id' element={<AddEdit />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
