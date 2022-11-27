CREATE TABLE bogops (
    id character varying(255) NOT NULL DEFAULT gen_random_uuid(),
    nom character varying(255) NOT NULL,
    prenom character varying(255) NOT NULL
);
INSERT INTO bogops (nom, prenom)
VALUES ("Amelia", "Ward"),
    ("Terra", "Carpenter"),
    ("Frederick", "Flores");
