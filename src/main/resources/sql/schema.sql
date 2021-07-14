CREATE TABLE IF NOT EXISTS books (
    id                     VARCHAR(60)  DEFAULT 1 PRIMARY KEY,
    name                   VARCHAR      NOT NULL,
    author                   VARCHAR      NOT NULL,
    writeAt                   timestamp   NOT NULL
    );