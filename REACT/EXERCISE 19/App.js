import React, { Component } from "react";
import GitClient from "./GitClient";

class App extends Component {

    constructor() {
        super();

        this.state = {
            repositories: []
        };
    }

    async componentDidMount() {

        const repos = await GitClient.getRepositories("techiesyed");

        this.setState({
            repositories: repos
        });

    }

    render() {

        return (

            <div style={{ padding: "20px" }}>

                <h1>GitHub Repositories</h1>

                <ul>

                    {
                        this.state.repositories.map((repo) => (

                            <li key={repo.id}>
                                {repo.name}
                            </li>

                        ))
                    }

                </ul>

            </div>

        );

    }

}

export default App;