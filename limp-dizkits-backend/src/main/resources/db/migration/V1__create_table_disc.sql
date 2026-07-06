CREATE TABLE disc
(
    disc_id          UUID             NOT NULL,
    disc_title       VARCHAR(255)     NOT NULL,
    disc_description VARCHAR(255)     NOT NULL,
    disc_value       DOUBLE PRECISION NOT NULL,
    disc_amount      INTEGER          NOT NULL,
    disc_tags        TEXT[]           NOT NULL,
    disc_image       VARCHAR(255)     NOT NULL,
    disc_demo_music  VARCHAR(255),
    CONSTRAINT pk_disc PRIMARY KEY (disc_id)
);