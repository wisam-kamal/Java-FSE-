// src/components/Register.js
import React, { useState } from "react";

const Register = () => {
  const [form, setForm] = useState({ name: "", email: "", password: "" });
  const [errors, setErrors] = useState({});

  const validate = () => {
    let err = {};
    if (form.name.length < 5) {
      err.name = "Name should be at least 5 characters long.";
    }
    if (!form.email.includes("@") || !form.email.includes(".")) {
      err.email = "Email should contain '@' and '.'.";
    }
    if (form.password.length < 8) {
      err.password = "Password should be at least 8 characters.";
    }
    setErrors(err);
    return Object.keys(err).length === 0;
  };

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) {
      alert("Registered successfully!");
      setForm({ name: "", email: "", password: "" });
      setErrors({});
    }
  };

  return (
    <div style={{ width: "400px", margin: "auto" }}>
      <h2>Register Form</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Name:</label><br />
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={handleChange}
          />
          <div style={{ color: "red" }}>{errors.name}</div>
        </div>
        <div>
          <label>Email:</label><br />
          <input
            type="email"
            name="email"
            value={form.email}
            onChange={handleChange}
          />
          <div style={{ color: "red" }}>{errors.email}</div>
        </div>
        <div>
          <label>Password:</label><br />
          <input
            type="password"
            name="password"
            value={form.password}
            onChange={handleChange}
          />
          <div style={{ color: "red" }}>{errors.password}</div>
        </div>
        <button type="submit" style={{ marginTop: "10px" }}>
          Register
        </button>
      </form>
    </div>
  );
};

export default Register;
