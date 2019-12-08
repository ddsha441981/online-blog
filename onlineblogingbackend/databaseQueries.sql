CREATE TABLE category(

	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50),
	description VARCHAR(255),
	image_URL VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY(id)

);

INSERT INTO category (name,description,image_url,is_active) values('Technical','This First category','Cat25.png',true);
INSERT INTO category (name,description, image_url,is_active) values('Non Technical', 'this is My Second Entity', 'CAT5.png', false);
INSERT INTO category (name,description, image_url,is_active) values('Languages', 'This is My Thrid Entity', 'CAT5.png', true);


CREATE TABLE user_detail(

	id INT NOT NULL AUTO_INCREMENT,
	first_Name VARCHAR(50),
	last_Name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail 
(first_name, last_name, role,enabled, password, email, contact_number)
values('Virat', 'Khohli', 'ADMIN', true, 'admin', 'vk@gmail.com', '9602063435');

INSERT INTO user_detail 
(first_name, last_name, role,enabled, password, email, contact_number)
values('Ravindra', 'Jadeja', 'User', true, 'user', 'rj@gmail.com', '7976402731');

INSERT INTO user_detail 
(first_name, last_name, role,enabled, password, email, contact_number)
values('Rohit', 'Sharma', 'User', true, 'user', 'rs@gmail.com', '7976402731');

INSERT INTO user_detail 
(first_name, last_name, role,enabled, password, email, contact_number)
values('Shikhar', 'Dhawan', 'User', true, 'user', 'rs@gmail.com', '7976402731');


CREATE TABLE article(

	id INT NOT NULL AUTO_INCREMENT,
	code VARCHAR(20),
	name VARCHAR(50),
	description LONGTEXT,
	post_dateTime  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	is_active BOOLEAN,
	category_id INT,
	user_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_articles_id  PRIMARY KEY(id),
	CONSTRAINT fk_articles_category_id FOREIGN KEY (category_id) REFERENCES category(id),
	CONSTRAINT fk_articles_user_id FOREIGN KEY (user_id) REFERENCES user_detail(id)
	
	);
INSERT INTO article 
(code, name, description, post_dateTime, is_active, category_id,user_id,purchases,views)
values('00BKJ45KL55', 'PHP', 'This is articlas first',now(), false, 3, 2,10,16);

INSERT INTO article 
(code, name, description, post_dateTime, is_active, category_id,user_id,purchases,views)
values('00BKJ45KL55', 'JAVA', 'This is articlas Second',now(), true, 2, 3,40,45);

INSERT INTO article 
(code, name, description, post_dateTime, is_active, category_id,user_id,purchases,views)
values('00BKJ45KL55', 'R LAnguages', 'This is articlas Third',now(), true, 2, 2,30,35);


