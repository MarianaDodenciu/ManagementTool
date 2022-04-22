import { Component } from 'react';
import './App.css';
import Dashboard from './components/Dashboard';

class App extends Component {
  render() {
    return (
      <div className="App-header">
        <Dashboard />
      </div>
    );
  }
}

export default App;
