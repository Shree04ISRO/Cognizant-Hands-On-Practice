import React, { Component } from 'react';

class CountPeople extends Component {
    constructor() {
        super();

        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    updateEntry = () => {
        this.setState({
            entryCount: this.state.entryCount + 1
        });
    };

    updateExit = () => {
        this.setState({
            exitCount: this.state.exitCount + 1
        });
    };

    render() {
        return ( <
            div style = {
                { textAlign: 'center' }
            } >
            <
            h2 > Mall Counter App < /h2>

            <
            h3 >
            Number of people entered: { this.state.entryCount } < /h3>

            <
            button onClick = { this.updateEntry } >
            Login < /button>

            <
            h3 >
            Number of people exited: { this.state.exitCount } < /h3>

            <
            button onClick = { this.updateExit } >
            Exit < /button> </div >
        );
    }
}

export default CountPeople;