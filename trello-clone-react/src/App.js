import React, { Component } from 'react';
import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import NavBar from './components/NavBar';
import TrelloClone from './components/TrelloClone';

class App extends Component {
  render() {
    return (
      <div className="App">
        <NavBar />
        <TrelloClone />
      </div>
    );
  }
}

export default App;
