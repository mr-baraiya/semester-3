import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

const Home = ()=>{
    const [data,setData] = useState([]);
    const apiUrl = "http://localhost:3685/students";
    useEffect(()=>{
        fetch(apiUrl,{method : "GET"}).then((res)=>res.json()).then((res)=>setData(res));
    },[]); 
    const stu = data.sort((a,b) => a.id - b.id).map((temp)=>{
        return(
            <tr>
                <td>{temp.id}</td>
                <td>{temp.name}</td>
                <td><Link className="btn btn-primary" to={"/studentdetails/"+temp.id}>Read More...</Link></td>
            </tr>
        );
    });
    return (
        <> 
            <div className="container">
                <div className="row my-2">
                    <div className="col">
                        <Link className="btn btn-primary" to='/addeditstudent'>New Admission</Link>
                    </div>
                </div>
                <div className="row">
                    <div className="col">
                        <table className="table">
                            <thead>
                                <tr>
                                    <th>Student ID</th>
                                    <th>Student Name</th>
                                    <th>Read More</th>
                                </tr>
                            </thead>
                            <tbody>
                                {stu}
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </>
    );
}
export default Home;