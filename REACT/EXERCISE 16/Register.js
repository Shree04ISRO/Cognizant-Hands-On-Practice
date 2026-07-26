import React, { useState } from "react";

function Register() {

  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const [errors, setErrors] = useState({});

  const validate = () => {

    let error = {};

    if (name.length < 5) {
      error.name = "Name should contain at least 5 characters";
    }

    if (!(email.includes("@") && email.includes("."))) {
      error.email = "Enter a valid email";
    }

    if (password.length < 8) {
      error.password = "Password should contain at least 8 characters";
    }

    setErrors(error);

    return Object.keys(error).length === 0;
  };

  const handleSubmit = (event) => {

    event.preventDefault();

    if (validate()) {
      alert("Registration Successful!");
      setName("");
      setEmail("");
      setPassword("");
      setErrors({});
    }

  };

  return (

    <div className="container">

      <h2>Mail Registration Form</h2>

      <form onSubmit={handleSubmit}>

        <label>Name</label>
        <br />

        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />

        <br />
        <span className="error">{errors.name}</span>

        <br /><br />

        <label>Email</label>
        <br />

        <input
          type="text"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />

        <br />
        <span className="error">{errors.email}</span>

        <br /><br />

        <label>Password</label>
        <br />

        <input
          type="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />

        <br />
        <span className="error">{errors.password}</span>

        <br /><br />

        <button type="submit">
          Register
        </button>

      </form>

    </div>

  );

}

export default Register;