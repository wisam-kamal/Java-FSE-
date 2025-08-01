import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null,
      loading: true,
      error: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      this.setState({ user: data.results[0], loading: false });
    } catch (error) {
      this.setState({ error: 'Failed to fetch user data.', loading: false });
    }
  }

  render() {
    const { user, loading, error } = this.state;

    if (loading) return <p>Loading...</p>;
    if (error) return <p>{error}</p>;

    const title = user.name.title;
    const firstname = user.name.first;
    const image = user.picture.large;

    return (
      <div>
        <h2>User Details</h2>
        <p><strong>Title:</strong> {title}</p>
        <p><strong>First Name:</strong> {firstname}</p>
        <img src={image} alt="User" />
      </div>
    );
  }
}

export default Getuser;
