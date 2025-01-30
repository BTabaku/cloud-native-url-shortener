CREATE TABLE IF NOT EXISTS urls
(
    id
    SERIAL
    PRIMARY
    KEY,
    original_url
    TEXT
    NOT
    NULL,
    short_url
    VARCHAR
(
    255
) UNIQUE NOT NULL
    );

-- Create Flyway history table if not exists
CREATE TABLE IF NOT EXISTS flyway_schema_history
(
    installed_rank
    INT
    PRIMARY
    KEY,
    version
    VARCHAR
(
    50
),
    description VARCHAR
(
    200
),
    type VARCHAR
(
    20
),
    script VARCHAR
(
    1000
),
    checksum INT,
    installed_by VARCHAR
(
    100
),
    installed_on TIMESTAMP DEFAULT NOW
(
),
    execution_time INT,
    success BOOLEAN
    );