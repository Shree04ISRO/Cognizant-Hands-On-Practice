import React, { useState } from "react";

function ComplaintRegister() {

  const [employeeName, setEmployeeName] = useState("");
  const [complaint, setComplaint] = useState("");

  const handleSubmit = (event) => {

    event.preventDefault();

    const referenceNumber = Math.floor(Math.random() * 1000000);

    alert(
      `Complaint Submitted Successfully!\n\nEmployee Name: ${employeeName}\nReference Number: ${referenceNumber}`
    );

    setEmployeeName("");
    setComplaint("");
  };

  return (

    <div className="container">

      <h1>Ticket Raising Application</h1>

      <form onSubmit={handleSubmit}>

        <label>Employee Name</label>
        <br />

        <input
          type="text"
          value={employeeName}
          onChange={(e) => setEmployeeName(e.target.value)}
          required
        />

        <br /><br />

        <label>Complaint</label>
        <br />

        <textarea
          rows="5"
          cols="40"
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
          required
        ></textarea>

        <br /><br />

        <button type="submit">
          Submit Complaint
        </button>

      </form>

    </div>

  );
}

export default ComplaintRegister;