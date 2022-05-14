import { Component } from 'react';
import './App.css';
import Dashboard from './components/Dashboard';
import Header from './components/Layout/Header';
import { BrowserRouter as Router, Route } from "react-router-dom";
import AddProject from './components/Project/AddProject';
import Landing from './components/Layout/Landing';
import Login from './components/UserManagement/Login';
import Register from './components/UserManagement/Register';

class App extends Component {
  render() {
    return (
      <Router>
        <div className="App-header">
          <Header />
          {
            //Public Routes
          }

          <Route exact path="/" component={Landing} />
          <Route exact path="/register" component={Register} />
          <Route exact path="/login" component={Login} />

          {
            //Private Routes
          }
          <Route exact path="/dashboard" component={Dashboard} />
          <Route exact path="/addProject" component={AddProject} />
        </div>
      </Router>
    );
  }
}

export default App;
