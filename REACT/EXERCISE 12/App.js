import React, { Component } from "react";
import "./App.css";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

  constructor() {
    super();

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({ isLoggedIn: true });
  };

  logout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {

    return (
      <div className="App">

        <h1>Ticket Booking App</h1>

        {
          this.state.isLoggedIn
          ? <UserPage logout={this.logout}/>
          : <GuestPage login={this.login}/>
        }

      </div>
    );
  }
}

export default App;