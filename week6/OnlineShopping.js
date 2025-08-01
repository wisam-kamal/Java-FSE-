// src/OnlineShopping.js
import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
  render() {
    const items = [
      { itemname: "Mobile", price: 12000 },
      { itemname: "Laptop", price: 55000 },
      { itemname: "Shoes", price: 2000 },
      { itemname: "Watch", price: 1500 },
      { itemname: "Headphones", price: 2500 },
    ];

    return (
      <div>
        <h1>Welcome to Online Shopping</h1>
        {items.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
