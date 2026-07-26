import React from "react";
import "./App.css";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div className="App">

      <h1>Blogger Application</h1>

      {showBooks && <BookDetails />}

      {showBlogs ? <BlogDetails /> : <h3>No Blogs Available</h3>}

      {showCourses ? <CourseDetails /> : null}

    </div>
  );
}

export default App;