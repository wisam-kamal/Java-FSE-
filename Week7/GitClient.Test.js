import axios from 'axios';
import GitClient from './GitClient';

jest.mock('axios'); // Mock axios

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    const dummyRepos = [
      { name: 'repo1' },
      { name: 'repo2' },
      { name: 'repo3' },
    ];

    // Setup mock implementation
    axios.get.mockResolvedValue({ data: dummyRepos });

    const client = new GitClient();
    const repos = await client.getRepositories('techiesyed');

    expect(repos).toEqual(['repo1', 'repo2', 'repo3']);
    expect(axios.get).toHaveBeenCalledWith('https://api.github.com/users/techiesyed/repos');
  });
});
