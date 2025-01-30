CREATE TABLE urls
(
    id           SERIAL PRIMARY KEY,
    original_url TEXT                NOT NULL,
    short_url    VARCHAR(255) UNIQUE NOT NULL
);