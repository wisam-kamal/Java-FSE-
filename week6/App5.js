import React from "react";
import CohortDetails from "./components/CohortDetails";

function App() {
  const cohorts = [
    { name: "Java FSE", status: "ongoing", duration: "6 weeks" },
    { name: "React Bootcamp", status: "completed", duration: "4 weeks" },
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
