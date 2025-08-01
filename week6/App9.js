import React from 'react';
import './App.css';

function App() {
  const offices = [
    {
      name: "Tech Park 1",
      rent: 55000,
      address: "Banjara Hills, Hyderabad",
      image: "https://via.placeholder.com/300x180?text=Tech+Park+1"
    },
    {
      name: "City Center Office",
      rent: 72000,
      address: "MG Road, Bengaluru",
      image: "https://via.placeholder.com/300x180?text=City+Center"
    },
    {
      name: "Startup Hub",
      rent: 45000,
      address: "HITEC City, Hyderabad",
      image: "https://via.placeholder.com/300x180?text=Startup+Hub"
    },
    {
      name: "Downtown Corporate",
      rent: 88000,
      address: "Powai, Mumbai",
      image: "https://via.placeholder.com/300x180?text=Downtown+Corp"
    }
  ];

  const headingStyle = {
    textAlign: 'center',
    color: '#333',
    marginTop: '20px'
  };

  const containerStyle = {
    display: 'flex',
    flexWrap: 'wrap',
    justifyContent: 'center',
    gap: '20px',
    padding: '20px'
  };

  const cardStyle = {
    width: '300px',
    padding: '10px',
    border: '1px solid #ccc',
    borderRadius: '8px',
    boxShadow: '0 2px 5px rgba(0,0,0,0.1)'
  };

  return (
    <div>
      <h1 style={headingStyle}>Office Space Rental Listings</h1>

      <div style={containerStyle}>
        {offices.map((office, index) => (
          <div key={index} style={cardStyle}>
            <img src={office.image} alt={office.name} width="100%" height="180" />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong>{' '}
              <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
                ₹{office.rent}
              </sp
