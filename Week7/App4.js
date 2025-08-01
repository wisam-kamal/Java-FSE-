import React, { useState } from 'react';
import EmployeeList from './EmployeeList';
import ThemeContext from './ThemeContext';

function App() {
  const [theme, setTheme] = useState('light');

  return (
    <ThemeContext.Provider value={theme}>
      <div className={`app-container ${theme}`}>
        <h1>Employee Management App</h1>
        <button onClick={() => setTheme(prev => prev === 'light' ? 'dark' : 'light')}>
          Toggle Theme
        </button>
        <EmployeeList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
