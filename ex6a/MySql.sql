CREATE DATABASE olympics_feedback;
USE olympics_feedback;

CREATE TABLE feedback (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    rating INT NOT NULL CHECK (rating BETWEEN 1 AND 5),
    comments TEXT,
    submitted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
