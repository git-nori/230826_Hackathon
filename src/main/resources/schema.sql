CREATE TABLE IF NOT EXISTS users (
    user_id BIGINT PRIMARY KEY,
    first_name VARCHAR(50),
    first_name_kana VARCHAR(50),
    last_name VARCHAR(50),
    last_name_kana VARCHAR(50),
    character_type CHAR(4),
    character_type_meta CHAR(1),
    craeted_at TIMESTAMP(50),
    updated_at TIMESTAMP(50)
);