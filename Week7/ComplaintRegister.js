// src/ComplaintRegister.js
import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (employeeName.trim() === '' || complaint.trim() === '') {
      alert('Please fill in all fields.');
      return;
    }

    // Generate a 6-digit random reference number
    const referenceNumber = 'REF' + Math.floor(100000 + Math.random() * 900000);

    alert(`Complaint Submitted!\nReference No: ${referenceNumber}`);

    // Clear form
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={{ margin: '20px', padding: '20px', maxWidth: '500px', border: '1px solid #ccc', borderRadius: '10px' }}>
      <h2>Complaint Register</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label>Employee Name:</label><br />
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            placeholder="Enter your name"
            style={{ width: '100%', padding: '8px' }}
          />
        </div>

        <div style={{ marginBottom: '10px' }}>
          <label>Complaint:</label><br />
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            placeholder="Describe your issue"
            rows="5"
            style={{ width: '100%', padding: '8px' }}
          ></textarea>
        </div>

        <button type="submit" style={{ padding: '10px 20px', backgroundColor: '#007BFF', color: 'white', border: 'none', borderRadius: '5px' }}>
          Submit
        </button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
