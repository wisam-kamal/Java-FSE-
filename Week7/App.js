// src/App.js
import React, { Component } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }));
  };

  sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  handleSyntheticEvent = (event) => {
    alert("I was clicked!");
    console.log("Synthetic event: ", event);
  };

  render() {
    return (
      <div className="App">
        <h1>React Event Examples</h1>
        <h2>Counter: {this.state.count}</h2>

        <button onClick={this.handleIncrement}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to the Event Examples App!")}>
          Say Welcome
        </button>

        <br /><br />
        <button onClick={this.handleSyntheticEvent}>OnPress (Synthetic Event)</button>

        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
