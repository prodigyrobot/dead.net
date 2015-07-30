CREATE TABLE info(
  id uuid PRIMARY KEY,
  title text,
  subtitle text,
  authornick text,
  info text,
  link text,
  pic text,
  active boolean
);

CREATE TABLE shadow(
  id uuid PRIMARY KEY,
  nick text,
  avatar text,
  motto text
);