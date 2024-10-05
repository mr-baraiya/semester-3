import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";

const AddEdit = () => {
    const {id} = useParams();
    const navigate = useNavigate();
    const [data,setData] = useState({});
    const isForEdit = (id != null);

    useEffect(()=>{
        if(isForEdit){
            const apiUrl = 'http://localhost:3685/students/'+id;
            fetch(apiUrl,{method : 'GET'}).then(res=>res.json()).then(res=>setData(res));
        }
    },[]);
    return(
        <>
            <div className="container p-3">
                <div className="row mb-3">
                    {isForEdit && <div className="col-2"><Link className="btn btn-dark" to={'/studentdetails/'+id}>Back</Link></div>}
                    {!isForEdit && <div className="col-2"><Link className="btn btn-dark" to='/' >Back</Link></div>}
                </div>
                <div className="row my-1">
                    <div className="col-2">ID</div>
                    <div className="col-1">:</div>
                    <div className="col">
                        <input type="number" value={data.id} onChange={(e)=>setData({...data,id:e.target.value})} className="form-control"/>
                    </div>
                </div>
                <div className="row my-1">
                    <div className="col-2">Full Name</div>
                    <div className="col-1">:</div>
                    <div className="col">
                        <input type="text" value={data.name} onChange={(e)=>setData({...data,name:e.target.value})} className="form-control"/>
                    </div>
                </div>
                <div className="row my-1">
                    <div className="col-2">Semester</div>
                    <div className="col-1">:</div>
                    <div className="col">
                        <input type="number" pattern="(0-9){1}" value={data.sem} onChange={(e)=>setData({...data,sem:e.target.value})} className="form-control"/>
                    </div>
                </div>
                <div className="row my-1">
                    <div className="col-2">SPI</div>
                    <div className="col-1">:</div>
                    <div className="col">
                        <input type="number" value={data.spi} onChange={(e)=>setData({...data,spi:e.target.value})} className="form-control"/>
                    </div>
                </div>
                <div className="row my-1">
                    <div className="col-2">Contact No</div>
                    <div className="col-1">:</div>
                    <div className="col">
                        <input type="number" pattern="(0-9){10}" value={data.contact} onChange={(e)=>setData({...data,contact:e.target.value})} className="form-control"/>
                    </div>
                </div>
                <div className="row my-1">
                    <div className="col-2 ">Image Path</div>
                    <div className="col-1">:</div>
                    <div className="col">
                        <input type="text" value={data.img} onChange={(e)=>setData({...data,img:e.target.value})} className="form-control"/>
                    </div>
                </div>
                <div className="row mt-3">
                    <div className="col d-flex justify-content-center">
                        {/* for edit student */}
                        {isForEdit && (
                            <button className="btn btn-primary" onClick={()=>{
                                const apiUrl = 'http://localhost:3685/students/'+id;
                                fetch(apiUrl,{
                                    method:"PATCH",
                                    body:JSON.stringify(data),
                                    headers:{
                                        "Content-Type":"application/json"
                                    }
                                })
                                .then(res=>res.json())
                                .then(res=>{
                                    navigate('/studentdetails/'+data.id);
                                }); 
                            }}>Update</button>
                        )}
                        {/* for add new student submition */}
                        {!isForEdit && (
                            <button className="btn btn-primary" onClick={()=>{
                                const apiUrl = 'http://localhost:3685/students';
                                fetch(apiUrl,{
                                    method:"POST",
                                    body:JSON.stringify(data),
                                    headers:{
                                        "Content-Type":"application/json"
                                    }
                                })
                                .then(res=>res.json())
                                .then(res=>{
                                    navigate('/studentdetails/'+data.id);
                                });
                            }}>Submit</button>
                        )}
                    </div>
                </div>
            </div>
        </>
    );
}
export default AddEdit;