import React from "react";

function IndianPlayers() {

    const IndianTeam = [
        "Virat",
        "Rohit",
        "Gill",
        "Rahul",
        "Hardik",
        "Jadeja"
    ];

    const [odd1,,odd2,,odd3] = IndianTeam;

    const [,even1,,even2,,even3] = IndianTeam;

    const T20players = [
        "Surya",
        "Pant",
        "Bumrah"
    ];

    const RanjiPlayers = [
        "Jaiswal",
        "Sarfaraz",
        "Pujara"
    ];

    const mergedPlayers = [...T20players,...RanjiPlayers];

    return(

        <div>

            <h2>Odd Team Players</h2>

            <ul>
                <li>{odd1}</li>
                <li>{odd2}</li>
                <li>{odd3}</li>
            </ul>

            <h2>Even Team Players</h2>

            <ul>
                <li>{even1}</li>
                <li>{even2}</li>
                <li>{even3}</li>
            </ul>

            <h2>Merged Players</h2>

            <ul>
            {
                mergedPlayers.map((player,index)=>(
                    <li key={index}>{player}</li>
                ))
            }
            </ul>

        </div>

    );

}

export default IndianPlayers;