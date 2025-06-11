import './App.css';
import React, { useEffect, useState } from "react";

function App() {
  const [message, setMessage] = useState("Loading...");

  useEffect(() => {
    fetch("http://localhost:3000/users/102")
      .then(res => res.text())
      .then(data => setMessage(data))
      .catch(err => setMessage("Error loading message"));
  }, []);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>{message}</h1>
    </div>
  );
}

export default App;
