import React from 'react';

function BookList() {
  const books = [
    { title: 'Book 1', author: 'Author 1', genre: 'Genre 1' },
    { title: 'Book 2', author: 'Author 2', genre: 'Genre 2' },
    { title: 'Book 3', author: 'Author 3', genre: 'Genre 3' },
  ];

  return (
    <div>
      <h1>Book List</h1>
      {books.map((book, index) => (
        <div key={index}>
          <h2>{book.title}</h2>
          <p>Author: {book.author}</p>
          <p>Genre: {book.genre}</p>
        </div>
      ))}
    </div>
  );
}

function App() {
  return (
    <div className="App">
      <BookList />
    </div>
  );
}

export default App;
