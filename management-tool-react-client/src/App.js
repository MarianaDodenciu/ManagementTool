import { Component } from 'react';
import './App.css';
import Dashboard from './components/Dashboard';
import Header from './components/Layout/Header';

class App extends Component {
  render() {
    return (
      <div className="App-header">
        <Header />
        <Dashboard />
      </div>
    );
  }
}

export default App;
