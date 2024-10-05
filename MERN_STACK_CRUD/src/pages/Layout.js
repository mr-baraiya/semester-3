import React from "react";
import { Link, Outlet } from "react-router-dom";

const Layout = ()=>{
    return (
        <>
            <div className="container my-2">
                <div className="row border border-dark rounded p-2 bg-secondary-subtle">
                    <div className="col-2 border border-dark rounded p-3 d-flex justify-content-center bg-primary-subtle">
                        <h2>Vi.685</h2>
                    </div>
                    <div className="col border border-dark rounded p-2 ms-2 bg-primary-subtle">
                        <nav className="navbar navbar-expand-lg d-flex justify-content-end">
                            <ul className="navbar-nav mr-auto">
                                <li className="nav-item active mx-3">
                                    <Link className="link text-decoration-none" to="/" >Home</Link>
                                </li>
                                <li className="nav-item active mx-3">
                                    <Link className="link text-decoration-none" to="/service" >Service</Link>
                                </li>
                                <li className="nav-item active mx-3">
                                    <Link className="link text-decoration-none" to="/about" >About US</Link>
                                </li>
                                <li className="nav-item active mx-3">
                                    <Link className="link text-decoration-none" to="/contact" >Contact Us</Link>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div className="row my-2 p-2 border border-dark rounded bg-secondary-subtle">
                    <div className="col-3 border border-dark rounded p-2 d-flex justify-content-center align-items-center bg-info">
                        SIDEBAR
                    </div>
                    <div className="col ms-2 border border-dark rounded p-2 bg-info-subtle">
                        <Outlet />
                    </div>
                </div>
                <div className="row">
                    <div className="col border border-dark rounded p-2 d-flex justify-content-center bg-primary-subtle">
                        <h4>Thanks for Visit.</h4>
                    </div>
                </div>
            </div>
        </>
    );
}
export default Layout;