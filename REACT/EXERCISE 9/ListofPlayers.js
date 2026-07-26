import React from "react";

function ListofPlayers() {

    const players = [
        {name:"Virat Kohli",score:95},
        {name:"Rohit Sharma",score:88},
        {name:"Shubman Gill",score:79},
        {name:"KL Rahul",score:65},
        {name:"Hardik Pandya",score:90},
        {name:"Ravindra Jadeja",score:60},
        {name:"MS Dhoni",score:98},
        {name:"Rishabh Pant",score:72},
        {name:"Suryakumar Yadav",score:68},
        {name:"Jasprit Bumrah",score:81},
        {name:"Mohammed Shami",score:55}
    ];

    return(
        <div>

            <h2>List of Players</h2>

            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                </thead>

                <tbody>
                {
                    players.map((player,index)=>(
                        <tr key={index}>
                            <td>{player.name}</td>
                            <td>{player.score}</td>
                        </tr>
                    ))
                }
                </tbody>
            </table>

            <br/>

            <h2>Players with Score Below 70</h2>

            <ul>
            {
                players
                .filter(player=>player.score<70)
                .map((player,index)=>(
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))
            }
            </ul>

        </div>
    );
}

export default ListofPlayers;