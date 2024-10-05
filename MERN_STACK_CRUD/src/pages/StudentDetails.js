import { useParams, useNavigate, Link } from "react-router-dom";
import { useState, useEffect } from "react";

const StudentDetails = ()=>{
    const [data,setData] = useState({});
    const {id} = useParams();
    const navigate = useNavigate();

    const apiUrl = "http://localhost:3685/students/"+id;
    useEffect(()=>{
        fetch(apiUrl,{method : "GET"}).then((res)=>res.json()).then((res)=>setData(res));
    },[]); 
    return(
        <div className="container p-3">
            <div className="row my-2 p-1 border border-dark rounded">
                <div className="col d-flex justify-content-center"><h4>{data.name}'s All Details</h4></div>
            </div>
            <div className="row my-2">
                <div className="col-1">
                    <Link className="btn btn-dark" to="/">Back</Link>
                </div>
                <div className="col-1">
                    <Link className="btn btn-success" to={"/addeditstudent/"+id} >Edit</Link>
                </div>
                <div className="col-1">
                    <button className="btn btn-danger" onClick={()=>{
                         const apiUrl = 'http://localhost:3685/students/'+data.id;
                         fetch(apiUrl,{method:"DELETE"})
                         .then(res=>res.json())
                         .then(res=>{
                             navigate('/');
                         });
                    }}>Delete</button>
                </div>
            </div>
            <div className="row">
                <div className="col">
                     <div className="d-flex justify-content-center">
                        <div className="card border border-dark rounded">
                            <img src={data.img} className="card-img-top border border-dark rounded" height={250} alt={"Sorry!"}/>
                            <div className="card-body">
                                <h3>{data.id}. {data.name}</h3>
                                <h6>Semester : {data.sem}</h6>
                                <h6>SPI : {data.spi}</h6>
                                <h6>Contact No : {data.contact}</h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default StudentDetails;