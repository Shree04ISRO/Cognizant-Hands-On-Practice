import React from "react";
import "./App.css";

function App() {

  const officeList = [
    {
      name: "Tech Park",
      rent: 55000,
      address: "Chennai",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      name: "Business Hub",
      rent: 75000,
      address: "Bangalore",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    },
    {
      name: "Corporate Tower",
      rent: 62000,
      address: "Hyderabad",
      image: "https://images.unsplash.com/photo-1486406146926-c627a92ad1ab?w=600"
    }
  ];

  return (
    <div className="App">

      <h1>Office Space Rental App</h1>

      {officeList.map((office, index) => (
        <div className="card" key={index}>

          <img
            src={office.image}
            alt={office.name}
            width="350"
            height="220"
          />

          <h2>{office.name}</h2>

          <p>
            <b>Address:</b> {office.address}
          </p>

          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold"
            }}
          >
            Rent: ₹{office.rent}
          </p>

        </div>
      ))}

    </div>
  );
}

export default App;