import React from 'react';
import {Link, Outlet} from 'react-router-dom';

function Layout(){
    return (
     <>
      <ul className="nav">
            <li className="nav-item">
                <Link className="nav-link active" to="/home">Home</Link>
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
        <div>
            <Outlet />
        </div>
     </>
    );
}

export default Layout;