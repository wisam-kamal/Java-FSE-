// src/CurrencyConvertor.js
import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euros: ''
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const euroRate = 0.011; // 1 INR = 0.011 EUR (as of example rate)
    const euros = parseFloat(this.state.rupees) * euroRate;
    this.setState({ euros: euros.toFixed(2) });
  };

  render() {
    return (
      <div>
        <h2>Currency Converter</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            placeholder="Enter amount in INR"
            value={this.state.rupees}
            onChange={this.handleChange}
          />
          <button type="submit">Convert</button>
        </form>
        <h3>Equivalent in Euros: €{this.state.euros}</h3>
      </div>
    );
  }
}

export default CurrencyConvertor;
