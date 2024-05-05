
CREATE TABLE pessoas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    idade INT
);

CREATE TABLE gondolas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    assento1 int,
    assento2 int,
    FOREIGN KEY (assento1) REFERENCES pessoas(id),
    FOREIGN KEY (assento2) REFERENCES pessoas(id)
);
INSERT INTO pessoas (nome, idade) VALUES ('Paulo', 42);
INSERT INTO pessoas (nome, idade) VALUES ('Joao', 5);
INSERT INTO pessoas (nome, idade) VALUES ('Maria', 12);
INSERT INTO pessoas (nome, idade) VALUES ('Pedro', 13);
INSERT INTO pessoas (nome, idade) VALUES ('Henrique', 10);

INSERT INTO gondolas (assento1, assento2) VALUES (NULL, NULL);
INSERT INTO gondolas (assento1, assento2) VALUES (4, null);
select * from gondolas;




