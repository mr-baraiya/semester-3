import React,{useEffect} from 'react';

const Service = () => {
  const apiLink = "https://66724c64e083e62ee43ea0b2.mockapi.io/faculty";
  const [data, setData] = React.useState([]);
  useEffect(() => {
    fetch(apiLink,{'method' : 'GET'}).then((res)=>res.json).then((res)=>{setData(res)});
  });
  const Faculty = data.map((temp)=>{
    return(
      <>
        <tr>
          <td>temp.id</td>
          <td></td>
        </tr>
      </>
    );
  });
  
  return (
    <>
      <table>
        <tr>
          <th>id</th>
          <th>Facultyid</th>
          <th>FacultyName</th>
          <th>Department</th>
          <th>Contact</th>
          <th>Faculty</th>
        </tr>
        <tr>
          <Faculty />
        </tr>
      </table>
    </>
  );
}

export default Service;