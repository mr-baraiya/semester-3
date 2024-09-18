// 1. Demonstrate the use of map method in ReactJS to display array. (A)
// import './App.css';
// const names = ["Arjun","Darshan","University","Vishal"];
// const namesElemants = names.map((temp)=><h1>Welcome From {temp}.</h1>);
// function App() {
//   return (namesElemants);
// }
// export default App;

// 2. Display Faculties stored in array using ReactJS. (B)

import './App.css';
const faculty = [
  {
    id : 101,
    name : "Prof. Arjun Bala",
    subject : "JAVA , WT",
    img : "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/15---28-04-2023-02-07-35.jpg"
  },
  {
    id : 102,
    name : "Prof. Firoz Sherasiya",
    subject : "OAT",
    img : "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/12---28-04-2023-02-06-51.jpg"
  },
  {
    id : 103,
    name : "Dr. Pradyumansinh Jadeja",
    subject : "DSA",
    img : "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/6---28-04-2023-02-06-07.jpg"
  }
];

const facultyElemants = faculty.map((temp)=>{
  return(
    <tr>
      <td>{temp.id}</td>
      <td>{temp.name}</td>
      <td>{temp.subject}</td>
      <td><image src={temp.img} height={100} width={100}/></td>
    </tr>
  );
});

function App() {
  return (
    <table border={3}>
      <tr>
        <th>ID</th>
        <th>Faculty Name</th>
        <th>Faculty Subject</th>
      </tr>
      {facultyElemants}
    </table>
  );
}

export default App;