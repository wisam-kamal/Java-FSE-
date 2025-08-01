import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeeList() {
  const employees = [
    { id: 1, name: "Alice", designation: "Developer" },
    { id: 2, name: "Bob", designation: "Designer" }
  ];

  return (
    <div className="employee-list">
      {employees.map(emp => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeeList;
