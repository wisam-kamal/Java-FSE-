import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const [activeTab, setActiveTab] = useState("book");

  const handleTabChange = (tab) => {
    setActiveTab(tab);
  };

  // 1. Element variable method
  let content;
  if (activeTab === "book") content = <BookDetails />;
  else if (activeTab === "blog") content = <BlogDetails />;
  else content = <CourseDetails />;

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>📚 Blogger App</h1>

      <div style={{ marginBottom: "20px" }}>
        <button onClick={() => handleTabChange("book")}>Book</button>
        <button onClick={() => handleTabChange("blog")}>Blog</button>
        <button onClick={() => handleTabChange("course")}>Course</button>
      </div>

      {/* 2. Rendering via element variable */}
      {content}

      {/* 3. Ternary operator */}
      <div style={{ marginTop: "30px" }}>
        <h3>Preview using ternary rendering:</h3>
        {activeTab === "book" ? (
          <BookDetails />
        ) : activeTab === "blog" ? (
          <BlogDetails />
        ) : (
          <CourseDetails />
        )}
      </div>

      {/* 4. Logical && operator */}
      <div style={{ marginTop: "30px" }}>
        <h3>Preview using Logical AND:</h3>
        {activeTab === "book" && <BookDetails />}
        {activeTab === "blog" && <BlogDetails />}
        {activeTab === "course" && <CourseDetails />}
      </div>

      {/* 5. Switch-case like approach */}
      <div style={{ marginTop: "30px" }}>
        <h3>Preview using Switch Emulation:</h3>
        {(() => {
          switch (activeTab) {
            case "book":
              return <BookDetails />;
            case "blog":
              return <BlogDetails />;
            case "course":
              return <CourseDetails />;
            default:
              return <p>Select a tab</p>;
          }
        })()}
      </div>
    </div>
  );
}

export default App;
