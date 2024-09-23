import React from 'react';
import {Link, Outlet} from 'react-router-dom';

function Layout(){
    return (
     <>
        <div className='container'>
            <div className='row m-3'>
                <div className='col-2 border border-2 border-dark'>
                    <h1>LOGO</h1>
                </div>
                <div className='col mx-3  border border-2 border-dark'>
                    <ul className="nav">
                        <li className="nav-item">
                            <Link className="nav-link active" to="/">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/about">About</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/contact">Contact</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/service">Service</Link>
                        </li>
                    </ul>
                </div>
            </div>
            <div className='row m-3'>
                <div className='col-3 mx-2 border border-2 border-dark p-3'>
                    SIDEBAR
                </div>
                <div className='col  border border-2 border-dark p-3'>
                    <Outlet />
                </div>
            </div>
            <div className='row m-3'>
                <div className='col m-2 border border-2 border-dark'>Footer</div>
            </div>
        </div>
      
       
     </>
    );
}

export default Layout;