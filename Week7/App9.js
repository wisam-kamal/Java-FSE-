import React, { useEffect, useState } from 'react';
import GitClient from './GitClient';

function App() {
  const [repos, setRepos] = useState([]);
  
  useEffect(() => {
    const client = new GitClient();
    client.getRepositories('techiesyed').then(setRepos);
  }, []);

  return (
    <div className="App">
      <h2>Repositories of techiesyed</h2>
      <ul>
        {repos.map((repo, index) => (
          <li key={index}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
