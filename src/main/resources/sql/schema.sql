CREATE TABLE IF NOT EXISTS pokemon_entity(
    id INT PRIMARY KEY,
    name VARCHAR(20) NOT NULL
    UNIQUE KEY unique_id (id)
);