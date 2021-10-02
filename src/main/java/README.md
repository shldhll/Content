# Content
<p align="center">
  <a href="https://github.com/shldhll/Content">
    <img src="static/icon.png" alt="Logo" width="100" height="100">
  </a>
  <h3 align="center">Content</h3>
  <p align="center">
    Blog REST API using Spring Boot, H2 Database and Gradle<br><br>
    <img src="https://forthebadge.com/images/badges/made-with-java.svg" />
  </p>
  <h3>Features</h3>
  <ul>
  <li>CRUD operations for posts</li>
  <li>CRUD operations for comments</li>
  <li>CRUD operations for authors</li>
  <li>Create/View nested comments</li>
  <li>Validation and error handling</li>
  </ul>
  <h3>Installation</h3>
  <ol>
  <li>Clone the repository <code>git clone https://github.com/shldhll/Content.git</code></li>
  <li>Open project and sync gradle</li>
  <li>Build and run the application using <code>gradlew bootRun</code> command</li>
  </ol>
  <h4>Post</h4>
  <table>
  <tr>
    <th>METHOD</th>
    <th>REQUEST URL</th>
    <th>DETAILS</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/post</td>
    <td>Add a post</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/post</td>
    <td>Get all the posts</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/post/{id}</td>
    <td>Get a post by ID</td>
  </tr>
  <tr>
    <td>PUT</td>
    <td>/post</td>
    <td>Update a post</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/post/{id}</td>
    <td>Delete the post with the given ID</td>
  </tr>
  </table>
  <h4>Comment</h4>
  <table>
  <tr>
    <th>METHOD</th>
    <th>REQUEST URL</th>
    <th>DETAILS</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/comment</td>
    <td>Add a comment</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/comment/post/{id}</td>
    <td>Get all comments for the given post ID</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/comment/{id}</td>
    <td>Get comment by ID</td>
  </tr>
  <tr>
    <td>PUT</td>
    <td>/comment</td>
    <td>Update a post</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/comment/{id}</td>
    <td>Delete the comment with the given ID</td>
  </tr>
  </table>
  <h4>Author</h4>
  <table>
  <tr>
    <th>METHOD</th>
    <th>REQUEST URL</th>
    <th>DETAILS</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/author</td>
    <td>Add an author</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/author</td>
    <td>Get all authors</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/author/{id}</td>
    <td>Get author by ID</td>
  </tr>
  <tr>
    <td>PUT</td>
    <td>/author</td>
    <td>Update an author</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/author/{id}</td>
    <td>Delete the author with the given ID</td>
  </tr>
  </table>
</p>