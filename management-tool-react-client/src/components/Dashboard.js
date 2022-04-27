import React, { Component } from 'react';
import ProjectItem from './Project/ProjectItem';
import "bootstrap/dist/css/bootstrap.min.css";

class Dashboard extends Component {
    render() {
        return (
            <div className="btn btn-info rounded-pill">
                <ProjectItem />
            </div>
        );
    }
}

export default Dashboard;