CREATE TABLE url (
    id SERIAL PRIMARY KEY,
    original_url VARCHAR(255) NOT NULL,
    short_url VARCHAR(255) NOT NULL
);

INSERT INTO url (original_url, short_url) VALUES
('https://example.com', 'exmpl'),
('https://anotherexample.com', 'anexmpl');