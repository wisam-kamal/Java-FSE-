import React from 'react';
import '../Stylesheets/mystyle.css';

const CalculateScore = ({ name, school, total, goal }) => {
  const average = (total / goal).toFixed(2);

  return (
    <div className="score-container">
      <h2>Student Score Calculator</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p className="result"><strong>Average Score:</strong> {average}</p>
    </div>
  );
};

export default CalculateScore;
