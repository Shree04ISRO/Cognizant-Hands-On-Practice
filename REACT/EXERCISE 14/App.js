import React, { useState } from "react";
import "./App.css";

import EmployeeList from "./components/EmployeeList";
import ThemeContext from "./ThemeContext";

function App() {

    const [theme, setTheme] = useState("light");

    const changeTheme = () => {

        if (theme === "light")
            setTheme("dark");
        else
            setTheme("light");

    };

    return (

        <ThemeContext.Provider value={theme}>

            <div className="App">

                <h1>Employee Management Application</h1>

                <button onClick={changeTheme}>
                    Change Theme
                </button>

                <EmployeeList />

            </div>

        </ThemeContext.Provider>

    );

}

export default App;