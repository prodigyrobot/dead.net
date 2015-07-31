create table info_by_category_time(
  id uuid,
  title text,
  category text,
  subtitle text,
  authornick text,
  info text,
  link text,
  pic text,
  pic_title text,
  tag1 text,
  tag2 text,
  tag3 text,
  alltags text,
  language text,
  active boolean,
  creation_time timestamp,
  primary key (category, creation_time, tag1, tag2, tag3))
  with CLUSTERING ORDER BY (creation_time DESC, tag1 DESC, tag2 DESC, tag3 DESC)
;

create table info_by_category_tags(
  id uuid,
  title text,
  category text,
  subtitle text,
  authornick text,
  info text,
  link text,
  pic text,
  pic_title text,
  tag1 text,
  tag2 text,
  tag3 text,
  alltags text,
  language text,
  active boolean,
  creation_time timestamp,
  primary key (category, tag1, tag2, tag3, creation_time))
  with CLUSTERING ORDER BY (tag1 DESC, tag2 DESC, tag3 DESC, creation_time DESC)
;








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