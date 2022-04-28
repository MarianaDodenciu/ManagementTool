import React, { Component } from 'react';
import ProjectItem from './Project/ProjectItem';
import "bootstrap/dist/css/bootstrap.min.css";

class Dashboard extends Component {
    render() {
        return (
            // <div className="btn btn-info rounded-pill"> - folosit pt butonul de login rotunjit
            <div className="projects">
                <div className="container">
                    <div className="row">
                        <div className="col-md-12">
                            <h1 className="display-4 text-center">Projects</h1>
                            <br />
                            <a href="ProjectForm.html" className="btn btn-lg btn-info">
                                Create a Project
                            </a>
                            <br />
                            <hr />
                            <ProjectItem />
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Dashboard;