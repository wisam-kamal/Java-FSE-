import React from 'react';

function UserPage() {
  return (
    <div>
      <h2>🎫 Book Your Flight Tickets</h2>
      <p>Welcome, you are now logged in!</p>
      <form>
        <label>Choose Flight:</label><br />
        <select>
          <option value="AI203">AI203 - Delhi to Mumbai</option>
          <option value="AI204">AI204 - Mumbai to Delhi</option>
          <option value="AI205">AI205 - Bangalore to Hyderabad</option>
        </select><br /><br />

        <label>Passenger Name:</label><br />
        <input type="text" placeholder="Your Name" /><br /><br />

        <button type="submit">Book Ticket</button>
      </form>
    </div>
  );
}

export default UserPage;
