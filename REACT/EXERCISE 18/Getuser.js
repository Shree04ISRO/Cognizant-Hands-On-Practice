import React, { Component } from "react";

class Getuser extends Component {

  constructor() {
    super();

    this.state = {
      user: null
    };
  }

  async componentDidMount() {

    const response = await fetch("https://api.randomuser.me/");
    const data = await response.json();

    this.setState({
      user: data.results[0]
    });

  }

  render() {

    const { user } = this.state;

    if (!user) {
      return <h2>Loading...</h2>;
    }

    return (

      <div>

        <h1>Random User Details</h1>

        <img
          src={user.picture.large}
          alt="User"
          width="200"
        />

        <h2>
          {user.name.title} {user.name.first}
        </h2>

      </div>

    );

  }

}

export default Getuser;